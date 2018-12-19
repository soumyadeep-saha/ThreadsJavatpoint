package com.soumyadeep.threads.runtime;

import java.io.IOException;

public class Runtime2 {

	public static void main(String[] args) throws IOException {

		Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
	}

}
