package com.crack.interview.chap3;

public class StackImpl2{
	private Node top;
	
	private class Node<E>{
		private Node<E> next;
		private E data;

		public Node(E data){
			this.data = data;
		}
		
		public int getData(){
			return (int)data;
		}
	}

	public Node pop(){
		if(top != null){
			Node obj = top;
			top = top.next;
			return obj;
		}
		return null;
	}

	public void push(Object item){
		Node it = new Node(item);
		Node top = pop();
		Node tmp = top;
		if(it.getData() < top.getData()){
			it.next = tmp;
			top = it;
		}else{
			it.next = top.next;
			top.next = it;
			
		}
	
	}

	public Object min(){
		return pop();
	}
}
