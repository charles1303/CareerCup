package com.crack.interview.chap4;

public class CreateBST{
	static int cnt = 0;
	
	private class Node<E>{
		Node left,right;
		private E data;

		public Node(E data){
			this.data = data;
		}
	}

	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9};
		Node n = createTree(arr);
		inorder(n);
		System.out.println("Levels==="+findHeight(n) + " ");
	}
	

	public static Node createTree(int[] arr){
		if(arr == null || arr.length == 0) return null;
		return createTree(arr, 0, arr.length - 1);
	}

	public static Node createTree(int[] arr, int start, int end){
		
		if(start > end) {
			
			return null;
		}

		int mid = (start + end)/2;
		
		Node root = new CreateBST().new Node(arr[mid]);
		root.left = createTree(arr,start,mid-1);
		root.right = createTree(arr,mid+1,end);
		
		
		
		return root;
	}
	
	// Utility function to do inorder traversal
    static void inorder(Node node) 
    {
        if (node != null) 
        {
        	
        	System.out.println("Root==="+node.data + " ");
        	if(node.left != null)
        		System.out.println("Left==="+node.left.data + " ");
        	if(node.right != null)
        		System.out.println("Right==="+node.right.data + " ");
        	        	
            inorder(node.left);
            
            inorder(node.right);
        }
        
    }
    
    static int findHeight(Node aNode) {
        if (aNode == null) {
            return -1;
        }

        int left = findHeight(aNode.left);
        int right = findHeight(aNode.right);
        
        //return Math.abs(Math.max(left, right) + 1);
        		

        if (left > right) {
            return left + 1;
        } else {
            return right + 1;
        }
    }
}
