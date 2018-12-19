package com.soumyadeep.threads.synchronization.staticSynchronization;

public class TableSynchronized {

	synchronized static void printTable(int n){//method not synchronized  
		   for(int i=1;i<=5;i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
		 }
	
	public static void main(String[] args) {

		new Thread() {
			public void run() {
				TableSynchronized.printTable(1);
			}
		}.start();
		
		new Thread() {
			public void run() {
				TableSynchronized.printTable(10);
			}
		}.start();
		
		new Thread() {
			public void run() {
				TableSynchronized.printTable(100);
			}
		}.start();
		
		new Thread() {
			public void run() {
				TableSynchronized.printTable(1000);
			}
		}.start();
	}
}
