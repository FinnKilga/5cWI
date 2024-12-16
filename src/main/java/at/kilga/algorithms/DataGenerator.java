package at.kilga.algorithms;

import java.util.Random;

public class DataGenerator {

    public static int[] generateDataArray(int dataLength) {
        int[] array = new int[dataLength];
        Random random = new Random();
        for (int i = 0; i < dataLength; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static int[] generateDataArrayMinMax(int size, int min, int max) {
        if (max <= min) {
            System.out.println("max must be greater than min");
        }

        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min) + min;
        }
        return array;
    }

    public static void printArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

}
