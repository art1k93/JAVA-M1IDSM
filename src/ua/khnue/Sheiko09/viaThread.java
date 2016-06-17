package ua.khnue.Sheiko09;

public class viaThread extends Thread {
	private int ms;
	
	public viaThread(int ms) {
		this.ms = ms;
		
		this.start();
	}
	
	public void run() {
		for (int i = 0; i < 12; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				sleep(this.ms);
			}
			catch (Exception e) {}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
			// new viaThread(500);
			
			Thread t = new Thread(new viaRunnable());  
			t.start();
			t.join();
			System.out.println("done.");
	}
}

