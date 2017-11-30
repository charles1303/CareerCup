package com.crack.interview.chap3;

public class SetOfStacks{
	
	public static void main(String[] args){
		SetOfStacks set = new SetOfStacks(3,2);
		try {
			set.push(1, 1);
			set.push(2, 1);
			//set.push(3, 1);
			set.pop(1);
			set.pop(1);
			//set.pop(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private class StackNode<E>{
		private Node<E> top;

		private class Node<E>{
			private Node<E> next;
			private E data;

			public Node(E data){
				this.data = data;
			}
		}
		
		public Object pop(){
			if(top != null){
				Node<E> item = top;
				top = top.next;
				return item;
			}
			return null;
		}

		public void push(Object item){
				Node top = new Node(item);
				top.next = this.top;
				this.top = top;
			
		}
	}

	private int arrSize = 0;
	private StackNode[] stackNodes;
	private int[] stackSizes;
	
	public SetOfStacks(int numOfStacks, int arrSize){
		this.stackNodes = new StackNode[numOfStacks];
		this.arrSize = arrSize;
		this.stackSizes = new int[numOfStacks];
		for(int i = 0; i < numOfStacks;i++){
			stackSizes[i] = -1;
			stackNodes[i] = new StackNode();
		}
		
	}

	public Object pop(int sn) throws Exception{
		if(stackSizes[sn] == -1)throw new Exception("Stack is empty");
		Object obj =  stackNodes[sn].pop();
		stackSizes[sn] -= 1; 	
		return obj;
	}

	public void push(Object item,int sn) throws Exception{
		if(stackSizes[sn] == arrSize - 1 || sn > arrSize - 1) throw new Exception("Stack is full");
		stackNodes[sn].push(item);
		stackSizes[sn] += 1;
	}

}
