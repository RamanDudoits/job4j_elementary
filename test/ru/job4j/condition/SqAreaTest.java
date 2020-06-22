package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SqAreaTest {
    @Test
    public void whenPandKThen2Square() {
        int p = 6, k = 2;
        double expected = 2.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenp4k1s1() {
        int k = 1;
        int p = 4;
        double expected = 1.0;
        double out = SqArea.square(p, k);
        assertThat(out, is(expected));
    }
}