package com.gagan.vectorproblem;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {

    // Function that return the
    // count of subset such that
    // Math.min(S) + Math.max(S) < K
    static int getSubsetCount(int arr[], int K, int N) {

        // Sorting the array
        Arrays.sort(arr);

        int left, right;
        left = 0;
        right = N - 1;

        // ans stores total number
        // of subsets
        int ans = 0;

        while (left <= right) {
            if (arr[left] + arr[right] < K) {

                // Add all posible subsets
                // between i and j
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
        int arr[] = { 2, 4, 5, 7 };
        int K = 8;
        int N = arr.length;
        System.out.print(getSubsetCount(arr, K, N));
    }
}
