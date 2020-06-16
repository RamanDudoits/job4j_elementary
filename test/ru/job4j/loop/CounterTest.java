package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sumByEven() {
        int rsl = Counter.sumByEven(3, 10);
        int expected = 28;
        assertThat(rsl, is(expected));
    }
}