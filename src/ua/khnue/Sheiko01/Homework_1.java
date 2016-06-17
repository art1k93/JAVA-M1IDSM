package ua.khnue.Sheiko01;

import java.io.Console;

/**
 * @author Sheiko Artem temasheiko@gmail.com
 * @version 1.0
 * 
 * Date: 04.03.16
 * 
 * MBA BI 2015-2017
 * 
 * Molchanov G. I. - Java
 */


public class Homework_1 {	
	
	public static void main(String[] args) throws Exception
	{
		// Console init
		Console console = System.console();
        if (console == null) {
            System.out.println("Unable to fetch console. Try with cmd.");
            return;
        }
        
        
        //-----------===========================-----------//
        //-----------========= Task 1 ==========-----------//
        //-----------===========================-----------//
       
        // Description:
        // Calculate a function value
        
        System.out.println("\n-----------========= Task 1 ==========-----------\n");
        String Y;
        Task_1 equation = new Task_1();
        equation.getValues(console);
        
		Y = equation.getFormatedY();
		System.out.println(Y);
        System.out.println("\n\n\n");
       
        
        //-----------===========================-----------//
        //-----------========= Task 2 ==========-----------//
        //-----------===========================-----------//
		
        // Description:
        // Find max and min value of an array
        
        System.out.println("-----------========= Task 2 ==========-----------\n");
		int[] arr_search;
		Task_2 arr = new Task_2();
		
		arr_search = arr.arrayInit(console);
		
		arr.findMinMax(arr_search);
		arr.printMinMax();
        System.out.println("\n\n\n");
		
		
		//-----------===========================-----------//
        //-----------========= Task 3 ==========-----------//
        //-----------===========================-----------//
		
        System.out.println("\n-----------========= Task 3 ==========-----------\n");
		Task_3 arr_sort = new Task_3();
		
		arr_sort.initArray();
        System.out.println("Initial array:");
		arr_sort.printArray();
        System.out.println("Doing quickSort()...");
		arr_sort.quickSort();
        System.out.println("Result array:");
		arr_sort.printArray();
        System.out.println("\n\n\n");
		
		
	}
	
}

