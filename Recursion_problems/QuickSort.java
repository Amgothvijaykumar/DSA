package Recursion_problems;


import java.util.*;

public class QuickSort {
    
    // Partition function
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choose last element as pivot
        int i = (low - 1);     // pointer for smaller elements

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {  // if current element < pivot
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // pivot index
    }

    // Recursive Quick Sort function
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);  // left part
            quickSort(arr, pi + 1, high); // right part
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        
        quickSort(arr, 0, arr.length - 1);
        
        System.out.println("After sorting:  " + Arrays.toString(arr));
    }
}
