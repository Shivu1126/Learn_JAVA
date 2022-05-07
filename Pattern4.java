package zoho;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("Enter value : ");
		n=s.nextInt();
		int i,j,inc,dec=0;
		int p=1;
		int a;
		inc=1;
		dec=0;
		for(i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			
//			p=dec+inc+i-1;
			for(j=1;j<=n;j++)
			{		
				
				System.out.print(p);
				p++;
			}
	//		dec=p+n-1;
			System.out.println();
		}
	}

}
