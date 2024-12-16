package at.kilga.algorithms.algo;

public class Bubblesort implements SortingAlgorithm {

    @Override
    public int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int placeholder = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = placeholder;
                }
            }
        }
        return data;
    }

}
