package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void periodMore1() {
        Triangle rty = new Triangle(new Point(1, 3), new Point(3, 7), new Point(6, 10));
        Assert.assertEquals(8.65, rty.period(), 0.01);
    }

    @Test
    public void areaMore1() {
        Triangle rty = new Triangle(new Point(1, 3), new Point(3, 7), new Point(6, 10));
        Assert.assertEquals(2.99, rty.area(), 0.01);
    }

    @Test
    public void areaMore() {
        Triangle rty = new Triangle(new Point(4, 9), new Point(11, 15), new Point(32, 40));
        Assert.assertEquals(24.50, rty.area(), 0.01);
    }
}