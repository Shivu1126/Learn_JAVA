package zoho;

import java.util.Scanner;

class Node {
  Node left;
  Node right;
  int data;
  int cnt=1;
}

class BST {
  
  public Node insert(Node node, int val) {
    if(node == null) {
      return createNewNode(val);
    }
    //move left
    if(val < node.data) 
    {
      node.left = insert(node.left, val);      
    }
    //move right
    else if((val > node.data))
    {
      node.right = insert(node.right, val);
    }
    //count increement
    if(val==node.data)
    {
    	node.cnt++;

    }
    return node;
  }
  
  public Node createNewNode(int k) {
    Node a = new Node();
    a.data = k;
    a.left = null;
    a.right = null;
    return a;
  }
  
  
  public void Display(Node node) {
	    if(node == null) {
	      return;
	    }
	    
	    /* 	System.out.print(node.data + " "+ node.cnt+"\n");
	    	Display(node.left);
	    	Display(node.right); */
	    //	System.out.print("elements and freq");
		if (node.cnt > 1)
		{
			System.out.print((node.data +" = "+ node.cnt+"\n"));
		}
/*		 else
		 {
				System.out.print((node.data +" "+ node.cnt+"\n"));
		 }	 */
		 Display(node.left);
		 Display(node.right); 
		
	  }
}


public class Find_dub_modify{

  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    BST a = new BST();
    Node root = null;
    int n;
    System.out.print("Enter n values : ");
    n=s.nextInt();
  //  int a[]=new int[10];
    System.out.println("Enter the values : ");
    for(int i=0;i<n;i++)
    {
    	int shiv=s.nextInt();
    	root = a.insert(root, shiv);
    }
    
   /* root = a.insert(root, 5);
    root = a.insert(root, 4);
    root = a.insert(root, 1);
    root = a.insert(root, 5);
    root = a.insert(root, 5);
    root = a.insert(root, 6);
    root = a.insert(root, 2);
    root = a.insert(root, 1);
    root = a.insert(root, 4);
    root = a.insert(root, 2); 
    
    */
	System.out.print("Element = Count\n");
	System.out.print("---------------\n");
    a.Display(root);
 }

}
