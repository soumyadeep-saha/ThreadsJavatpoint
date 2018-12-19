package com.soumyadeep.threads.creatingThread;

public class WithRunnable implements Runnable {

	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {

		WithRunnable m1 = new WithRunnable();
		Thread t1 = new Thread(m1);
		t1.start();
	}
}
