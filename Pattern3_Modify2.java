package zoho;
import java.util.*;
public class Pattern3_Modify2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a;
		System.out.print("Enter value");
		a=s.nextInt();
		int j=a;
		int inc=1,dec;
		for(int i=1;i<=a*a;i++)
		{
			if(i%a==0)
			{
				dec=inc+i-1;
				System.out.print(inc);
				System.out.println();
				
				j=j+(a-1);
			}
			else
			{
				if(i>=j)
				{
					dec=inc+i-1;
					System.out.print(dec);
				}
				else
				{
					System.out.print(" ");
				}
			}
			inc++;
			//dec--;
		}

	}

}
