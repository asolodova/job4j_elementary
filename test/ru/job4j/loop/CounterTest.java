package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenSumEvenNumbersFromThreeToTenThenTwentyEight() {
        int rsl = Counter.sumByEven(3, 10);
        int expected = 28;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenSumEvenNumbersFromMinusTenToTenThenZero() {
        int rsl = Counter.sumByEven(-10, 10);
        int expected = 0;
        assertThat(rsl, is(expected));
    }
}