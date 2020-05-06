package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    // man
    @Test
    public void whenManHeight200ThenWeight115() {
        double out = Fit.manWeight(200);
        Assert.assertEquals(114.99, out, 0.01);
    }

    @Test
    public void whenManHeight100ThenWeight0() {
        double out = Fit.manWeight(100);
        Assert.assertEquals(0, out, 0.01);
    }

    @Test
    public void whenManHeight110ThenWeigh11() {
        double out = Fit.manWeight(110);
        Assert.assertEquals(11.5, out, 0.01);
    }

    // woman
    @Test
    public void whenWomanHeight60ThenWeight57() {
        double out = Fit.womanWeight(160);
        Assert.assertEquals(57.49, out, 0.01);
    }

    @Test
    public void whenWomanHeight110ThenWeight0() {
        double out = Fit.womanWeight(110);
        Assert.assertEquals(0, out, 0.01);
    }

    @Test
    public void whenWomanHeight120ThenWeight11() {
        double out = Fit.womanWeight(120);
        Assert.assertEquals(11.5, out, 0.01);
    }
}