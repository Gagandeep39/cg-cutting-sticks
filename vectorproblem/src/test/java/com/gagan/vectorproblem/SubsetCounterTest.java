package com.gagan.vectorproblem;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Vector;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SubsetCounterTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void validOne() {
        Integer arr[] = { 2, 4, 5, 7, 6, 8 };
        Vector<Integer> list = new Vector<Integer>(Arrays.asList(arr));
        assertEquals(63, SubsetCounter.getSubsetCount(list, 20));
    }

    @Test
    public void validTwo() {
        Integer arr[] = { 1, 4, 3, 2};
        Vector<Integer> list = new Vector<Integer>(Arrays.asList(arr));
        assertEquals(15, SubsetCounter.getSubsetCount(list,8));
    }

    @Test
    public void validThree() {
        Integer arr[] = { 2, 4, 2, 5, 7};
        Vector<Integer> list = new Vector<Integer>(Arrays.asList(arr));
        assertEquals(27, SubsetCounter.getSubsetCount(list, 10));
    }

}
