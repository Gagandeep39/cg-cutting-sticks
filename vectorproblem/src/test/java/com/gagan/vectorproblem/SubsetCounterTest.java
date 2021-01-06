package com.gagan.vectorproblem;

import static org.junit.Assert.assertEquals;

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
        int arr[] = { 2, 4, 5, 7, 6, 8 };
        assertEquals(63, SubsetCounter.getSubsetCount(arr, 20));
    }

    @Test
    public void validTwo() {
        int arr[] = { 1, 4, 3, 2};
        assertEquals(15, SubsetCounter.getSubsetCount(arr,8));
    }

    @Test
    public void validThree() {
        int arr[] = { 2, 4, 2, 5, 7};
        assertEquals(27, SubsetCounter.getSubsetCount(arr, 10));
    }

}
