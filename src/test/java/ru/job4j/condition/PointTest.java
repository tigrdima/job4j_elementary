package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = b.distance(a);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to20Then2() {
            double expected = 2;
            Point a = new Point(2, 2);
            Point b = new Point(2, 0);
            double out = b.distance(a);
            Assert.assertEquals(expected, out, 0.01);
        }

    @Test
    public void when13to01Then2Dot23() {
        double expected = 2.23;
        int x1 = 1;
        int y1 = 3;
        int x2 = 0;
        int y2 = 1;
        Point a = new Point(1, 3);
        Point b = new Point(0, 1);
        double out = b.distance(a);
        Assert.assertEquals(expected, out, 0.01);
    }
}