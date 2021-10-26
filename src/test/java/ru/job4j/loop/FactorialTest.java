package ru.job4j.loop;

import org.junit.Test;

import org.junit.Assert;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialFor5Then120() {
        int in = 5;
        int result = Factorial.calc(in);
        int expected = 120;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenCalculateFactorialFor0Then1() {
        int in = 0;
        int result = Factorial.calc(in);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }
}