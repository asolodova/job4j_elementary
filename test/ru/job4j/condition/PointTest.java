package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenPoints1155ThenDistance5() {
        Point a = new Point(1, 1);
        Point b = new Point(5, 5);
        Assert.assertEquals(5.65, a.distance(b), 0.01);
    }

    @Test
    public void whenPoints0000ThenDistance0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Assert.assertEquals(0, a.distance(b), 0.01);
    }

    @Test
    public void whenPoints1111ThenDistance0() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        Assert.assertEquals(0, a.distance(b), 0.01);
    }

    @Test
    public void whenPoints525222ThenDistance70() {
        Point a = new Point(52, 52);
        Point b = new Point(2, 2);
        Assert.assertEquals(70.71, a.distance(b), 0.01);
    }

    @Test
    public void whenPoints1000100020000500000ThenDistance499361() {
        Point a = new Point(1000, 1000);
        Point b = new Point(20000, 500000);
        Assert.assertEquals(499361.59, a.distance(b), 0.01);
    }

    @Test
    public void when3dPositivePoints() {
        Point a = new Point(10, 10, 10);
        Point b = new Point(20, 20, 20);
        Assert.assertEquals(14.14, a.distance(b), 0.01);
    }

    @Test
    public void when3dNegativePoints() {
        Point a = new Point(-10, -10, -10);
        Point b = new Point(20, 20, 20);
        Assert.assertEquals(42.42, a.distance(b), 0.01);
    }
}
