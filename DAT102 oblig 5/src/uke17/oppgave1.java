package uke17;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class oppgave1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] liste = {15,8,1,9,11,5,10,12};
		//System.out.println(arrayToStr(selectionSort(liste)));
		//System.out.println(arrayToStr(heapSort(liste)));
		//System.out.println(arrayToStr(insertionSort(liste)));
		//System.out.println(arrayToStr(newSelectionSort(liste)));
		System.out.println(arrayToStr(newHeapSort(liste)));

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
		
	      // To heapify a subtree rooted with node i
	    // which is an index in arr[].
	    static void heapify(int arr[], int n, int i) {

	        // Initialize largest as root
	        int largest = i; 

	        // left index = 2*i + 1
	        int l = 2 * i + 1; 

	        // right index = 2*i + 2
	        int r = 2 * i + 2;

	        // If left child is larger than root
	        if (l < n && arr[l] > arr[largest]) {
	            largest = l;
	        }

	        // If right child is larger than largest so far
	        if (r < n && arr[r] > arr[largest]) {
	            largest = r;
	        }

	        // If largest is not root
	        if (largest != i) {
	            int temp = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = temp;

	            // Recursively heapify the affected sub-tree
	            heapify(arr, n, largest);
	        }
	    }

	    // Main function to do heap sort
	    public static int[] heapSort(int array[]) {
	        int n = array.length;
	        int k = 0;
	        // Build heap (rearrange array)
	        for (int i = n / 2 - 1; i >= 0; i--) {
	            heapify(array, n, i);
	        }

	        // One by one extract an element from heap
	        for (int i = k - 1; i > 0; i--) {

	            // Move current root to end
	            int temp = array[0]; 
	            array[0] = array[i];
	            array[i] = temp;

	            // Call max heapify on the reduced heap
	            heapify(array, i, 0);
	        }
	   
		
		return array;
		
	}
	public static String arrayToStr(int[] array) {
		String output = "[";
		for (int i = 0; i< array.length; i++) {
			output += array[i] + ",";

		}
		output += "]";
		return output;
		
		
	}
	
	public static int[] newSelectionSort(int[] array) {
		
        int n = array.length;
        int k = 3;
        for (int i = 0; i < k; i++) {
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
		
	      // To heapify a subtree rooted with node i
	    // which is an index in arr[].
	    static void newHeapify(int arr[], int n, int i) {

	        // Initialize largest as root
	        int largest = i; 

	        // left index = 2*i + 1
	        int l = 2 * i + 1; 

	        // right index = 2*i + 2
	        int r = 2 * i + 2;

	        // If left child is larger than root
	        if (l < n && arr[l] > arr[largest]) {
	            largest = l;
	        }

	        // If right child is larger than largest so far
	        if (r < n && arr[r] > arr[largest]) {
	            largest = r;
	        }

	        // If largest is not root
	        if (largest != i) {
	            int temp = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = temp;

	            // Recursively heapify the affected sub-tree
	            heapify(arr, n, largest);
	        }
	    }
	
	    // Main function to do heap sort
	    public static int[] newHeapSort(int array[]) {
	        int n = array.length;
	        int k = 3;
	        // Build heap (rearrange array)
	        for (int i = n / 2 - 1; i >= 0; i--) {
	            heapify(array, n, i);
	        }

	        // One by one extract an element from heap
	        for (int i = k - 1; i > 0; i--) {

	            // Move current root to end
	            int temp = array[0]; 
	            array[0] = array[i];
	            array[i] = temp;

	            // Call max heapify on the reduced heap
	            heapify(array, i, 0);
	        }
	   
		
		return array;
		
	}



}
