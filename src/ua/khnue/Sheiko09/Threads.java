package ua.khnue.Sheiko09;

import java.util.Arrays;

/**
 * Реализовать поиск максимального значения в каждой строке матрицы размера MxN
 * при помощи M параллельных вычислительных потоков. Каждую операцию сравнения
 * выполнять с задержкой в 1 мс. Решить задачу поиска максимального значения без
 * распараллеливания. Вывести результат и время выполнения для обоих вариантов.
 *
 * @author xone
 */
public class Threads {

	private static final int LINES = 50;
	private static final int COLUMNS = 100;
	private static final int MIN_INT = -100;
	private static final int MAX_INT = 100;
	private static final int MILLION = 1_000_000;
	private static final java.util.Random rnd = new java.util.Random();

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Begin...");
		
		// /////////////////////////////////////////////////
		int[][] matrix = new int[LINES][COLUMNS];
		Thread[] threads = new Thread[matrix.length];
		long timeMultiThreading = 0L;
		long timeSingleThreading = 0L;
		for (int i = 0; i < matrix.length; ++i) {
			generateVector(matrix[i]);
			// System.out.println(Arrays.toString(matrix[i]));
		}
		
		// /////////////////////////////////////////////////
		// Multi-threading.
		// /////////////////////////////////////////////////
		System.out.println("Multi-threading...  ");
		
		// Create threads.
		timeMultiThreading = System.nanoTime();
		for (int i = 0; i < matrix.length; ++i) {
			threads[i] = new VectorThread(matrix[i]);
		}
		
		// Wait for result.
		for (Thread thread : threads) {
			thread.join();
		}

		
		int[] intVals = new int[threads.length];
		
		for (int i = 0; i < intVals.length; i++) {
			intVals[i] = ((VectorThread) threads[i]).getResult();
		}
		Arrays.sort(intVals);
		System.out.println("Max value: " + intVals[intVals.length - 1]);
		timeMultiThreading = System.nanoTime() - timeMultiThreading;
		
		// /////////////////////////////////////////////////
		// Single-threading.
		// /////////////////////////////////////////////////
		
		System.out.println("Single-threading... ");
		int[] results = new int[matrix.length];
		
		// Create and wait threads.
		timeSingleThreading = System.nanoTime();
		for (int i = 0; i < matrix.length; ++i) {
			results[i] = findMaxIndex(matrix[i]);
		}
		Arrays.sort(results);
		System.out.println("Max value: " + results[results.length - 1]);
		
		timeSingleThreading = System.nanoTime() - timeSingleThreading;
		
		
		System.out.println("Multi-threading  = " + timeMultiThreading / MILLION + " millisecs");
		System.out.println("Single-threading = " + timeSingleThreading / MILLION + " millisecs");
		System.out.printf("Ratio = %.1f\n", timeSingleThreading * 1.0 / timeMultiThreading);
		
		// /////////////////////////////////////////////////
		System.out.println("done.");
	}

	public static void generateVector(final int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = rnd.nextInt(MAX_INT - MIN_INT + 1) + MIN_INT;
		}
	}

	public static int findMaxIndex(int[] vector) {
		if (vector == null || vector.length == 0)
			return -1;
		int result = 0;
		for (int counter = 1; counter < vector.length; ++counter) {
			if (vector[counter] > vector[result])
				result = counter;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.err.println("Interrupted...");
				break;
			}
		}
		return result;
	}

	public static class VectorThread extends Thread {
		final private int[] vector;
		private int result;

		public int getResult() {
			return result;
		}

		public VectorThread(final int[] newVector) {
			vector = newVector;
			start();
		}

		public void run() {
			result = findMaxIndex(vector);
		}

		@Override
		public String toString() {
			return getName() + ": index = " + result + ", val = " + vector[result];
		}

	}

}