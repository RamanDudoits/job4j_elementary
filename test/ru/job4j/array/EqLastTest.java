package ru.job4j.array;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static ru.job4j.array.EqLast.check;

import org.junit.Test;

public class EqLastTest {
    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        assertThat(check(left, right), is(true));
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2};
        int[] right = {1, 2, 4, 5};
        assertThat(check(left, right), is(false));
    }
}