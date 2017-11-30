package com.crack.interview.chap2;

import java.util.*;
public class KthToLast{
    private class Node<E>{
	private Node<E> next;
	private E data;
	}
	public static void main(String[] args){

	}

	public static void kthToLast(List singleLinkList, int k){
		if(k > singleLinkList.size()) return;
		singleLinkList.get(singleLinkList.size() - k);
	}

	public static void kthNode(Node node, int n){
		Node n1 = node;
		Node n2 = node;

		for(int i = 0; i < n; i++){
			n1 = n1.next;
		}

		while(n1 != null && n1.next == null){
			n1 = n1.next;
			n2 = n2.next;
		}
		System.out.println("Value is now======" + n2.data);
	}
}