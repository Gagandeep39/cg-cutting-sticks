package cuttingsticks;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CuttingSticksTest {
    /**
     * Input: { 2, 4, 7 }, 10
     * Output: 20
     * Description:  10 + 4 + 6
     */
    @Test
    public void ValidData() {
        int arr[] = { 2, 4, 7 };
        int length = 10;
        assertEquals(20, CuttingStick.getMinCost(arr, length));
    }

    /**
     * Input: { 2, 4, 7, 12 }, 20
     * Output: 43
     * Description:  20 (12,8) + 12(7,5) + 7(4,3) + 4(2,2)
     */
    @Test
    public void ValidDataTwo() {
        int arr[] = { 2, 4, 7, 12 };
        int length = 20;
        assertEquals(43, CuttingStick.getMinCost(arr, length));
    }

    /**
     * Input: { 25, 50, 75 }, 100
     * Output: 200
     * Description:  
     */
    @Test
    public void ValidDataThree() {
        int arr[] = { 25, 50, 75 };
        int length = 100;
        assertEquals(CuttingStick.getMinCost(arr, length), 200);
    }

    /**
     * Input: { 4, 5, 7, 8 }, 10
     * Output: 22
     * Description:  
     */
    @Test
    public void ValidDataFour() {
        int arr[] = { 4, 5, 7, 8 };
        int length = 10;
        assertEquals(CuttingStick.getMinCost(arr, length), 22);
    }

    /**
     * Input: { 4, 5, 7, 8 }, 2
     * Output: Exception
     * Description: 
     */
    @Test(expected = RuntimeException.class)
    public void FailDataOne() {
        int arr[] = { 4, 5, 7, 8 };
        int length = 2;
        CuttingStick.getMinCost(arr, length);
    }
}
