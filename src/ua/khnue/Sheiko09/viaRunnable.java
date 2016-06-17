package ua.khnue.Sheiko09;

public class viaRunnable implements Runnable {
	private int ms = 500;

	
	public void run() {
		for (int i = 0; i < 12; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(this.ms);
			}
			catch (Exception e) {}
		}
	}
}
