package com.soumyadeep.threads.creatingThread;

public class WithThread extends Thread {

	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {

		WithThread t1 = new WithThread();
		t1.start();
	}
}
