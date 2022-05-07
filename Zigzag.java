package zoho;
import java.util.*;
public class Zigzag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		int a=0;
		int tem=1;
		System.out.print("Enter n value : ");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n;k++)
			{
				a=a+tem;
				System.out.print(a+" ");
			}
			a=a+n+tem;
			tem=-tem;
			System.out.println();
			
		}
	}

}
