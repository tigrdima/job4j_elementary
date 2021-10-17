package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2square2() {
        double expected = 2;
        double p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K1square2() {
            double expected = 4;
            double p = 8;
            double k = 1;
            double out = SqArea.square(p, k);
            Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP1K1square2() {
            double expected = 0.06;
            double p = 1;
            double k = 1;
            double out = SqArea.square(p, k);
            Assert.assertEquals(expected, out, 0.01);
    }
    }
