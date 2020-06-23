package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
public class MaxTest {
    @Test
    public void max() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void max1() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void max2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void testMax() {
        int rsl = Max.max(1, 2, 3);
        assertThat(rsl, is(3));
    }

    @Test
    public void testMax1() {
        int rsl = Max.max(4, 5, 6, 2);
        assertThat(rsl, is(6));
    }
}