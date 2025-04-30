package uke17;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class oppgave1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] liste = {15,8,1,9,11,5,10,12};
		//System.out.println(arrayToStr(selectionSort(liste)));
		//System.out.println(arrayToStr(heapSort(liste)));
		System.out.println(arrayToStr(insertionSort(liste)));

	}
	public static int[] selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
	public static int[] insertionSort(int[] array) {
		int n = array.length;
	    for (int i = 1; i < n; ++i) {
	        int current = array[i];
	        int j = i - 1;
	        while (j >= 0 && array[j] > current) {
	            array[j + 1] = array[j];
	            j = j - 1;
	        }
	        array[j + 1] = current;
	    }
		return array;
	}

	public static int[] heapSort(int [] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            temp = array[maxIndex];
            System.out.println(temp);
            array[maxIndex] = array[i];
            array[i] = temp;
        }
        array[array.length-1] += temp; //Vil ikke legge til 1?
		return array;
		
	}
	public static String arrayToStr(int[] array) {
		String output = "[";
		for (int i = 0; i< array.length-1; i++) {
			output += array[i] + ",";

		}
		output += "]";
		return output;
		
		
	}

}
