package com.example.threads;

public class ThreadExercise {

	public static void main(String[] args) {
		ThreadExercise obj = new ThreadExercise();
		obj.start();

	}

	private void start() {
		try {
			Task tarea1 = new Task("Task 1", 0, 100);
			tarea1.start();
			tarea1.join();

			Task tarea2 = new Task("Task 2", 100, 200);
			tarea2.start();
			tarea2.join();

			Task tarea3 = new Task("Task 3", 200, 300);
			tarea3.start();
			tarea3.join();

			Thread thread4 = new Thread(new RunnableImplementation());
			thread4.start();
			thread4.join();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

class RunnableImplementation implements Runnable {

	@Override
	public void run() {
		System.out.println("Task 4");
		for (int i = 300; i < 400; i++) {
			System.out.print(i + "-");
		}
		System.out.println("Task 4 Done");
	}
}
