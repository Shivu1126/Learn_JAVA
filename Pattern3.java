package zoho;
import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("Enter value : ");
		n=s.nextInt();
		int a=1,b=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			if(i%2==0)
			{
				int rev=a+b-1;
				for(int k=0;k<i;k++)
				{
					System.out.print( rev-- +" " );
					b++;
				}
			}
			else
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(b +" ");
					b++;
				}
			}
			System.out.println();
			a++;
		}
	}

}
