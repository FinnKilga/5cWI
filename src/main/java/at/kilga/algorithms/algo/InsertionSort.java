package at.kilga.algorithms.algo;

public class InsertionSort implements SortingAlgorithm {

    @Override
    public int[] sort(int[] data) {
        int number, j;
        for (int i = 1; i < data.length; i++) {
            number = data[i];
            j = i - 1;
            while (j >= 0 && data[j] > number) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = number;
        }
        return data;
    }

}
