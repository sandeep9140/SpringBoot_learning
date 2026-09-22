package com.sandeep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner2 implements CommandLineRunner{
	@Override
	public void run(String... args) {
		System.out.println("Command line argument running----------");
		for(String x : args) {
			System.out.println(x);
		}
	}

}
