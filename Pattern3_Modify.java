package zoho;

import java.util.Scanner;

public class Pattern3_Modify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("Enter value : ");
		n=s.nextInt();
		int i,j,inc,dec=0;
		
		String str=" ";
		int a;
		inc=1;
		for(i=1;i<=n;i++)
		{
			a=n-i;
			if(a!=0)
			{
				System.out.printf("%"+a+"s",str);
			}
			
			dec=inc+i-1;
			for(j=1;j<=i;j++)
			{
				
				if(i%2==1)
				{
					System.out.print(inc);
				}
				else
				{
					System.out.print(dec);
				}
				inc++;
				dec--;
			}
			System.out.println();
		}
	//	System.out.print(dec);
	//	System.out.print(inc);
	}

}
