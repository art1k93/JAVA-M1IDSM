package ua.khnue.Sheiko05;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.ArrayList;

public class Task_5 {

	final static String byIndexPhrase = "Время обработки при доступе к элементам по индексу: ";
	final static String byElementPhrase = "Время обработки при последовательном доступе к элементам: ";
	final static int LIST_LEN = 1_000_000;
	
	public static void main(String[] args) {

		// Создание массива, HashMap и ArrayList
		int[] arr = new int[LIST_LEN];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		///
		
		// Заполнение данными
		for (int i = 0; i < LIST_LEN; i++) {
			arr[i] = i * 5;
			map.put(map.size()+1, i);
			arrList.add(i);
		}
		///
		
		System.out.println("Массив\n------------------------------------------");
		int sum = 0;
		long timeStart = System.nanoTime();
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(byIndexPhrase + (System.nanoTime() - timeStart) / 1_000_000_000.0);
		sum = 0;
		timeStart = System.nanoTime();
		for (int i : arr) {
			sum += i;
		}
		System.out.println(byElementPhrase + (System.nanoTime() - timeStart) / 1_000_000_000.0);
		
		
		
		System.out.println("\n\nHashMap\n------------------------------------------");
		sum = 0;
		timeStart = System.nanoTime();
		for (int i = 1; i < map.size(); i++) {
			sum += (int)map.get(i);
		}
		System.out.println(byIndexPhrase + (System.nanoTime() - timeStart) / 1_000_000_000.0);
		sum = 0;
		timeStart = System.nanoTime();
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			sum += entry.getValue();
		}
		System.out.print(byElementPhrase + (System.nanoTime() - timeStart) / 1_000_000_000.0);
		
		
		
		System.out.println("\n\nArrayList\n------------------------------------------");
		sum = 0;
		timeStart = System.nanoTime();
		for (int i = 0; i < arrList.size(); i++) {
			sum += arrList.get(i);
		}
		System.out.println(byIndexPhrase + (System.nanoTime() - timeStart) / 1_000_000_000.0);
		sum = 0;
		timeStart = System.nanoTime();
		for (Integer i : arrList) {
			sum += i;
		}
		System.out.println(byElementPhrase + (System.nanoTime() - timeStart) / 1_000_000_000.0);
		
	}
}
