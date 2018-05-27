package com.demo.base;

import io.shardingsphere.core.keygen.DefaultKeyGenerator;
import io.shardingsphere.core.keygen.KeyGenerator;

public class Test {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Thread(new GeneratorThread("i"+i)).start();
		}
	}

}

class GeneratorThread implements Runnable {

	private String name;

	public GeneratorThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(System.currentTimeMillis() + "," + Thread.currentThread().getId());
		// DefaultKeyGenerator.setWorkerId(2);
		KeyGenerator key = new DefaultKeyGenerator();
		Number orderIdKey = key.generateKey();
		Long orderId = orderIdKey.longValue();
		System.out.println(orderId);
	}
	

}
