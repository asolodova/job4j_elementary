package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void maxRightMoreLeft() {
        int out  = Max.max(10, 20);
        assertEquals(20 , out);
    }
    @Test
    public void maxRightLessLeft() {
        int out  = Max.max(10, 2);
        assertEquals(10 , out);
    }
    @Test
    public void maxRightEqualLeft() {
        int out  = Max.max(2, 2);
        assertEquals(2 , out);
    }
    @Test
    public void maxRightLeftEquals0() {
        int out  = Max.max(0, 0);
        assertEquals(0 , out);
    }
    @Test
    public void maxRightLeftNegative() {
        int out  = Max.max(-100, 0);
        assertEquals(0 , out);
    }
    @Test
    public void maxRightLeftNegativeAll() {
        int out  = Max.max(-100, -100);
        assertEquals(-100 , out);
    }
}