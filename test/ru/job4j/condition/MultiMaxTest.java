package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(4, 1, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondThenMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondTheMax() {
        int result = MultiMax.max(1, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondTMax() {
        int result = MultiMax.max(4, 4, 4);
        assertThat(result, is(4));
    }
}