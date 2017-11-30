package com.crack.interview.chap2;



public class PalindromeLinkedList{
	private class Node<E>{
		private Node<E> next;
		private E data;

		public Node(Node next, E data){
			this.next = next;
			this.data = data;
		}
	}

	public static void main(String[] args){
		String str = "b";
		getLongestPalindrome(str);
				
		/*Node n1 = new PalindromeLinkedList().new Node(null,4);
		Node n2 = new PalindromeLinkedList().new Node(n1,5);
		Node n3 = new PalindromeLinkedList().new Node(n2,9);
		
		//Node n4 = new PalindromeLinkedList().new Node(n3,2);
		
		Node n5 = new PalindromeLinkedList().new Node(n3,4);
		Node n6 = new PalindromeLinkedList().new Node(n5,5);
		Node n7 = new PalindromeLinkedList().new Node(n6,9);
		
		checkPalindrome(n7);*/

	}

	private static void getLongestPalindrome(String str) {
		
		char[] arr = str.toCharArray();
		int midPoint = str.length()/2;
		int startPalindromeIndex = midPoint;
		int endPalindromeIndex = (str.length() % 2 == 0) ? midPoint : midPoint + 1;
				
		for(int i = midPoint - 1; i >= 0; i--){
			if(arr[i] != arr[endPalindromeIndex])
				break;
			endPalindromeIndex++;
			startPalindromeIndex--;
				
			
		}
		System.out.println(str.substring(startPalindromeIndex, endPalindromeIndex));
	}

	public static void checkPalindrome(Node head){
		Node fast = head;
		Node slow = head;
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}

		if (fast != null) 
        {
            slow = slow.next;
        }
		//System.out.println("fast point===="+fast.data);
		System.out.println("mid point===="+slow.data);
		while(head != null && slow !=null){
			System.out.println("slow===="+slow.data);
			System.out.println("head===="+head.data);
			if(head.data != slow.data){
				System.out.println("Not a palindrome");
				return;
			}

			head = head.next;
			slow = slow.next;
		}
		
	}
	
	int lengthOfList(LinkedListNode head){
		int size = 0;
		while(head != null){
			size++;
			head = head.next;
		}
		return size;
	}
	
	boolean isPalindrome(LinkedListNode head){
		int length = lengthOfList(head);
		Result r = isPalindromeRecursive(head, length);
		return r.result;
	}
	
	Result isPalindromeRecursive(LinkedListNode head, int length){
		if(head == null || length == 0)
			return new Result(head,true);
		if(length == 1)
			return new Result(head.next, true);

		Result res = isPalindromeRecursive(head.next, length - 2);

		if(!res.result || res.node == null)
			return res;

		res.node = res.node.next;

			
		return res;
	}

}
class LinkedListNode<E>{
	E data;
	LinkedListNode<E> next;
}
class Result{
	boolean result;
	LinkedListNode<?> node;

	Result(LinkedListNode<?> n, boolean r){
		this.result = r;
		this.node = n;
	}
}