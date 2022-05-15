package billsys;
import java.util.*;
public class Bill {

	static List<bill_detail> billDetail = new ArrayList<bill_detail>();
	 static Scanner s = new Scanner(System.in);
	 static int bill_id=0;

	 static List<item_list> product_details = new ArrayList<item_list>();
	 //String item_name,int item_id,int stack,int price
	 
	 static List<customer_list> customer_details = new ArrayList<customer_list>();

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 product_details.add(new item_list("Badam",1,100,65));
		 product_details.add(new item_list("Kitkat",2,100,20));
		 product_details.add(new item_list("Pen",3,100,15));
		 product_details.add(new item_list("Horlicks",4,100,80));
		 product_details.add(new item_list("Chips",5,100,50));

		 customer_details.add(new customer_list("Shiv",11));
		 customer_details.add(new customer_list("Saro",12));
		 customer_details.add(new customer_list("Harish",13));
		 customer_details.add(new customer_list("Kavis",14));
		 customer_details.add(new customer_list("Vk",15));
		 
		char repeat_function;
		int function_option;
		do {
			
			System.out.println("Your options :");
			System.out.println("1.Bill Craete");
			System.out.println("2.Search Bill");
			System.out.println("3.Search customer's Bill");
			System.out.println("4.Items stack details");
			System.out.println("5.Customer List");
			System.out.println("Enter option : ");
			function_option=s.nextInt();
			
			switch(function_option)
			{
			
			case 1:
				create_bill();
				break;
				
			case 2:
				search_bill();
				break;
			case 3:
				search_customers_bill();
				break;
			case 4:
				stack_detail();
				break;
			case 5:
				sales_detail();
				break;
			default:
				System.out.println("Enter proper input....");	
			}
				System.out.println("If you want reapeat function pls press \'y\'");
				repeat_function=s.next().charAt(0);
			}while(repeat_function=='y');
	}
	
	public static void create_bill(){
		char repeat_invoice;

		do {
			int totprice=0;
		
			String name;
			int qty;
			int q_price;
			int price;
			int opt;
			String cus_name="";
			int cus_id=0;
			char repeat_line;
			int choose_customer;
			
			System.out.println("Customer List : ");
			System.out.println("1.Shiv\n2.Saro\n3.Harish\n4.Kavis\n5.Vk");
			System.out.println("Choose Customer :");
			choose_customer=s.nextInt();
			
			customer_list customer=customer_details.get(choose_customer-1);

			cus_name=customer.customer_name;
			cus_id=customer.customer_id;
		
			
			List<line_det> items_detail = new ArrayList<line_det>();

			do {
				System.out.println("Product details : ");
				System.out.println("1.Badam\n2.Kitkat\n3.Pen\n4.Horlicks\n5.Chips");
				System.out.println("Enter product number :");
				opt=s.nextInt();
				item_list item = product_details.get(opt-1); 
		
				name=item.item_name;
				price = item.price;
				System.out.println("Quantity");
				qty = s.nextInt();
				
				q_price = price*qty;
				totprice = totprice + q_price;
				item.stack=item.stack-qty;
				
				items_detail.add(new line_det(name,qty,price,q_price));
				
				
				System.out.println("If you want purchase another product..pls press \'y\'");
				repeat_line=s.next().charAt(0);
			 }while(repeat_line=='y');
			
			 bill_id++;
			 System.out.println("Customer Name : "+cus_name+"\t\t\t\tBill ID:" +bill_id);
			 System.out.println("Customer Id : "+cus_id);
			 System.out.println("----------------------------------------------------------------------------------------------------");  
		     System.out.println("Product_Name  \tQuantity    \tRate    \tTotal Price");  
		     System.out.println("----------------------------------------------------------------------------------------------------");  
			 for(line_det b : items_detail) {
				 b.display();
			 }
		     System.out.println("----------------------------------------------------------------------------------------------------");  
			 System.out.println("\t\t\t\t\t\tTotal Amount = " + totprice);
			//int i=0;
			 billDetail.add(new bill_detail(cus_name,cus_id,bill_id,totprice, items_detail));
			
			
			System.out.println("Next customer....pls press \'y\'");
			repeat_invoice=s.next().charAt(0);
			 
		}while(repeat_invoice=='y');
	}
	
	public static void sales_detail() {
		System.out.println("Customer Name\t\tCustomer Id\t\tTotal sales Amount ");
		System.out.println("------------------------------------------------------------");
		for(customer_list cl : customer_details) {
			int sales_amount=0;
			for(bill_detail b : billDetail) {
				if(b.cus_id==cl.customer_id) {
						sales_amount=sales_amount+b.totalamount;
				}
			}
			System.out.println(cl.customer_name +"\t\t\t"+cl.customer_id+"\t\t"+sales_amount);
		}
	}
	
	public static void stack_detail() {
		System.out.println("Item Name\t\tItem Stack");
		System.out.println("------------------------------------------------------------");
		for(item_list b :product_details) {
			System.out.println(b.item_name +"\t\t\t"+b.stack);
		}
	}
	
	public static void search_bill(){
		int search_bill_id;
		char search_bill_repeat;
		do {
		System.out.println("Enter bill id : ");
		search_bill_id=s.nextInt();
		
		 for(bill_detail b : billDetail) {
			 if( b.bill_id==search_bill_id)
			 {
				 b.display_bill_detail();
			 }
		 }
		 System.out.println("If you want continue bill search ..press \'y\'");
		 search_bill_repeat=s.next().charAt(0);
		}while(search_bill_repeat=='y');
	}
	
	public static void search_customers_bill(){
		int search_cus_id;
		char search_bill_repeat;
		do {
		System.out.println("Enter customer id : ");
		search_cus_id=s.nextInt();
		
		 for(bill_detail b : billDetail) {
			 if( b.cus_id==search_cus_id)
			 {
				 b.display_bill_detail();
			 }
		 }
		 System.out.println("If you want continue bill search ..press \'y\'");
		 search_bill_repeat=s.next().charAt(0);
		}while(search_bill_repeat=='y');
	}
	
}
class customer_list
{
	String customer_name;
	int customer_id;
	customer_list(String customer_name,int customer_id)
	{
		this.customer_name=customer_name;
		this.customer_id=customer_id;		
	}
}
class item_list{
	String item_name;
	int item_id;
	int stack;
	int price;
	item_list(String item_name,int item_id,int stack,int price){
		this.item_name=item_name;
		this.item_id=item_id;
		this.stack=stack;
		this.price=price;
	}
}
class line_det
{
	
	String pname;
	int quantity;
	int price;
	int totprice;
	
	line_det(String pname,int quantity,int price,int totprice)
	{
		this.pname=pname;
		this.quantity=quantity;
		this.price=price;
		this.totprice=totprice;
	}

	public void display()
	{
		System.out.printf("%s \t\t %d \t\t %d \t\t %d\n",pname,quantity,price,totprice);
	}
}
class bill_detail
{
	String cus_name;
	int cus_id;
	int bill_id;
	int totalamount;
	
	List<line_det> line_items;
	bill_detail(String cus_name,int cus_id,int bill_id,int totalamount,List<line_det> line_items)
	{
		this.cus_name=cus_name;
		this.cus_id=cus_id;
		this.bill_id=bill_id;
		this.totalamount=totalamount;
		this.line_items=line_items;
	}

	public void display_bill_detail()
	{
		
		System.out.println("-------------------------------------------------------------------------");  
		System.out.printf(" Customer Name : %s\t\t\t\t\t Bill Id : %d\n",cus_name,bill_id);
		System.out.printf(" Customer Id   : %d\n",cus_id);
		System.out.println("-------------------------------------------------------------------------");  
		System.out.println("Product_Name  \tQuantity    \tRate    \tTotal Price");  
		System.out.println("-------------------------------------------------------------------------");  
		
		for(line_det b : line_items) {
			 b.display();
		}
		System.out.println("--------------------------------------------------------------------------");  
		System.out.println("\t\t\t\t\t\tTotal Amount = " + totalamount);
		System.out.println("--------------------------------------------------------------------------");  

	}
	
}
