package com.practice;

public class Java8Features {
	
	public static void main(String[] args) {
		
		//Anonymous initialization
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("My Runnable");
			}
		};
		
		//using lambda expression
		Runnable r1 = () -> {
			System.out.println("My Lambda");
		};
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r1);

		t1.start();
		t2.start();
	}

}
