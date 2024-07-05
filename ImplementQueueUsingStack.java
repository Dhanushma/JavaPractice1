package com.prep.misc;

import java.util.Stack;

public class ImplementQueueUsingStack {
	
	static Stack<Integer> stack1 = new Stack<>();
	static Stack<Integer> stack2 = new Stack<>();
	
	//implement Enqueue

	 void enqueue(int val) {
		
		//Empty stack 1 and push them to stack 2
		while(!stack1.isEmpty()) {
			
			stack2.push(stack1.pop());
		}
		
		stack1.push(val);
		
		//refill stack 1
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}
	
	  int dequeue() {
		
		if(stack1.isEmpty()) {
			return 0;
		}
		return stack1.pop();
	}
	
	public static void main(String[] args) {
		ImplementQueueUsingStack q = new ImplementQueueUsingStack();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		System.out.println(q.dequeue());
		
		
	}
	

}
