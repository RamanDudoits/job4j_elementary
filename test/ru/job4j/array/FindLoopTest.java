package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas7Then0() {
        int value = 7;
        int result = FindLoop.indexOf(new int[]{0, 1, 2, 3, 4, 5}, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas4Then0() {
        int value = 4;
        int result = FindLoop.indexOf(new int[]{0, 1, 2, 3, 4, 5}, value);
        int expect = 4;
        assertThat(result, is(expect));
    }
}