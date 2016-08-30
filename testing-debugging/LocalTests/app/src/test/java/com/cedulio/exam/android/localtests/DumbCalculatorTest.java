package com.cedulio.exam.android.localtests;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by ceduliocezar on 30/08/16.
 */
public class DumbCalculatorTest {

    @Test
    public void testSum() {

        int number1 = 1;
        int number2 = 2;

        DumbCalculator calculator = new DumbCalculator();

        int actual = calculator.sum(number1, number2);

        int expected = 3;

        Assert.assertEquals(expected, actual);
    }

}
