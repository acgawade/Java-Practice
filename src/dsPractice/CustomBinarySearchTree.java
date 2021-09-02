package dsPractice;

public class CustomBinarySearchTree {
	Node root;

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	public void insert(int data) {
		root = insertRecursive(root, data);
	}

	private Node insertRecursive(Node current, int data) {
		if (current == null) {
			return new Node(data);
		}

		if (data < current.data) {
			current.left = insertRecursive(current.left, data);
		} else if (data > current.data) {
			current.right = insertRecursive(current.right, data);
		} else {
			return current;
		}
		return current;
	}

	public boolean contains(int data) {
		return containsRecursive(root, data);
	}

	private boolean containsRecursive(Node current, int data) {
		if (current == null) {
			return false;
		}
		if (current.data == data) {
			return true;
		}

		if (data < current.data) {
			return containsRecursive(current.left, data);
		} else {
			return containsRecursive(current.right, data);
		}
	}
}
