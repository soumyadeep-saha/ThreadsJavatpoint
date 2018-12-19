package com.soumyadeep.threads.runtime;

import java.io.IOException;

public class Runtime1 {

	public static void main(String[] args) throws IOException {

		Runtime r = Runtime.getRuntime();
		r.exec("notepad");
	}
}
