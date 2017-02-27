package ru.src.main.java;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

/**
 * Created by ISS on 27.02.2017.
 */
public class SqareTests {
    @Test
    public void testArea(){
        Point s = new Point ();
        Assert.assertEquals(s.distance (1,2,4,6),5.0);
    }
}
