package com.datastructures.trees;

public class PreOrderTraversalOfBinaryTree  {

	
	public static void main(String[] args) {
		
		PreOrderTraversalOfBinaryTree preOrderTraversalOfBinaryTree=new PreOrderTraversalOfBinaryTree();

		
		
		   // Now, let's start creating nodes of Binary tree
		 
        // create node1 (which is ROOT node)
		BinaryTreeNode binaryTreeNode1=new BinaryTreeNode(1);
		
		  // Left node of node1
		BinaryTreeNode node2=new BinaryTreeNode(2);
		binaryTreeNode1.leftNode=node2;
		
		  // right  node of node1
		BinaryTreeNode node3=new BinaryTreeNode(3);
		binaryTreeNode1.rightNode=node3;
		
		  // Left node of node2
		BinaryTreeNode node4=new BinaryTreeNode(4);
		node2.leftNode=node4;
		
		  // right node of node2
		BinaryTreeNode node5= new BinaryTreeNode(5);
		node2.rightNode=node5;
		
		 // Left node of node3
		BinaryTreeNode node6=new BinaryTreeNode(6);
		node3.leftNode=node6;
		
		 // right node of node3
		BinaryTreeNode node7=new BinaryTreeNode(7);
		node3.rightNode=node7;
		
		
		
	      System.out.println("Pre order Traversal of Binary Tree in java : ");
		
		preOrderTraversalOfBinaryTree.preOrderTraversalMethod(binaryTreeNode1);
		
		
	}
	

	 /**
	  * This method will do pre-order Traversal of binary tree in java.
	  * Method will pass leftNode of binary tree recursively
	  * Once leftNode child is done, pass rightNode of binary tree recursively
	  */
	 
	 public void preOrderTraversalMethod(BinaryTreeNode binaryTreeNode) {
		 
		 //continue if binaryTree node is null
		 if(binaryTreeNode!=null) {
			 
			// Display data of current binaryTreeNode.
			 System.out.print(binaryTreeNode.data+" ");
			 
			  // pass leftNode of binary tree recursively
			 preOrderTraversalMethod(binaryTreeNode.leftNode);
			 
		        // pass rightNode of binary tree recursively
			 preOrderTraversalMethod(binaryTreeNode.rightNode);
		 }
		 
	 }
}





 
 