package ru.job4j.loop;

import org.junit.Test;

import org.junit.Assert;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFrom1To10Then30() {
        int start = 2;
        int finish = 2;
        int result = Counter.sumByEven(start, finish);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenSumEvenNumbersFrom2To6Then12() {
        int start = 2;
        int finish = 6;
        int result = Counter.sumByEven(start, finish);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }
}