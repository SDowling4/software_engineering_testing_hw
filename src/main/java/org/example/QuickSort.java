package org.example;

public class QuickSort {

    // Method to perform Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partitioning index
            int pi = partition(arr, low, high);

            // Recursively sort the subarrays
            quickSort(arr, low, pi - 1);  // Left subarray
            quickSort(arr, pi + 1, high); // Right subarray
        }
    }

    // Partition method to rearrange elements around the pivot
    private static int partition(int[] arr, int low, int high) {
        // Choosing the last element as the pivot
        int pivot = arr[high];
        int i = low - 1;  // Pointer for the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is less than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;  // Increment index of the smaller element
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i + 1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the index of the pivot
    }

    // Helper method to print the array
//    public static void printArray(int[] arr) {
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//
//    // Main method to test Quick Sort
//    public static void main(String[] args) {
//        int[] arr = {64, 34, 25, 12, 22, 11, 90};
//
//        System.out.println("Original array:");
//        printArray(arr);
//
//        // Call the quickSort method on the entire array
//        quickSort(arr, 0, arr.length - 1);
//
//        System.out.println("Sorted array:");
//        printArray(arr);
//    }
}
