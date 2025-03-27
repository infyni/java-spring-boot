package com;

public class DefaultThreadExample {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		String name = t.getName();
		System.out.println(name);
		int i = t.getPriority();
		System.out.println(t);
		ThreadGroup tg = t.getThreadGroup();
		System.out.println(tg);
		t.setName("My Thread");
		t.setPriority(Thread.MAX_PRIORITY);   // min 1 and max 10 
		System.out.println(t);
	}

}
