package com.soumyadeep.threads.synchronization;

public class Table {
	
	void printTable(int n){//method not synchronized  
		   for(int i=1;i<=5;i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
		 }  

	public static void main(String[] args) {

		Table t=new Table();
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
