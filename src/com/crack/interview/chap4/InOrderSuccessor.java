package com.crack.interview.chap4;

public class InOrderSuccessor {

	private class Node<E> {
		private Node left, right, parent;
		private E data;

		public Node(E data) {
			this.data = data;
		}

		public int getData() {
			return (int) data;
		}
	}

	public static Node getInorderSuccessor(Node node) {
		if (node == null)
			return null;

		if (node.right != null)
			return getLeftMostNode(node.right);

		Node p = node.parent;
		if (p != null && node.getData() == p.right.getData()) {
			node = p;
			p = p.parent;
		}
		return p;

	}

	private static Node getLeftMostNode(Node node) {
		while (node != null) {
			node = node.left;
		}
		return node;
	}

	Node inorderSucc(Node n) {
		if (n == null)
			return null;

		/* Found right children -> return leftmost node of right subtree. */
		if (n.right != null) {
			return getLeftMostNode(n.right);
		} else {
			Node q = n;
			Node x = q.parent;
			// Go up until we're on left instead of right
			while (x != null && x.left != q) {
				q = x;
				x = x.parent;
			}
			return x;
		}
	}
}
