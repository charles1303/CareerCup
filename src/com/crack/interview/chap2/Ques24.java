package com.crack.interview.chap2;

public class Ques24{

	public class Node<E>{
		private Node<E> next;
		private E data;
		
		public int getData(){
			return (int)data;
		}
		public Node(Node next, E data){
			this.next = next;
			this.data = data;
		}
	}
	public static void main(String[] args){
		
			Ques24.Node n1 = new Ques24().new Node(null,6);
			
			Ques24.Node n2 = new Ques24().new Node(n1,2);
			Ques24.Node n3 = new Ques24().new Node(n2,9);
			Ques24.Node n4 = new Ques24().new Node(n3,5);
			Ques24.Node n5 = new Ques24().new Node(n4,4);
			Ques24.Node n6 = new Ques24().new Node(n5,7);
			Ques24.Node n7 = new Ques24().new Node(n6,3);
			Ques24.Node n8 = new Ques24().new Node(n7,8);
			Ques24.Node n9 = new Ques24().new Node(n8,1);
			
			//doPartitionLinkListOrder(n9, n4);
			Node realhead = partition2(n9,5);
			
	}
	
	//singly linked list
	public static void doPartitionLinkListOrder(Node headNode, Node valNode){
		if(headNode.next == null) return;
		 Node xNode = headNode;
		 Node newNode = new Ques24().new Node(null,0);
		 
		while(xNode.next != null){
			
			System.out.println("xNode========"+xNode.getData());
			Node node = newNode;
			if(xNode.getData() < valNode.getData()){
				
				System.out.println("newNode========"+node.getData());
				newNode = xNode;
				
				newNode.next = node;
				newNode = newNode.next;
				
				
				
			}
			
				xNode = xNode.next;
		}
		
				
	}
	
	public static Node partition(Node head, int x) {
	    Node realhead = head;
	    Node iter = head;
	    while(iter != null && iter.next != null) {
	        if(iter.next.getData() < x) {
	            Node temp = iter.next;
	            iter.next = temp.next;
	            temp.next = realhead;
	            realhead = temp;
	        }
	        iter = iter.next;
	    }
	    printNodes(realhead);
	    return realhead;
	} 
	
	public static Node partition2(Node node, int x) {
	     Node beforeStart = null;
	     Node beforeEnd = null;
	     Node afterStart = null;
	     Node afterEnd = null;
	 
	    /* Partition list */
	     while (node != null) {
	         Node next = node.next;
	         node.next = null;
	         if (node.getData() < x) {
	             /* Insert node into end of before list */
	             if (beforeStart == null) {
	                 beforeStart = node;
	                 beforeEnd = beforeStart;
	                 } else {
	                     beforeEnd.next = node;
	                     beforeEnd = node;
	                 }
	             } else {
	             /* Insert node into end of after list */
	             if (afterStart == null) {
	                 afterStart = node;
	                 afterEnd = afterStart;
	             } else {
	                 afterEnd.next = node;
	                 afterEnd = node;
	             }
	         }
	         node = next;
	     }

	     if (beforeStart == null) {
	         return afterStart;
	     }

	     /* Merge before list and after list */
	     beforeEnd.next = afterStart;
	     printNodes(beforeStart);
	     return beforeStart;
	 }
	
	public static void printNodes(Node head){
		if(head == null){
			return;
		}else{
			System.out.println("Data===="+head.getData());
			printNodes(head.next);
		}
		
		
	}

}

