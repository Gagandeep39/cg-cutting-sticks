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
- [x] Word doc
  - [x] Algorthm
- [x] Junit test cases
- [x] Time complexities
<!-- - [X] Pictorial images for explanation -->

## Word doc

### Algorithm


```text
nums = [2, 4, 5, 7]
k = 8
Output: 5
Explanation: [2], [4], [2, 4], [2, 4, 5], [2, 5]
```

1. Sort the input array first.
2. Now use Two Pointer Technique to count the number of subsets.
3. Let take two pointers left and right and set left = 0 and right = N-1.
4. if (arr[left] + arr[right] <= K )
   Increment the left pointer by 1 and add 2^(j – i) into answer, because the left and right values make up a potential end values of a subset. All the values from [i, j – 1] also make up end of subsets which will have the sum < K. So, we need to calculate all the possible subsets for left = i and right ∊ [i, j]. So, after suming up values 2^(j – i + 1) + 2^(j – i – 2) + … + 2 0 of the GP, we get 2^(j – i) .
   if( arr[left] + arr[right] > K )
   Decrement the right pointer by 1.
5. Repeat the below process until left <= right.

## Time Complexity

- `O(N*log(N))` time solution, sort the numbers, then two pointer approach - leftIndex is element that must be included, rightIndex is biggest element that can be included in that set.

<!-- ## Picture -->
