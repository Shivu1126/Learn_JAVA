package zoho;
import java.util.*;
public class Relationship_Modify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String name;
		String arr[][]= {
				{"Vikram","M","Vijay","Rani"},
				{"David","M","Ajith","Shalini"},
				{"Karthika","F","Yogi","Lakshmi"},
				{"Vijay","M","Surya","Jothi"},
				{"Priya","F","Surya","Jothi"},
				{"Shalini","F","Kamal","Rathika"},
				{"Simbu","M","Kamal","Rathika"},
				{"Mathi","F","Sundhar","Priya"},
				{"Angel","F","Simbu","Ananthi"},
				{"Lakshmi","F","Prabhakaran","Gayu"},
				{"Raja","M","Manoj","Emy"},
				{"Manoj","M","Prabhakaran","Gayu"},
				{"Gayu","F","Karan","Maya"}				
		};	
				
		int row = arr.length;
		int col = arr[0].length;
		
		System.out.print("Enter person Name : ");		
		name=s.next();
		int k=0;
		
		//person_details
		String detail[]=new String[col]; 
		for(int i=0;i<row;i++)
		{
			if(name.equals(arr[i][0]))
			{
				for(int j=0;j<col;j++)
				{
					detail[k]=arr[i][j];
					k++;
				}				
			}
			
		}
		
		for(int i=0;i<col;i++)
		{
			System.out.print(detail[i] + " ");
		}
		
		//person parent details
		int cp=0;
		String detail_parent[]=new String[col]; 
		for(int i=0;i<row;i++)
		{
			if(detail[2].equals(arr[i][0]) || detail[3].equals(arr[i][0]))
			{
				for(int j=0;j<col;j++)		
				{
					detail_parent[cp]=arr[i][j];
					cp++;
				}
			}
		}
		
		for(int r=0;r<col;r++)
		{
			System.out.print(detail_parent[r]+" ");
		}
		//
		
		int gfNgm_FM=0;
		
		
		int gfNgm_M=0;
		String detail_gfNgm_FM[]=new String[100]; 
		String detail_gfNgm_M[]=new String[100]; 
		for(int i=0;i<row;i++)
		{
			if(detail_parent[2].equals(arr[i][2]) && detail_parent[3].equals(arr[i][3]))
			{
				if(arr[i][1]=="F")
				{
					for(int j=0;j<col;j++)						
					{
						detail_gfNgm_FM[gfNgm_FM]=arr[i][j];
						gfNgm_FM++;
					}
				}
				else if(arr[i][1]=="M")
				{
					for(int j=0;j<col;j++)						
					{
						detail_gfNgm_M[gfNgm_M]=arr[i][j];
						gfNgm_M++;
					}
				}
			}
		} 
		
		if(detail_parent[1]=="F")
		{
			if(detail_gfNgm_M[1]=="M")
			{
				for(int r=0;r<gfNgm_M;r++)
				{
					System.out.print(detail_gfNgm_M[r]+" ");
				}
			}
		}
		if(detail_parent[1]=="M")
		{
			if(detail_gfNgm_FM[1]=="F")
			{
				for(int r=0;r<gfNgm_FM;r++)
				{
					System.out.print(detail_gfNgm_FM[r]+" ");
				}
			}
		}
		
		int op=0;
		String result[]=new String[10];
		for(int i=0;i<row;i++)
		{
			if(detail_gfNgm_M[0]==arr[i][2] || detail_gfNgm_FM[0]==arr[i][3] )
			{
				for(int j=0;j<col;j++)
				{
					result[op]=arr[i][j];
					op++;
				}
			}
		}
		
		System.out.println("\nResult : ");
		for(int i=0;i<op;i++)
		{
			System.out.print(result[i]+" ");
		}  
	}

}
