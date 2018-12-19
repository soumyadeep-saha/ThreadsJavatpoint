package com.soumyadeep.threads.synchronizedBlock;

public class TableSynchronizedAnonymous {

	void printTable(int n) {
		synchronized (this) {// synchronized block
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}

	public static void main(String[] args) {

		TableSynchronizedAnonymous t = new TableSynchronizedAnonymous();
		new Thread() {
			public void run() {
				t.printTable(5);
			}
		}.start();

		new Thread() {
			public void run() {
				t.printTable(100);
			}
		}.start();
	}
}
