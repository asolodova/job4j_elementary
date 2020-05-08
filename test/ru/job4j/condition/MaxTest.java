package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxTest {

    @Test
    public void maxRightMoreLeft() {
        int out = Max.max(10, 20);
        assertEquals(20, out);
    }

    @Test
    public void maxRightLessLeft() {
        int out = Max.max(10, 2);
        assertEquals(10, out);
    }

    @Test
    public void maxRightEqualLeft() {
        int out = Max.max(2, 2);
        assertEquals(2, out);
    }

    @Test
    public void maxRightLeftEquals0() {
        int out = Max.max(0, 0);
        assertEquals(0, out);
    }

    @Test
    public void maxRightLeftNegative() {
        int out = Max.max(-100, 0);
        assertEquals(0, out);
    }

    @Test
    public void maxRightLeftNegativeAll() {
        int out = Max.max(-100, -100);
        assertEquals(-100, out);
    }

    @Test
    public void max3parameters123() {
        assertEquals(3, Max.max(1, 2, 3));
    }

    @Test
    public void max3parameters1and5andMinus3() {
        assertEquals(5, Max.max(1, 5, -3));

    }

    @Test
    public void max3parametersMinus1andMinus5andMinus3() {
        assertEquals(-1, Max.max(-1, -5, -3));

    }

    @Test
    public void max4parameters1234() {
        assertEquals(4, Max.max(1, 2, 3, 4));
    }

    @Test
    public void max4parameters1and5andMinus3and55() {
        assertEquals(55, Max.max(1, 5, -3, 55));

    }

    @Test
    public void max4parametersMinus1andMinus5andMinus3andMinus4() {
        assertEquals(-1, Max.max(-1, -5, -3, -4));

    }
}