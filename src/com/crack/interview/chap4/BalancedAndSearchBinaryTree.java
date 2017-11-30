package com.crack.interview.chap4;

public class BalancedAndSearchBinaryTree{
	
	private class Node<E>{
		private Node left,right;
		private E data;

		public Node(E data){
			this.data = data;
		}
		
		public int getData(){
			return (int)data;
		}
		
		
	}
	
	
	public static boolean checkBalanced(Node root){
		if(getBalancedHeight(root) == -1){
			return false;
		}
		return true;
	}

	public static int getBalancedHeight(Node root){
	      if (root == null)
	      {
	    	  return 0;
	      }
	 
	      int leftBalancedHeight = getBalancedHeight(root.left);
	      int rightBalancedHeight = getBalancedHeight(root.right);
	 
	      if ((Math.abs(leftBalancedHeight - rightBalancedHeight) > 1) || (leftBalancedHeight == -1) || (rightBalancedHeight == -1))
	      {
	    	  return -1;
	      }
	      
	      return Math.max(leftBalancedHeight, rightBalancedHeight) + 1;
	   }
	

	public boolean isBinarySearchTree(Node root, int min, int max) {
		if (root != null) {
			if (root.getData() > max || root.getData() < min) {
				return false;
			}
			return isBinarySearchTree(root.left, min, root.getData()) && isBinarySearchTree(root.right, root.getData(), max);
		} else {
			return true;
		}
	}
	
	int checkHeight(Node root) {
		
		if (root == null) return -1;
		 int leftHeight = checkHeight(root.left);
		if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE; // Pass error up
		
		int rightHeight = checkHeight(root.right);
		if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE; // Pass error up
		
		int heightDiff = leftHeight - rightHeight;
		
		if (Math.abs(heightDiff) > 1) {
		
		return Integer.MIN_VALUE; // Found error -> pass it back
		} else {
		
		return Math.max(leftHeight, rightHeight) + 1;
		
		}
	 }
	
	 boolean isBalanced(Node root) {
		return checkHeight(root) != Integer.MIN_VALUE;
	 }
	
	boolean checkBST(Node root) {
        boolean isBinary = checkBST(root,null,null);
        return isBinary;
    }

    boolean checkBST(Node n, Integer min, Integer max) {
        if (n == null) {
            return true;
        }
        if ((min != null && n.getData() <= min) || (max != null && n.getData() > max)) {
            return false;
        }
        if (!checkBST(n.left, min, n.getData()) || !checkBST(n.right, n.getData(), max)) {
            return false;
        }
        
        return true;
     }
}
