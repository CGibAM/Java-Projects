package com.example.threads;

public class Task extends Thread {
	public String title;
	public int init, end;

	Task(String string, int i, int j) {
		this.title = string;
		this.init = i;
		this.end = j;
	}

	@Override
	public void run() {
		System.out.println(this.title);
		for (int i = this.init; i < this.end; i++) {
			System.out.print(i + "-");
		}
		System.out.println(this.title + " Done");
	}

}
