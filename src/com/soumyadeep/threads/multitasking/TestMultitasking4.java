package com.soumyadeep.threads.multitasking;

public class TestMultitasking4 {

	public static void main(String[] args) {

		// If you have to perform multiple tasks by multiple threads,have multiple run()
		// methods

		Thread t1 = new Thread() {
			public void run() {
				System.out.println("In thread 1");
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				System.out.println("In thread 2");
			}
		};

		Thread t3 = new Thread() {
			public void run() {
				System.out.println("In thread 3");
			}
		};

		Thread t4 = new Thread() {
			public void run() {
				System.out.println("In thread 4");
			}
		};

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
