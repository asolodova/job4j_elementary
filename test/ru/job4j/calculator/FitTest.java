package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    // man
    @Test
    public void whenManHeight200ThenWeight115() {
        double out = Fit.manWeight(200);
        Assert.assertEquals(114.99 ,out, 0.01);
    }

    @Test
    public void whenManHeight0ThenWeight0() {
        double out = Fit.manWeight(0);
        Assert.assertEquals(0 ,out, 0.01);
    }

    @Test
    public void whenManHeight60ThenWeigh69() {
        double out = Fit.manWeight(160);
        Assert.assertEquals(69.0 ,out, 0.01);
    }

    // woman
    @Test
    public void whenWomanHeight60ThenWeight57() {
        double out = Fit.womanWeight(160);
        Assert.assertEquals(57.49 ,out, 0.01);
    }
    @Test
    public void whenWomanHeight0ThenWeight0() {
        double out = Fit.womanWeight(0);
        Assert.assertEquals(0 ,out, 0.01);
    }

    @Test
    public void whenWomanHeight60ThenWeight20() {
        double out = Fit.womanWeight(60);
        Assert.assertEquals(20 ,out, 0.01);
    }
}