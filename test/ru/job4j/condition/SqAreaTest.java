package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenK0ThenSquare0() {
        double out = SqArea.square(10, 0);
        Assert.assertEquals(0 ,out, 0.01);
    }
    @Test
    public void whenP0ThenSquare0() {
        double out = SqArea.square(0, 10);
        Assert.assertEquals(0 ,out, 0.01);
    }
    @Test
    public void whenPMinus10ThenSquare0() {
        double out = SqArea.square(-10, 10);
        Assert.assertEquals(0 ,out, 0.01);
    }
    @Test
    public void whenKMinus10ThenSquare0() {
        double out = SqArea.square(10, -10);
        Assert.assertEquals(0 ,out, 0.01);
    }
    @Test
    public void whenKMinus10PMinus10ThenSquare0() {
        double out = SqArea.square(-10, -10);
        Assert.assertEquals(0 ,out, 0.01);
    }
    @Test
    public void whenK10P10ThenSquare0() {
        double out = SqArea.square(10, 10);
        Assert.assertEquals(0 ,out, 0.01);
    }
    @Test
    public void whenK10P200ThenSquare0() {
        double out = SqArea.square(200, 10);
        Assert.assertEquals(810.0 ,out, 0.01);
    }
    @Test
    public void whenK2P8ThenSquare0() {
        double out = SqArea.square(8, 2);
        Assert.assertEquals(2.0 ,out, 0.01);
    }
}
