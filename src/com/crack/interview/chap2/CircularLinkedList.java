package com.crack.interview.chap2;

import java.util.HashMap;
import java.util.Map;

public class CircularLinkedList{
	private class Node<E>{
		private Node<E> next;
		private E data;

		public Node(Node next, E data){
			this.next = next;
			this.data = data;
		}
	}

	public static void main(String[] args){
		//7->1->6 + 5->9->2 = 2->1->9
				Node n1 = new CircularLinkedList().new Node(null,6);
				Node n2 = new CircularLinkedList().new Node(n1,1);
				Node n3 = new CircularLinkedList().new Node(n2,7);
				
				Node n4 = new CircularLinkedList().new Node(null,2);
				
				Node n5 = new CircularLinkedList().new Node(n4,9);
				Node n6 = new CircularLinkedList().new Node(n5,5);
				Node n7 = new CircularLinkedList().new Node(n6,9);
				
				//add(n3,n6);
				checkCircular(n6);
	}

	public static <E> void checkCircular(Node head){
		if(head == null) return;
		Map<E, Node> map = new HashMap<>();		
		while(head != null){
			if(map.containsKey(head.data)){
				System.out.println("Entry "+head.data+" already exists");
				return;
			}else{
				map.put((E) head.data,head.next);
			}

			head = head.next;
		}
	}
	
	public static boolean checkCircular2(Node head){
		Node firstStart = head;
		Node secondStart = head;

		while(firstStart != null && firstStart.next != null){
			firstStart = firstStart.next.next;
			secondStart = firstStart.next;

			if(firstStart == secondStart) return true;
		}

		return false;
	}
}
