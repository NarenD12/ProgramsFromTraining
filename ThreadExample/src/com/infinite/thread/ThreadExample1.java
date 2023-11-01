package com.infinite.thread;

class MyExample extends Thread {
	public void display() {
		System.out.println(this.getState());
	}
}

public class ThreadExample1 {

	public static void main(String[] args) {
		try {
			Thread.sleep(8876);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new MyExample().display();
	}
}
