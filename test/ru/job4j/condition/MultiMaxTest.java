package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void maxFirst() {
        MultiMax check = new MultiMax();
        int max = check.max(10, 2, 3);
        assertEquals(10, max);
    }
    @Test
    public void maxSecond() {
        MultiMax check = new MultiMax();
        int max = check.max(-10, 5, 3);
        assertEquals(5, max);
    }
    @Test
    public void maxThird() {
        MultiMax check = new MultiMax();
        int max = check.max(-10, 2, 3);
        assertEquals(3, max);
    }
    @Test
    public void maxAllZero() {
        MultiMax check = new MultiMax();
        int max = check.max(0, 0, 0);
        assertEquals(0, max);
    }
}