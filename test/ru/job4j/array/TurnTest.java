package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {
    @Test
    public void whenBackToArray() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 3, 2, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenBackTo5Array() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expect = {5, 4, 3, 2, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }
}