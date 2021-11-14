package ru.job4j.condition;

public class Max {

    public int max(int left, int right) {
        return left > right ? left : right;
    }

    public int max(int left, int right, int third) {
        int temp = max(right, third);
        return max(left, temp);
    }

    public int max(int first, int second, int third, int fourth) {
        int temp = max(third, fourth);
        int temp1 = max(first, second);
        return max(temp, temp1);
    }
}
