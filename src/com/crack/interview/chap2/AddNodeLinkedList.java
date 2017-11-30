package com.crack.interview.chap2;

public class AddNodeLinkedList{

	private class Node<E>{
		private Node<E> next;
		private E data;

		public int getData(){
			return (int)this.data;
		}
		
		public Node(Node next, E val){
			this.next = next;
			this.data = val;
		}
	}
	public static void main(String[] args){
		//7->1->6 + 5->9->2 = 2->1->9
		Node n1 = new AddNodeLinkedList().new Node(null,6);
		Node n2 = new AddNodeLinkedList().new Node(n1,1);
		Node n3 = new AddNodeLinkedList().new Node(n2,7);
		
		Node n4 = new AddNodeLinkedList().new Node(null,2);
		Node n5 = new AddNodeLinkedList().new Node(n4,9);
		Node n6 = new AddNodeLinkedList().new Node(n5,5);
		
		//add(n3,n6);
		addReverse(n3,n6);
		
	}

	public static Node add(Node n1, Node n2){
		if(n1 == null || n2 == null) return null;

		Node prev = null;
		Node curr = null;
		Node temp = null;
		int carryOver = 0;
		while(n1 != null && n2 != null){
				temp = curr;
				prev = curr;
				int sumValue = (n1.getData() + n2.getData()) + carryOver;
				curr = new AddNodeLinkedList().new Node(null,0);
				if(sumValue < 10){
					curr.data = sumValue;
					carryOver = 0;
				}else{
					curr.data = sumValue % 10;
					carryOver = sumValue/10;
				}
				curr.next = prev;
				n1 = n1.next;
				n2 = n2.next;
			
		}
		printNode(curr);
	return curr;
	

	}
	
	public static Node addReverse(Node n1, Node n2){
		if(n1 == null || n2 == null) return null;

		Node prev = new AddNodeLinkedList().new Node(null,0);
		Node curr = null;
		Node temp = null;
		int carryOver = 0;
		while(n1 != null && n2 != null){
				temp = prev;
				//prev = curr;
				int sumValue = (n1.getData() + n2.getData()) + carryOver;
				curr = new AddNodeLinkedList().new Node(null,0);
				if(sumValue < 10){
					curr.data = sumValue;
					carryOver = 0;
				}else{
					curr.data = sumValue % 10;
					carryOver = sumValue/10;
				}
				//prev.next = curr;
				temp.next = curr;
				prev = temp;
				//prev = curr;
				//prev = temp;
				n1 = n1.next;
				n2 = n2.next;
			
		}
		printNode(prev);
	return prev;
	

	}

	public static void printNode(Node head){
		if(head == null){
			return;
		}else{
			System.out.println("Data====="+head.getData());
			printNode(head.next);
		}
	}
}
