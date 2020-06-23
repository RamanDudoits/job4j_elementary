package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when1122DistanceThen141Result() {
        Point point = new Point(0, 1);
        Point point1 = new Point(1, 0);
        double expected = 1.41;
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point point = new Point(0, 0, 1);
        Point point1 = new Point(0, 1, 0);
        double expected = 1.0;
        double out = point.distance3d(point1);
        Assert.assertEquals(expected, out, 0.01);
    }
}