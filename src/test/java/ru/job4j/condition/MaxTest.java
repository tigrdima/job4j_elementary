package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

   @Test
   public void whenMoreIs5() {
       Max max = new Max();
       int result = max.max(3, 4, 5);
       int expected = 5;
       Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMoreIs20() {
        Max max = new Max();
        int result = max.max(6, 1, 8, 10);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMoreIs30() {
        Max max = new Max();
        int result = max.max(2, 30);
        int expected = 30;
        Assert.assertEquals(result, expected);
    }
}