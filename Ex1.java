import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		HashMapFun hp=new HashMapFun();

		int option;
		
		System.out.println("Your options : ");
		System.out.println("1 : Insert ");
		System.out.println("2 : Display");
		System.out.println("3 : Remove");
		
		
		int rep=1;
		
		do {
			System.out.println("Choose 1 or 2 or 3 : ");		
			option=s.nextInt();
			
			switch(option)
			{
			case 1:
				System.out.println("Enter key and value : ");
				int a=s.nextInt();
				int b=s.nextInt();
				hp.insert(a,b);
				break;
			case 2:
				int c;
				System.out.println("Enter key :");
				c=s.nextInt();
				hp.dis(c);
				break;
			case 3:
				int d;
				System.out.println("Enter key :");
				d=s.nextInt();
				hp.delete(d);
				break ;
			default:
				System.out.println("Enter proper input....");
			}
			
			System.out.println("Do you want continue..Press \"1\"..");
			rep=s.nextInt();
		}while(rep==1);
	
	//	hp.insert(1, 19);
	//	System.out.print(hp.dis(1));
	//	hp.delete(1);
	//	System.out.print(hp.dis(1));
	}
}


class HashMapFun {

        int[] map;

        //Initialization of the hashmap
        public HashMapFun() {
            map = new int[1000];
            Arrays.fill(map,0);
        }
        
        //Insert values
        public void insert(int key, int value) {
            map[key] = value;
        }

       //Display   
        public void dis(int key) {
        	if(map[key]!=0)
        		System.out.println("Key = "+key+ " Value = "+map[key]);
        	else
        		System.out.println("!.....Empty.....!");
        }
        //Remove
        public void delete(int key) {
        	
        	map[key] = 0;
        }

}