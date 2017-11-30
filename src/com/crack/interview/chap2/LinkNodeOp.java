package com.crack.interview.chap2;

import com.crack.interview.chap2.Ques24.Node;

public class LinkNodeOp{

	private class Node<E>{
		private Node<E> next;
		private E data;

		public Node(Node node, E data){
			this.next = node;
			this.data = data;
		}
	}
	public static void main(String[] args){
		LinkNodeOp.Node n1 = new LinkNodeOp().new Node(null,6);
		
		LinkNodeOp.Node n2 = new LinkNodeOp().new Node(n1,2);
		LinkNodeOp.Node n3 = new LinkNodeOp().new Node(n2,9);
		LinkNodeOp.Node n4 = new LinkNodeOp().new Node(n3,5);
		LinkNodeOp.Node n5 = new LinkNodeOp().new Node(n4,4);
		LinkNodeOp.Node n6 = new LinkNodeOp().new Node(n5,7);
		LinkNodeOp.Node n7 = new LinkNodeOp().new Node(n6,3);
		LinkNodeOp.Node n8 = new LinkNodeOp().new Node(n7,8);
		LinkNodeOp.Node n9 = new LinkNodeOp().new Node(n8,1);
		
		replaceNode(n9);
	}

	public static void replaceNode(Node head){
		if(head.next == null) return;
		if(head.next.next == null){
			Node n3 = head;
			n3.next = null;
			head = head.next;
			head.next = n3;
			return;
		}
		Node n = head;
		while(n.next != null){
			System.out.println("My data 1==="+n.data);
			if(n.next.next == null){
				System.out.println("My data==="+n.next.data);
				Node n1 = n;
				n = n.next;
				n1.next = null;
				n.next = n1;
				System.out.println("My data==="+n.data);
				System.out.println("My data==="+n.next.data);
			}
			n = n.next;
		}

		while(n != null){
			System.out.println(n.data);
			n = n.next;
		}
	
	}
}
