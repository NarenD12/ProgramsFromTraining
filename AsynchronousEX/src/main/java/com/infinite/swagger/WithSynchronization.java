package com.infinite.swagger;

class Table1 {
	 void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread11 extends Thread {
	Table1 t;

	MyThread11(Table1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

class MyThread22 extends Thread {
	Table1 t;

	MyThread22(Table1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class WithSynchronization {

	public static void main(String[] args) {
		Table1 obj1 = new Table1();
		MyThread11 obj2 = new MyThread11(obj1);
		MyThread22 obj3 = new MyThread22(obj1);

		obj2.start();
		obj3.start();
	}

}
