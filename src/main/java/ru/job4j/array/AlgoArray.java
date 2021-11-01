package ru.job4j.array;

import java.util.Arrays;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        for (int j = array.length -1 ; j > 0; j --) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        for (int b : array) {
            System.out.print(b);

        }

    }
}

