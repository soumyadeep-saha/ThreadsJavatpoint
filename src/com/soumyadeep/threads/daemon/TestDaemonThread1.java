package com.soumyadeep.threads.daemon;

public class TestDaemonThread1 extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("It is a daemon thread");
		} else {
			System.out.println("It is a user thread");
		}
	}

	public static void main(String[] args) {

		TestDaemonThread1 d1 = new TestDaemonThread1();
		TestDaemonThread1 d2 = new TestDaemonThread1();
		TestDaemonThread1 d3 = new TestDaemonThread1();
		d1.setDaemon(true);
		d1.start();
		d2.start();
		d3.start();
	}
}
