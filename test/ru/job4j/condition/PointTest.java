package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenPoints1155ThenDistance5() {
        double out = Point.distance(1, 1, 5, 5);
        Assert.assertEquals(5.65 ,out, 0.01);
    }
    @Test
    public void whenPoints0000ThenDistance0() {
        double out = Point.distance(0, 0, 0, 0);
        Assert.assertEquals(0 ,out, 0.01);
    }
    @Test
    public void whenPoints1111ThenDistance0() {
        double out = Point.distance(1, 1, 1, 1);
        Assert.assertEquals(0 ,out, 0.01);
    }
    @Test
    public void whenPoints52_52_2_2ThenDistance70() {
        double out = Point.distance(52, 52, 2, 2);
        Assert.assertEquals(70.71 ,out, 0.01);
    }
    @Test
    public void whenPoints1000_1000_20000_500000ThenDistance499361() {
        double out = Point.distance(1000, 1000, 20000, 500000);
        Assert.assertEquals(499361.59 ,out, 0.01);
    }
}
