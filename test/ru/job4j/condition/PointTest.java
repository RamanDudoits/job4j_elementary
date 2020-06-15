package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when1122DistanceThen141Result() {
        int x1 = 1, x2 = 2, y1 = 1, y2 = 2;
        double expected = 1.414;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}