package com.soumyadeep.threads.multitasking;

public class TestMultitasking2 implements Runnable {

	// If you have to perform single task by many threads, have only one run()
	// method
	public void run() {
		System.out.println("task one");
	}

	public static void main(String args[]) {
		Thread t1 = new Thread(new TestMultitasking2());// passing annonymous object of TestMultitasking2 class
		Thread t2 = new Thread(new TestMultitasking2());

		t1.start();
		t2.start();
	}

}
