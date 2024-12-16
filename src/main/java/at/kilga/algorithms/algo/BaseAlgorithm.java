package at.kilga.algorithms.algo;

public class BaseAlgorithm {
    public static int[] revert(int[] data) {
        int[] array = new int[data.length];
        int count = 0;
        for (int i = data.length - 1; i >= 0; i--) {
            array[count] = data[i];
            count++;
        }
        return array;
    }

    public static int max(int[] data) {
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public static int min(int[] data) {
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

}
