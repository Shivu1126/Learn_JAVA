package zoho;

//Java implementation of
//the above approach
import java.util.*;

class GFG
{

//Node in the tree where
//data holds the character
//of the String and cnt
//holds the frequency
static class node
{
	char data;
	int cnt;
	node left, right;
};

//Function to add a new
//node to the Binary Tree
static node add(char data)
{

	// Create a new node and
	// populate its data part,
	// set cnt as 1 and left
	// and right children as null
	node newnode = new node();
	newnode.data = data;
	newnode.cnt = 1;
	newnode.left = newnode.right = null;

	return newnode;
}

//Function to add a node
//to the Binary Tree in
//level order
static node addinlvlorder(node root, char data)
{

	if (root == null)
	{
		return add(data);
	}
	
	// Use the queue data structure
	// for level order insertion
	// and push the root of tree to Queue
	Queue<node> Q = new LinkedList<node>();
	Q.add(root);

	while (!Q.isEmpty())
	{

		node temp = Q.peek();
		Q.remove();

		// If the character to be
		// inserted is present,
		// update the cnt
		if (temp.data == data)
		{
			temp.cnt++;
			break;
		}
		
		// If the left child is
		// empty add a new node
		// as the left child
		if (temp.left == null)
		{
			temp.left = add(data);
			break;
		}
		else
		{
			// If the character is present
			// as a left child, update the
			// cnt and exit the loop
			if (temp.left.data == data)
			{
				temp.left.cnt++;
				break;
			}
			
			// Add the left child to
			// the queue for further
			// processing
			Q.add(temp.left);
		}
		
		// If the right child is empty,
		// add a new node to the right
		if (temp.right == null)
		{
			temp.right = add(data);
			break;
		}
		else
		{
			// If the character is present
			// as a right child, update the
			// cnt and exit the loop
			if (temp.right.data == data)
			{
				temp.right.cnt++;
				break;
			}
			
			// Add the right child to
			// the queue for further
			// processing
			Q.add(temp.right);
		}
	}

	return root;
}

//Function to print the
//level order traversal of
//the Binary Tree
static void printlvlorder(node root)
{

	// Add the root to the queue
	Queue<node> Q = new LinkedList<node>();
	Q.add(root);

	while (!Q.isEmpty())
	{
		node temp = Q.peek();
		
		// If the cnt of the character
		// is more then one, display cnt
		if (temp.cnt > 1)
		{
			System.out.print((temp.data +""+ temp.cnt));
		}
		
		// If the cnt of character
		// is one, display character only
		else
		{
			System.out.print((char)temp.data);
		}
		Q.remove();
		
		// Add the left child to
		// the queue for further
		// processing
		if (temp.left != null)
		{
			Q.add(temp.left);
		}
		
		// Add the right child to
		// the queue for further
		// processing
		if (temp.right != null)
		{
			Q.add(temp.right);
		}
	}
}

//Driver code
public static void main(String[] args)
{

	String s = "geeksforgeeks";
	node root = null;

	// Add individual characters
	// to the String one by one
	// in level order
	for (int i = 0; i < s.length(); i++)
	{
		root = addinlvlorder(root, s.charAt(i));
	}

	// Print the level order
	// of the constructed
	// binary tree
	printlvlorder(root);

}
}

//This code is contributed by Rajput-Ji
