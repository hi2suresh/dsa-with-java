package com.logicbuilding.part4;

class LinkedList {
	private int data;
	LinkedList next;
	public LinkedList(int data) {
		this.data = data;
	}
	public int getData() {
		return this.data;
	}
}
public class ReverseLinkedList {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList(1);
		ll.next = new LinkedList(2);
		ll.next.next = new LinkedList(3);
		ll.next.next.next = new LinkedList(4);
		
		LinkedList current  = ll;
		LinkedList previous = null;
		LinkedList nextNode = ll;
		while(current != null) {
			nextNode = current.next;
			current.next = previous;
			previous = current;
			current = nextNode;
		}
		current  = previous;
		while(current != null) {
			System.out.println(current.getData());
			current = current.next;
		}
	}
}
