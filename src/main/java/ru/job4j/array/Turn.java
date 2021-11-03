package ru.job4j.array;


public class Turn {

    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2 ; i++) {
            int temp = array[i];
            array[i] = array[(array.length - 1) - i ];
            array[(array.length - 1) - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int [] rsl = new int [] {4,1,6,2};
        for (int i: back(rsl)) {
            System.out.println(i);

        }
    }
}
