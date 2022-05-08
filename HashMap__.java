import java.io.*;
import java.util.*;

// a Singly Linked List
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
		
	public static HashMap__ remove(HashMap__ list,int k)
	{
		//Store head
		map currNode = list.head, prev = null;
		
		
	
		//If head node itself holds the key to be deleted
		
		if (currNode != null && currNode.key == k) 
		{
			list.head = currNode.next; // Changed head
			
			// Display the message
			System.out.println(k + " found and deleted");
			
			
			return list;
		}
		
		
		// If the key is somewhere other than at head
		
		// Search for the key to be deleted,
		// keep track of the previous node
		// as it is needed to change currNode.next
		while (currNode != null && currNode.key != k)
		{
			// If currNode does not hold key
			// continue to next node
			prev = currNode;
			currNode = currNode.next;
		}
		
		// If the key was present, it should be at currNode
		// Therefore the currNode shall not be null
		if (currNode != null) 
		{
			// Since the key is at currNode
			// Unlink currNode from linked list
			prev.next = currNode.next;
			
			// Display the message
			System.out.println(k + " found and deleted");
		}
				
		// CASE 3: The key is not present

		// If key was not present in linked list
		// currNode should be null
		if (currNode == null) 
		{
		// Display the message
			System.out.println(k + " not found ");
		}
		
		// return the List
		return list;
	}
			
	// Method to insert a new node
	public static HashMap__ insert(HashMap__ l, int k,int v)
	{
		// Create a new node with given data
		map new_map = new map(k,v);
		//new_map.next = null;

		// If the List is empty,
		// then make the new node as head
		if (l.head == null)
		{
			l.head = new_map;
		}
		else
		{
			// Else traverse till the last node
			// and insert the new_node there
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

			// Insert the new_node at last node
			temp.next = new_map;
		}

		// Return the list by head
		return l;
	}

	// Method to print the LinkedList.
	public static void printList(HashMap__ list)
	{
		map currMap = list.head;
	
		System.out.print("List : ");
	
		// Traverse through the List
		while (currMap != null)
		{
			// Print the data at current node
			System.out.print(currMap.key+ " "+currMap.value+" ");
	
			// Go to next node
			currMap = currMap.next;
		}
	}
	
	// Driver code
	public static void main(String[] args)
	{
		HashMap__ list = new HashMap__();
		Scanner s=new Scanner(System.in);
		int option;
		
		System.out.println("Your options : ");
		System.out.println("1 : Insert ");
		System.out.println("2 : Display");
		System.out.println("3 : Remove");
		
		
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