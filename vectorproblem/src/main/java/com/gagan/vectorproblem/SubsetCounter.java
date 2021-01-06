package com.gagan.vectorproblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

/**
 * Hello world!
 *
 */
public class SubsetCounter {


    // Function that return the
    // count of subset such that
    // Math.min(S) + Math.max(S) < K
    public static int getSubsetCount(Vector<Integer> arr, int K) {

        // Sorting the array
        Collections.sort(arr);

        int left, right;
        left = 0;
        right = arr.size() - 1;

        // ans stores total number
        // of subsets
        int ans = 0;

        while (left <= right) {
            if (arr.get(left) + arr.get(right) <= K) {

                // Add all posible subsets
                // between i and j
                // ans += Math.pow(2, right - left);
                // Two Pointer Technique to count the number of subsets
                ans += 1 << (right - left);
                left++;
            } else {

                // Decrease the sum
                right--;
            }
        }
        return ans;
    }

    // Driver code
    public static void main(String[] args) {
        Integer arr[] = {2, 4, 5, 7};
        Vector<Integer> list = new Vector<Integer>(Arrays.asList(arr));
        int K =8;
        System.out.println("Total subsets: " + getSubsetCount(list, K));
    }
}
