package at.kilga.algorithms.algo;

public class SelectionSort implements SortingAlgorithm {

    @Override
    public int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {

            int minNumber = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minNumber]) {
                    minNumber = j;
                }
            }
            int placeholder = data[minNumber];
            data[minNumber] = data[i];
            data[i] = placeholder;
        }

        return data;
    }
}
