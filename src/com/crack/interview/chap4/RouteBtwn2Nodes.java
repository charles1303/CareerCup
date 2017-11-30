package com.crack.interview.chap4;

public class RouteBtwn2Nodes{

	private Node n;	
	
	public class Node<E>{
		private Node next;
		private Node[] childNodes;
		private E data;
		private boolean visited;
		private Node[] adjacent;

		public Node(E data){
			this.data = data;
		}
		
		public int getData(){
			return (int)this.data;
		}
	}

	public class Queue{
		private Node first,last;

		public void enqueue(Object item){
			if(first == null){
				first = new Node(item);
				last = first;
			}else{
				last = last.next;
				last.next = new Node(item);
			}
		}

		public Node dequeue(){
			if(first != null){
				Node n = first;
				first = first.next;
				return n;
			}
			return null;
		}

		public boolean isEmpty(){
			return first == null;
		}
	}

	public static void main(String[] args){

	}

	private static void doBreadthFirstSearch(Node node){
		if(node == null) return;
		Queue queue = new RouteBtwn2Nodes().new Queue();
		node.visited = true;
		queue.enqueue(node);

		while(!queue.isEmpty()){
			Node n = queue.dequeue();
			visit(n);
			for(Node neighbors : n.adjacent){
				if(n.visited == false){
					n.visited = true;
					queue.enqueue(n);
				}
			}
		}
	}

	private static boolean doBreadthFirstSearch(Node node, Node node2){
		if(node == null || node2 == null) return false;
		Queue queue = new RouteBtwn2Nodes().new Queue();
		node.visited = true;
		queue.enqueue(node);

		while(!queue.isEmpty()){
			Node n = queue.dequeue();
			visit(n);
			for(Node neighbors : n.adjacent){
				if(n.visited == false){
					if(neighbors == node2){
						return true;
					}else{
						n.visited = true;
						queue.enqueue(n);
					}
				}
			}
		}
		return false;
	}
	
	private boolean doDepthFirstSearch(Node node){
		if(node == null) return false;
		node.visited = true;
		visit(n);

		for(Node n : node.adjacent){
			if(n.visited == false){
				
					doDepthFirstSearch(n);
				
			}
		}
		return false;
	}

	private boolean doDepthFirstSearch(Node node, Node node2){
		if(node == null) return false;
		node.visited = true;
		visit(n);

		for(Node n : node.adjacent){
			if(n.visited == false){
				if(n.getData() == node2.getData()){
					return true;
				}else{
					doDepthFirstSearch(n,node2);
				}
			}
		}
		return false;
	}

	public static void visit(Node n){
		System.out.println("Node "+n.data);
	}
}
