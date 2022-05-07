package zoho;
import java.util.*;
public class Relationship_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String name;
		
		String arr1[][]= {
				
				 {"John","M","Brad","Lisa"},
				 {"Emma","F","Brad","Lisa"},
				 {"Alex","M","John","Jenny"},
				 {"Emily","F","Steve","Emma"},
				 {"Rachel","F","Steve","Emma"}

				 
		};

		int row = arr1.length;
		int col = arr1[0].length;
	/*	System.out.print(row);		
		System.out.print(col);	*/
		
		System.out.print("Enter person Name : ");		
		name=s.next();
		int k=0;
		String detail[]=new String[col]; 
		
		//check name and get details
		for(int i=0;i<row;i++)
		{
			//String ch_name=arr1[i][0];
			if(name.equals(arr1[i][0]))
			{
				for(int j=0;j<col;j++)
				{
					detail[k]=arr1[i][j];
					k++;
				}				
			}
			
		}
		
		//print details
		for(int r=0;r<4;r++)
		{
			System.out.print(detail[r]+" ");
		}
		
		//check parent
		int cp=0;
		String detail_parent[]=new String[col]; 
		for(int i=0;i<row;i++)
		{
			if(detail[2].equals(arr1[i][0]) || detail[3].equals(arr1[i][0]))
			{
				for(int j=0;j<col;j++)		
				{
					detail_parent[cp]=arr1[i][j];
					cp++;
				}
			}
		}
		
		//print parent details
		for(int r=0;r<4;r++)
		{
			System.out.print(detail_parent[r]+" ");
		}
		
		
		//check gfNgm and find sis bro
		int gfNgm_FM=0;
		
		
		int gfNgm_M=0;
		String detail_gfNgm_FM[]=new String[100]; 
		String detail_gfNgm_M[]=new String[100]; 
		for(int i=0;i<row;i++)
		{
			if(detail_parent[2].equals(arr1[i][2]) && detail_parent[3].equals(arr1[i][3]))
			{
				if(arr1[i][1]=="F")
				{
					for(int j=0;j<col;j++)						
					{
						detail_gfNgm_FM[gfNgm_FM]=arr1[i][j];
						gfNgm_FM++;
					}
				}
				else if(arr1[i][1]=="M")
				{
					for(int j=0;j<col;j++)						
					{
						detail_gfNgm_M[gfNgm_M]=arr1[i][j];
						gfNgm_M++;
					}
				}
			}
		} 
		
		System.out.println("\n Female_Detail ");
		for(int r=0;r<gfNgm_FM;r++)
		{
			System.out.print(detail_gfNgm_FM[r]+" ");
		}
		System.out.println("\n Male_Detail ");
		for(int r=0;r<gfNgm_M;r++)
		{
			System.out.print(detail_gfNgm_M[r]+" ");
		}
		//sis bro family		
		int fam=0;
		String family[]=new String[50];
		
		for(int i=0;i<row;i++)
		{
//			if(detail[2]!=detail_gfNgm[0]
		}
		
		
		
	//	System.out.println();
	}

}

