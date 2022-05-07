package zoho;

import java.util.Scanner;

public class Modify_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int n=s.nextInt();
			
		int arr[]=new int[n];
		int temp[]=new int[10];
		
		System.out.print("Enter values : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			temp[arr[i]]++;
		}
		System.out.println("Elements and count : ");
		for(int r=0;r<10;r++)
		{
			if(temp[r]!=0)
			{
				System.out.printf(" %d = %d \n",r,temp[r]);	
			}
		}	
	}

}
