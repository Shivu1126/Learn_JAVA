package zoho;

import java.util.Scanner;

public class Pattern1_Modify3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b=0;
		System.out.print("Enter value");
		a=s.nextInt();
	
		int x=0;
		int n=(a*2)-1;
		int z=1;
		for(int i=1;i<=n*a;i++)
		{
			if(i%n==0)
			{
				System.out.print("*");
				System.out.println();
			}
			else
			{
				
				if(i%n==a )
				{
					System.out.print(z);
					z++;
				}
				else
				{
					System.out.print("*");
				}								
			}
		}
	}

}
