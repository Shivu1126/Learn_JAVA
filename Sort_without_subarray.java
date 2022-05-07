package zoho;
import java.util.*;
public class Sort_without_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n1,n2;
		
		System.out.print("Enter the 1st and 2nd Array Values :");
		n1=s.nextInt();
		n2=s.nextInt();
		
		int a1[]=new int[n1];
		int a2[]=new int[n2];

		System.out.print("1st array :");
		for(int i=0;i<n1;i++)
		{
			a1[i]=s.nextInt();
		}
		System.out.print("2nd array :");
		for(int i=0;i<n2;i++)
		{
			a2[i]=s.nextInt();
		}
		
		int temp=0;
		
		//1st arr sorting____
		for(int i=0;i<n1;i++)
		{
			for(int j=i+1;j<n1;j++)
			{
				if(a1[i]>a1[j])
				{
					temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
			}
		}
		
		//2nd arr sorting____
		for(int i=0;i<n2;i++)
		{
			for(int j=i+1;j<n2;j++)
			{
				if(a2[i]>a2[j])
				{
					temp=a2[i];
					a2[i]=a2[j];
					a2[j]=temp;
				}
			}
		}  
		
		//sorted_and_store___
		int i=0,j=0,k=0;

		int n3=n1+n2;
		int a3[]=new int[n3];
		
		while(i<n1 && j<n2)
		{
			if(a1[i]<a2[j])
			{
				a3[k++]=a1[i++];
			}
			else
			{
				a3[k++]=a2[j++];
			}
		}
		
		//remainder_store___
		while(i<n1)
		{
			a3[k++]=a1[i++];
		}
		while(j<n2)
		{
			a3[k++]=a2[j++];
		}
		
		//print_result
		System.out.println("Sorted_merge");
		for(int r=0;r<k;r++)
		{
			System.out.print(a3[r]+" ");
		}
	
	}

}
