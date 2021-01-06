package com.gagan.vectorproblem;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class SubsetCounter {


    // Function that return the
    // count of subset such that
    // Math.min(S) + Math.max(S) < K
    public static int getSubsetCount(int arr[], int K) {

        // Sorting the array
        Arrays.sort(arr);

        int left, right;
        left = 0;
        right = arr.length - 1;

        // ans stores total number
        // of subsets
        int ans = 0;

        while (left <= right) {
            if (arr[left] + arr[right] <= K) {

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
        int arr[] = {2, 4, 5, 7};
        int K =8;
        System.out.println("Total subsets: " + getSubsetCount(arr, K));
    }
}
