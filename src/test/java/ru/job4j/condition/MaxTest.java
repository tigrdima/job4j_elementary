package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

   @Test
    public void whenLeft20Right30Then30() {
        int left = 20;
        int right = 30;
        int result = Max.max(left, right);
        int expected = 30;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenLeft10Right50Then50() {
        int left = 10;
        int right = 50;
        int result = Max.max(left, right);
        int expected = 50;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenLeft60Right60Then30() {
        int left = 60;
        int right = 60;
        int result = Max.max(left, right);
        int expected = 60;
        Assert.assertEquals(result, expected);
    }
}