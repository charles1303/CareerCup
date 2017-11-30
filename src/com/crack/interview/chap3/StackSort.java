package com.crack.interview.chap3;


public class StackSort{

	private Stack temp;
	private Stack sorted;

	private class Stack{
		
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
				Node n = top;
				top = top.next;
				return n;
			}
			return null;
		}

		public void push(Object data){
			Node n = new Node(data);
			n.next = top;
			top = n;
		}

		public Node peek(){
			return top;
		}

		public boolean isEmpty(){
			return (top == null);
		}
	}

	public static void printStackData(Stack n){
		while(n.peek() != null){
			System.out.println("****" + n.pop().getData());
		}
	}

	public static void main(String[] args){
				
		Stack s = new StackSort().new Stack();
		s.push(12);
		s.push(6);
		s.push(10);
		s.push(11);
		s.push(1);
		s.push(9);
		s.push(3);
		s.push(2);
		s.push(5);
		s.push(7);
		s.push(8);
		s = doCall(s);
		printStackData(s);
		
		
	}

	public static Stack doCall(Stack toSort){
		Stack temp = new StackSort().new Stack();
		
		while(toSort.peek() != null){
			temp = doSubstitute(temp,toSort.pop().getData());
		}
		return temp;
	}

	
	public static Stack doSubstitute(Stack stack, int data){
		
		Stack.Node curr = stack.peek();
		if (curr == null || stack.isEmpty()){
			stack.push(data);
			return stack;
		}
		Stack.Node newNode = new StackSort().new Stack().new Node(data);

		if(newNode.getData() > curr.getData()){
			stack.push(newNode.getData());
		}else{
			Stack.Node pre = null;
			if(newNode.getData() < curr.getData()){
				pre = stack.pop();
			}
			stack = doSubstitute(stack,newNode.getData());
			stack.push(pre.getData());
		}

		return stack;
	}
	
}
