/**
 * 
 */
package zoho;

import java.util.Scanner;

/**
 * @author ELCOT
 *
 */
public class Pattern1 {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b=0;
		System.out.print("Enter value");
		a=s.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				if(k<i)
				{
					System.out.print(k);
				}
				else if(k==i)
				{
					System.out.print(k);
					b=k;
				}
				else
				{
					System.out.print(--b);
				}
			}
			System.out.printf("\n");
		}
	}

}
