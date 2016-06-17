package ua.khnue.Sheiko01;

import java.io.Console;
import java.util.Arrays;

public class Task_2 {
	
	final int lower_limit = -10;
	final int upper_limit = 10;

	private int arr_size;
	private int min;
	private int max;

	Task_2() {
		
	}
	
	private void setArrSize (int arr_size)	{ this.arr_size = arr_size; }
	
	private void setMin 	(int min)		{ this.min = min; }
	
	private void setMax 	(int max)		{ this.max = max; }
	
	public int getArrSize	()				{ return this.arr_size;	}
	
	public int getMin		()				{ return this.min;	}
	
	public int getMax		()				{ return this.max;	}
	
	public int[] arrayInit(Console console)
	{
		System.out.print("Set initial array size:");
		setArrSize(Integer.parseInt(console.readLine()));
		
		int[] arr_search = new int[arr_size];
		System.out.print("Initial array: ");
		for(int i = 0; i < arr_search.length; i++)
		{
			arr_search[i] = (int) Math.round((Math.random() * 2 * Math.abs(lower_limit)) - Math.abs(lower_limit)); // array -> [-10;10]
			System.out.print(arr_search[i] + " ");
		}
		
		return arr_search;
	}
	
	public void findMinMax(int[] arr_search)
	{
		int a_min;
		int a_max;
	
		/*		
 		// Not a Java way, works slowly then a search
 		Arrays.sort(arr_search);
		a_min = arr_search[0];
		a_max = arr_search[arr_search.length - 1];
		*/
		
		/*
		// Looks good, work faster, can be written without search in Internet		
 		a_min = arr_search[0];
		a_max = a_min;
		for (int el  : arr_search) {
			  if (el > a_max) a_max = el;
		      if (el < a_min) a_min = el;
		}
		*/
		
		// Don't know what happens here, but I like it :)
		// TODO ask Molchanov I. G. about "stream"
		a_min = Arrays.stream(arr_search).min().getAsInt();
		a_max = Arrays.stream(arr_search).max().getAsInt();
		
		setMin(a_min);
		setMax(a_max);
	}
	
	public void printMinMax ()
	{
		System.out.println("\nMin: " + getMin() + "; Max: " +  getMax());
	}

	
}
