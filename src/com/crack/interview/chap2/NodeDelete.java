package com.crack.interview.chap2;

public class NodeDelete{

	private class Node<E>{
		private Node<E> next;
		private E data;
	}
	public static void main(String[] args){

	}

	public static void deleteNode(Node delNode){
		if(delNode == null || delNode.next == null) return;
		
		Node curr = delNode.next;
		delNode.data = curr.data;
		delNode.next = curr.next.next;

		
		
	}
}
