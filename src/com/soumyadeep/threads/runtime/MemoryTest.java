package com.soumyadeep.threads.runtime;

public class MemoryTest {

	public static void main(String[] args) {

		Runtime r=Runtime.getRuntime();
		System.out.println("Initial total memory: "+r.totalMemory());
		System.out.println("Initial free memory: "+r.freeMemory());
		
		for(int i=0; i<100000; i++) {
			
			new MemoryTest();
		}
		
		System.out.println("Final free memory: "+r.freeMemory());
		System.gc();
		System.out.println("Final free memory: "+r.freeMemory());
	}

}
