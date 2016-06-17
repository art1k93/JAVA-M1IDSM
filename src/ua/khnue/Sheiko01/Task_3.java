package ua.khnue.Sheiko01;

import java.util.Random;

// Quick sort implementation

public class Task_3 {
    public static int a_length = 10;
    private static int[] array = new int[a_length];
    private static Random generator = new Random();

    public void initArray() {
        for (int i=0; i<a_length; i++) {
            array[i] = generator.nextInt(100);
        }
    }

    public void printArray() {
        for (int i=0; i<a_length-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[a_length-1]);
    }

    public void quickSort() {
        int startIndex = 0;
        int endIndex = a_length - 1;
        doSort(startIndex, endIndex);
    }

    private void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur+1, end);
    }	
}