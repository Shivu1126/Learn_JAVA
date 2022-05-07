package zoho;
import java.util.*;
public class Find_dub_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int n=s.nextInt();
			
		int arr[]=new int[n];
		int temp[]=new int[n];
		
		System.out.print("Enter values : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			temp[i]=-1;
		}
		int times;
		for(int i=0;i<n;i++)
		{
			times=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					temp[j]=0;
					times++;
				}
			}
			if(temp[i]!=0)
			{
				temp[i]=times;
			}
		}

		System.out.println("Elements and count : ");
		for(int r=0;r<n;r++)
		{
			if(temp[r]!=0)
			{
				System.out.printf(" %d = %d \n",arr[r],temp[r]);	
			}
		}		
	}

}
