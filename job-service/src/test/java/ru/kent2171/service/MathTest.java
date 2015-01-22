package ru.kent2171.service;

import org.junit.Assert;
import org.junit.Test;

public class MathTest {
    @Test
    public void factorial() {
        Assert.assertEquals(1, Math.factorial(1), 0);
        Assert.assertEquals(1, Math.factorial(0), 0);
        Assert.assertEquals(6, Math.factorial(3), 0);
        Assert.assertEquals(24, Math.factorial(4), 0);
        
    }
}
