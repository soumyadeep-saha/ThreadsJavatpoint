package com.soumyadeep.threads.synchronization.reentrant;

public class Reentrant {

	public synchronized void m() {
		n();
		System.out.println("this is m() method");
	}

	public synchronized void n() {
		System.out.println("this is n() method");
	}
}
