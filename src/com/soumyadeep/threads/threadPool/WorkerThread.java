package com.soumyadeep.threads.threadPool;

public class WorkerThread implements Runnable{
	
	private String msg;

	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " Start "+msg);
		processMessage();
		System.out.println(Thread.currentThread().getName() + " End "+msg);
	}
	
	public WorkerThread(String msgnew) {
		this.msg=msgnew;
	}
	
	public void processMessage(){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
