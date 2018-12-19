package com.soumyadeep.threads.multitasking;

public class TestMultitasking5 {

	public static void main(String[] args) {


		// If you have to perform multiple tasks by multiple threads,have multiple run()
		// methods

		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("In runnable 1");
			}
		};
		
		Runnable r2 = new Runnable() {
			public void run() {
				System.out.println("In runnable 2");
			}
		};
		
		Runnable r3 = new Runnable() {
			public void run() {
				System.out.println("In runnable 3");
			}
		};
		
		Runnable r4 = new Runnable() {
			public void run() {
				System.out.println("In runnable 4");
			}
		};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		Thread t4=new Thread(r4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
