package dsPractice;

import java.util.ArrayDeque;
import java.util.Deque;

public class CustomLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public void add(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}

	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public void printAlternateList() {
		Node current = head;
		Deque<Integer> newDequeue = new ArrayDeque<>();
		while (current != null) {
			newDequeue.add(current.data);
			current = current.next;
		}

		current = head;
		int i = 0;
		while (!newDequeue.isEmpty()) {
			if (i % 2 == 0) {
				current.data = newDequeue.removeFirst();
			} else {
				current.data = newDequeue.removeLast();
			}
			System.out.println(current.data);
			++i;
			current = current.next;
		}
	}
}
