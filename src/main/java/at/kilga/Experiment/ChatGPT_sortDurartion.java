package at.kilga.Experiment;

import java.util.Arrays;
import java.util.Random;

public class ChatGPT_sortDurartion {

    public static void main(String[] args) {
        int[] sizes = { 10_000, 100_000, 400_000 };
        Random random = new Random();

        for (int size : sizes) {
            System.out.println("Array size: " + size);

            // Generate random array
            int[] array = random.ints(size, 1, size).toArray();

            // Measure Selection Sort
            int[] selectionArray = Arrays.copyOf(array, array.length);
            long start = System.currentTimeMillis();
            selectionSort(selectionArray);
            long end = System.currentTimeMillis();
            System.out.println("Selection Sort: " + (end - start) + " ms");

            // Measure Bubble Sort
            int[] bubbleArray = Arrays.copyOf(array, array.length);
            start = System.currentTimeMillis();
            bubbleSort(bubbleArray);
            end = System.currentTimeMillis();
            System.out.println("Bubble Sort: " + (end - start) + " ms");

            // Measure Insertion Sort
            int[] insertionArray = Arrays.copyOf(array, array.length);
            start = System.currentTimeMillis();
            insertionSort(insertionArray);
            end = System.currentTimeMillis();
            System.out.println("Insertion Sort: " + (end - start) + " ms");

            // Measure Quicksort
            int[] quickArray = Arrays.copyOf(array, array.length);
            start = System.currentTimeMillis();
            quickSort(quickArray, 0, quickArray.length - 1);
            end = System.currentTimeMillis();
            System.out.println("Quicksort: " + (end - start) + " ms");

            System.out.println();
        }
    }

    // Selection Sort
    public static void selectionSort(int[] array) {
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
    }

    // Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // Quicksort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
