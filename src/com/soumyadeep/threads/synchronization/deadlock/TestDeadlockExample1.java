package com.soumyadeep.threads.synchronization.deadlock;

public class TestDeadlockExample1 {

	public static void main(String[] args) {

		final String resource1 = "Resource1";
		final String resource2 = "Resource2";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("in thread 1 resource 1");
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (resource2) {
					System.out.println("in thread 1 resource 2");
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("in thread 2 resource 2");
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (resource1) {
					System.out.println("in thread 2 resource 1");
				}
			}
		};

		t1.start();
		t2.start();
	}
}
