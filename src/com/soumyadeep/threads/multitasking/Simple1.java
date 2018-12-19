package com.soumyadeep.threads.multitasking;

public class Simple1 {

	// If you have to perform multiple tasks by multiple threads,have multiple run()
	// methods
	public static void main(String[] args) {

		Simple2 s2 = new Simple2();
		Simple3 s3 = new Simple3();
		s2.start();
		s3.start();

	}
}

class Simple2 extends Thread {

	public void run() {
		System.out.println("In simple 2");
	}
}

class Simple3 extends Thread {

	public void run() {
		System.out.println("In simple 3");
	}
}
