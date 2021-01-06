package cuttingsticks;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CuttingSticksTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void ValidData() {
        int arr[] = { 2, 4, 7 };
        int length = 10;
        assertEquals(20, CuttingStick.getMinCost(arr, length));
    }

    @Test
    public void ValidDataTwo() {
        int arr[] = { 2, 4, 7, 12 };
        int length = 20;
        assertEquals(43, CuttingStick.getMinCost(arr, length));
    }

    @Test
    public void ValidDataThree() {
        int arr[] = { 25, 50, 75 };
        int length = 100;
        assertEquals(CuttingStick.getMinCost(arr, length), 200);
    }

    @Test
    public void ValidDataFour() {
        int arr[] = { 4, 5, 7, 8 };
        int length = 10;
        assertEquals(CuttingStick.getMinCost(arr, length), 22);
    }

    @Test(expected = RuntimeException.class)
    public void FailDataOne() {
        int arr[] = { 4, 5, 7, 8 };
        int length = 2;
        CuttingStick.getMinCost(arr, length);
    }
}
