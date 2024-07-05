package com.prep.misc;

// check for loops in LinkedList
public class LinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		public  Node(int data) {
			this.data = data;
		}
		
		
	}
	
	public void push(int newdata) {
		
		Node newNode = new Node(newdata);
		newNode.next = head;
		head = newNode;
	}
	
	public boolean detectLoop() {
		
		Node first = head;
		Node second = head;
		
		while(first.next != null && second.next != null && second.next != null) {
			first = first.next;
			second = second.next.next;
			
			if(first == second) {
				return true;
			}
			
		}
		return false;
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.push(5);
		list.push(6);
		list.push(7);
		list.push(8);
		list.push(9);
		
		list.head.next.next.next.next = list.head.next;
		System.out.println(list.detectLoop());

	}

}
