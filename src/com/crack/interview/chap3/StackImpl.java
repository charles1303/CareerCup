package com.crack.interview.chap3;

public class StackImpl{
	
	private Node top;
	private class Node<E>{
		private Node<E> next;
		private E data;

		public Node(E data){
			this.data = data;
		}
	}

	public Object pop(){
		if(top != null){
			Object item = top.data;
			top = top.next;
			return item;
		}
		return null;
	}

	public void push(Object item){
		if(top != null){
			Node tmp = new Node(item);
			tmp.next = top;
			top = tmp;
		}
	}
}

