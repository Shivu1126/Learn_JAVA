package zoho;
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a;
		System.out.print("Enter value");
		a=s.nextInt();
	
	/*	for(int i=a;i>=1;i--)
		{
			int b=1;
			for(int j=1;j<=i-1;j++)
			{
				System.out.printf(" ");
			}
			for(int k=i;k<=a;k++)
			{
				System.out.print(b);
				b++;
			}
			System.out.println();
		} */
		
	/*	for(int i=a;i>=1;i--)
		{
			int b=1;
			for(int j=1;j<=a;j++)
			{
				
				if(i<=j)
				{
					System.out.print(b);
					b++;
				}
				else
				{
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		} */
	//	int t=1,b=1,c=1,d=1;
	/*	for(int i=1;i<=a*a;i++)
		{
			
			if(i%a==0) 
			{
				
				System.out.print(t);		
				System.out.println();
				t++;
			}
			else if(i>=a && i%a==a-1)
			{
				System.out.print(b);	
				b++;
			}
			else if(i>a*2 && i%a==a-2)
			{
				System.out.print(c);	
				c++;
			}
			else if(i>a*3 && i%a==a-3)
			{
				System.out.print(d);
				d++;
			}  */
		/*	else if(i%a==a-1)
			{
				System.out.print(t);		
			} */
		int j=a;
		for(int i=1;i<=a*a;i++)
		{
			if(i%a==0)
			{
				System.out.print(i-j+1);
				System.out.println();
				
				j=j+(a-1);
			}
			else 
			{
				if(i>=j)
				{
					System.out.print(i-j+1);
				}
				else
				{
				System.out.print(" ");
				}
			}
		}
	}
}
