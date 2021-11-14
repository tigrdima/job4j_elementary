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
    public void when137to461Then7Dot34() {
        double expected = 7.34;
        Point a = new Point(1, 3, 7);
        Point b = new Point(4, 6, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to01Then2Dot23() {
        double expected = 2.23;
        Point a = new Point(1, 3);
        Point b = new Point(0, 1);
        double out = b.distance(a);
        Assert.assertEquals(expected, out, 0.01);
    }
}