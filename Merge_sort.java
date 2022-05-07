package zoho;
import java.util.*;
public class Merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		
		int n1,n2;
		
		System.out.print("Enter the 1st and 2nd Array Values :");
		n1=s.nextInt();
		n2=s.nextInt();
		
		int n3=n1+n2;
		
		
		int a1[]=new int[n1];
		int a2[]=new int[n2];
		int a3[]=new int[n3];
		int k=0;
		
		System.out.print("1st array :");
		for(int i=0;i<n1;i++)
		{
			a1[i]=s.nextInt();
			a3[k]=a1[i];
			k++;
		}
		
	/*	System.out.print("1st array :");
		for(int i=0;i<n1;i++)
		{
			System.out.printf("%d",a1[i]);
		} */
		int l=k;
		
		System.out.print("2nd array :");
		for(int j=0;j<n2;j++)
		{
			a2[j]=s.nextInt();
			a3[l]=a2[j];
			l++;
		}
		System.out.print("Before Sorting : \n");
		for(int i=0;i<n3;i++)
		{
			System.out.printf("%d ",a3[i]);
		} 
		int temp;
		for(int i=0;i<n3;i++)
		{
			for(int j=i+1;j<n3;j++)
			{
				if(a3[i]>a3[j])
				{
					temp=a3[i];
					a3[i]=a3[j];
					a3[j]=temp;
				}
			}
		}
		System.out.print("\nAfter Sorting : \n");
		for(int i=0;i<n3;i++)
		{
			System.out.printf("%d ",a3[i]);
		} 
		
	}

}
