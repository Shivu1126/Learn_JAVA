package zoho;
import java.util.*;
public class Pattern1_Modify2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b=0;
		System.out.print("Enter value");
		a=s.nextInt();
	
		int x=0;
		String st=" ";
		for(int i=1;i<=a;i++)
		{			
			x=a-i;
			if(x!=0)
			{
				System.out.printf("%"+x+"s",st);
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
