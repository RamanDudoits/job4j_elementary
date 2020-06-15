package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void when187ManThen10005Weight() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when165WomanThen6324Weight() {
        short in = 165;
        double expected = 63.249;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}