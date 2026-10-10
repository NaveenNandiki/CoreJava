package com.Labprograms.threads;

public class MyThreadRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 2; i <= 20; i = i + 2) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadRunnable mtr = new MyThreadRunnable();
		Thread t = new Thread(mtr);
		t.start();
	}

}
