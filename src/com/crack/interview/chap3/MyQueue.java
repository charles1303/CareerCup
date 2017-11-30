package com.crack.interview.chap3;

public class MyQueue{
	private Node first, last;
	
	private class Node<E>{
		private Node<E> next;
		private E data;

		public Node(E data){
			this.data = data;
		}
	}

	public void enqueue(Object data){
		if(first == null){
			Node n = new Node(data);
			last = n;
			first = last;
		}else{
			Node n = new Node(data);
			last.next = n;
			last = last.next;
		}
	}

	public Object dequeue(){
		if(first != null){
			Node n = first;
			first = first.next;
			return n;
		}
		return null;
	}
}
