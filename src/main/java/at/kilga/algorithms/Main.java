package at.kilga.algorithms;

import java.util.Arrays;

import at.kilga.algorithms.algo.BaseAlgorithm;
import at.kilga.algorithms.algo.Bubblesort;
import at.kilga.algorithms.algo.InsertionSort;
import at.kilga.algorithms.algo.SelectionSort;

public class Main {

    public static void main(String[] args) {
        int[] arr;
        int number;
        DataGenerator dataGenerator = new DataGenerator();
        int[] data = { 5, 6, 1, 2, 7, 8, 3, 9, 4 };
        BaseAlgorithm baseAlgorithm = new BaseAlgorithm();
        Bubblesort bubblesort = new Bubblesort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();

        // generate array
        arr = dataGenerator.generateDataArray(9);
        System.out.println("Generate Array");
        dataGenerator.printArray(arr);
        System.out.println("");
        // generate arry min max
        arr = dataGenerator.generateDataArrayMinMax(9, 0, 10);
        System.out.println("Generate Array min max");
        dataGenerator.printArray(arr);
        System.out.println("");

        // baseAlgo
        arr = baseAlgorithm.revert(data);
        System.out.println("revert");
        dataGenerator.printArray(arr);
        System.out.println("");

        number = baseAlgorithm.min(data);
        System.out.println("min: " + number);
        System.out.println("");

        number = baseAlgorithm.max(data);
        System.out.println("max " + number);
        System.out.println("");

        // bubbleSort
        arr = bubblesort.sort(data);
        System.out.println("bubblesort");
        dataGenerator.printArray(arr);
        System.out.println("");

        // insertSort
        arr = insertionSort.sort(data);
        System.out.println("insertionsort");
        dataGenerator.printArray(arr);
        System.out.println("");

        // selctionSort
        arr = selectionSort.sort(data);
        System.out.println("selectionsort");
        dataGenerator.printArray(arr);
        System.out.println("");

    }
}
