package zoho;

import java.util.Scanner;

public class Pattern2_Modify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a;
		System.out.print("Enter value");
		a=s.nextInt();
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
