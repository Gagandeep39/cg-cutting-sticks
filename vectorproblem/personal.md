# Personal Task

- [Personal Task](#personal-task)
  - [Problem Statement](#problem-statement)
  - [Requirement](#requirement)
  - [Complexity](#complexity)
  - [Code](#code)
  - [Word doc](#word-doc)
    - [Algorithm](#algorithm)

## Problem Statement

- For a given vector of integers and integer K, find the number of non-empty subsets S such that min(S) + max(S) <= K
- For example, for K = 8 and vector [2, 4, 5, 7], the solution is 5 ([2], [4], [2, 4], [2, 4, 5], [2, 5]).

## Requirement

- [x] Code
- [ ] Word doc
  - [ ] Algorthm
- [ ] Junit test cases
- [x] Time complexities
- [ ] Pictorial images for explanation

## Complexity

- Time Complexity `O(N * log N)`
- Auxiliary Space `O(1)`

## Code

```java
// Java program to print count
// of subsets S such that
// Math.min(S) + Math.max(S) < K
import java.util.*;

class GFG{

// Function that return the
// count of subset such that
// Math.min(S) + Math.max(S) < K
static int get_subset_count(int arr[], int K, int N)
{

    // Sorting the array
    Arrays.sort(arr);

    int left, right;
    left = 0;
    right = N - 1;

    // ans stores total number
    // of subsets
    int ans = 0;

    while (left <= right)
    {
        if (arr[left] + arr[right] < K)
        {

            // Add all posible subsets
            // between i and j
            ans += 1 << (right - left);
            left++;
        }
        else
        {

            // Decrease the sum
            right--;
        }
    }
    return ans;
}

// Driver code
public static void main(String[] args)
{
    int arr[] = { 2, 4, 5, 7 };
    int K = 8;
    int N = arr.length;

    System.out.print(get_subset_count(arr, K, N));
}
}
```

## Word doc

### Algorithm

- `O(N*log(N))` time solution, sort the numbers, then two pointer approach - leftIndex is element that must be included, rightIndex is biggest element that can be included in that set.

1. Sort the input array first.
2. Now use Two Pointer Technique to count the number of subsets.
3. Let take two pointers left and right and set left = 0 and right = N-1.
4. if (arr[left] + arr[right] < K )
   Increment the left pointer by 1 and add 2 j – i into answer, because the left and right values make up a potential end values of a subset. All the values from [i, j – 1] also make up end of subsets which will have the sum < K. So, we need to calculate all the possible subsets for left = i and right ∊ [i, j]. So, after suming up values 2 j – i + 1 + 2 j – i – 2 + … + 2 0 of the GP, we get 2 j – i .
   if( arr[left] + arr[right] >= K )
   Decrement the right pointer by 1.
5. Repeat the below process until left <= right.
