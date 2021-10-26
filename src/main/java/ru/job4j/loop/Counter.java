package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        int i;

        if (start == finish) {
            return start + finish;
        } else {
            for (i = start; i <= finish; i++) {
                sum += i;
            }
            return sum;
        }
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;

        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                if (start == finish) {
                    sum = start + finish;
                } else {
                    sum = sum + i;
                }
            }
        }
        return sum;
    }

    public static void main(String[]args) {
            System.out.println(sum(0, 2));
            System.out.println(sum(1, 3));
            System.out.println(sum(3, 3));
        }
    }
