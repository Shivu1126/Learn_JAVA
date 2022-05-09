import java.io.*;
import java.util.*;

public class HashMap__ {

	map head; // head of list

	static class map {

		int key,value;
		map next;

		// Constructor
		map(int k,int v)
		{
			key=k;
			value=v;
			next = null;
		}
	}
		
			
	//insert
	public static HashMap__ insert(HashMap__ l, int k,int v)
	{
		//create
		map new_map = new map(k,v);
		
		if (l.head == null)
		{
			l.head = new_map;
		}
		else
		{
			map temp = l.head;
			while (temp.next != null)
			{
				temp = temp.next;
				if(temp.key==k) 
				{
					System.out.println("---The key was already exist----");
					System.out.println("The value was not inserted");
					return l;
				}
			}
			temp.next = new_map;
		}

		// return the list 
		return l;
	}
	
	// remove
	public static HashMap__ remove(HashMap__ list,int k)
	{
		//store head
		map currNode = list.head;
		map prev = null;
		
		//head		
		if (currNode != null && currNode.key == k) 
		{
			list.head = currNode.next; // Changed head			
			System.out.println(k + " found and deleted");
			
			return list;
		}	
		// somewhere
		while (currNode != null && currNode.key != k)
		{
			prev = currNode;
			currNode = currNode.next;
		}		
		if (currNode != null) 
		{
			prev.next = currNode.next;
			System.out.println(k + " found and deleted");
		}				
		//not present
		if (currNode == null) 
		{
			System.out.println(k + " not found ");
		}		
		// return the List
		return list;
	}

	//print list
	public static void printList(HashMap__ list)
	{
		map currMap = list.head;
		System.out.print("List : ");
	
		while (currMap != null)
		{			
			System.out.println(currMap.key+ " "+currMap.value+" ");
			currMap = currMap.next;
		}
	}	
	
	// main
	public static void main(String[] args)
	{
		HashMap__ list = new HashMap__();
		Scanner s=new Scanner(System.in);
		int option;
		
		System.out.println("Your options : ");
		System.out.println("1 : Insert ");
		System.out.println("2 : Remove");
		System.out.println("3 : Display");
		
		
		int rep=1;
		
		do 
		{
			System.out.println("Choose 1 or 2 or 3 : ");		
			option=s.nextInt();
			
			switch(option)
			{
				case 1:
					System.out.println("Enter key and value : ");
					int a=s.nextInt();
					int b=s.nextInt();
					list=list.insert(list,a,b);
					break;
				case 2:
					int c;
					System.out.println("Enter key :");
					c=s.nextInt();
					list=list.remove(list,c);
					break;
				case 3:
					
					printList(list);
					break ;
				default:
					System.out.println("Enter proper input....");
			}
			
			System.out.println("Do you want continue..Press \"1\"..");
			rep=s.nextInt();
		}while(rep==1);
		
	}
}