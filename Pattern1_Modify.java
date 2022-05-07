package zoho;

import java.util.*;

public class Pattern1_Modify {

	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("Enter value");
		n=s.nextInt();
		long t=1,x=1;
		int a=0;
		String st=" ";
	
		for(int i=1;i<=n;i++)
		{
			a=n-i;
			if(a!=0)
			{
				System.out.printf("%"+a+"s",st);
			}
			System.out.print(x);
			t=(t*10)+1;
			x=t*t;
			System.out.printf("\n");
		}
		Pattern1_Modify obj=new Pattern1_Modify();
	}

}
