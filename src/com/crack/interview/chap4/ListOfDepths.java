package com.crack.interview.chap4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ListOfDepths {

	private class Node<E> {
		private Node left, right;
		private E data;
		private Node[] adjacent;
		private boolean visited;

		public Node(E data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Node n = createTree(arr);
		printLevelOrder(n);

	}

	public static Node createTree(int[] arr) {
		if (arr == null || arr.length < 0)
			return null;
		return createTree(arr, 0, arr.length - 1);
	}

	public static Node createTree(int[] arr, int start, int end) {
		if (start > end)
			return null;

		int mid = (start + end) / 2;
		Node n = new ListOfDepths().new Node(arr[mid]);
		n.left = createTree(arr, start, mid - 1);
		n.right = createTree(arr, mid + 1, end);

		return n;
	}

	static int findHeight(Node aNode) {
		if (aNode == null) {
			return -1;
		}

		int left = findHeight(aNode.left);
		int right = findHeight(aNode.right);

		if (left > right) {
			return left + 1;
		} else {
			return right + 1;
		}
	}

	static void printLevelOrder(Node root) {
		int h = findHeight(root);
		int i;
		Map m = new HashMap();
		for (i = 1; i <= h; i++) {
			List l = new ArrayList();
			System.out.println("Level=====" + i);
			l = printGivenLevel(root, i, l);
			m.put(i, l);
			System.out.println("Map " + i + " contains " + m.get(i));

		}

	}

	static List printGivenLevel(Node root, int level, List l) {
		if (root == null)
			return new ArrayList();
		if (level == 1) {
			l.add(root.data);
			System.out.println("Root Daaata=====" + root.data + " ");
		}

		else if (level > 1) {
			printGivenLevel(root.left, level - 1, l);
			printGivenLevel(root.right, level - 1, l);
		}
		return l;
	}

	void createLevelLinkedList(Node root, ArrayList<LinkedList<Node>> lists,
			int level) {
		if (root == null)
			return; // base case

		LinkedList<Node> list = null;
		if (lists.size() == level) { // Level not contained in list
			list = new LinkedList<Node>();
			/*
			 * Levels are always traversed in order. So, if this is the first
			 * time we've visited level i, we must have seen levels 0 through i
			 * - 1. We can therefore safely add the level at the end.
			 */
			lists.add(list);
		} else {
			list = lists.get(level);
		}
		list.add(root);
		createLevelLinkedList(root.left, lists, level + 1);
		createLevelLinkedList(root.right, lists, level + 1);
	}

	ArrayList<LinkedList<Node>> createLevelLinkedList(Node root) {

		ArrayList<LinkedList<Node>> lists = new ArrayList<LinkedList<Node>>();

		createLevelLinkedList(root, lists, 0);

		return lists;

	}

	ArrayList<LinkedList<Node>> createLevelLinkedlist(Node root) {

		ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
		/* "Visit" the root */
		LinkedList<Node> current = new LinkedList<Node>();

		if (root != null) {
			current.add(root);

		}
		while (current.size() > 0) {
			result.add(current); // Add previous level
			LinkedList<Node> parents = current; // Go to next level
			current = new LinkedList<Node>();
			for (Node parent : parents) {
				/* Visit the children */
				if (parent.left != null) {
					current.add(parent.left);
				}
				if (parent.right != null) {
					current.add(parent.right);
				}

			}

		}
		return result;
	}
}
