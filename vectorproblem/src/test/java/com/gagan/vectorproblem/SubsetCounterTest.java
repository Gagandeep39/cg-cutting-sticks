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
     * Input:: arr[] = {2, 4, 5, 7} K = 8
     * Output: 5 
     * Subsets: ([2], [4], [2, 4], [2, 4, 5], [2, 5])
     * 2+2 <=8, 4+4 <=8, 4+2 <= 8
     */
    @Test
    public void validOne() {
        Integer arr[] = { 2, 4, 5, 7 };
        Vector<Integer> list = new Vector<Integer>(Arrays.asList(arr));
        assertEquals(5, SubsetCounter.getSubsetCount(list, 8));
    }

    /**
     * Input:: arr[] = {2, 2, 5, 6} K = 7
     * Output: 5 
     * Subsets: ([2], [2], [2, 2], [2, 5], [2, 5], [2, 2, 5])
     */
    @Test
    public void validTwo() {
        Integer arr[] = { 2, 2, 5, 6 };
        Vector<Integer> list = new Vector<Integer>(Arrays.asList(arr));
        assertEquals(6, SubsetCounter.getSubsetCount(list, 7));
    }

    /**
     * Input:: arr[] = {2, 4, 2, 5, 7} K = 10
     * Output: 27
     */
    @Test
    public void validThree() {
        Integer arr[] = { 2, 4, 2, 5, 7};
        Vector<Integer> list = new Vector<Integer>(Arrays.asList(arr));
        assertEquals(27, SubsetCounter.getSubsetCount(list, 10));
    }

}
