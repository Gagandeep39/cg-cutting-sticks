# Team Project

- [Team Project](#team-project)
  - [Problem statement](#problem-statement)
  - [Requirement](#requirement)
  - [Pictorial images for explanation](#pictorial-images-for-explanation)

## Problem statement

- You have to cut a wood stick into pieces. The most affordable company, charges money according to the length of the stick being cut. Their procedure of work requires that they only make one cut at a time. It is easy to notice that different selections in the order of cutting can led to different prices.
- For example:consider a stick of length 10 meters that has to be cut at 2, 4 and 7 meters from one end.There are several choices. One can be cutting first at 2, then at 4, then at 7. This leads to a price of 10 + 8 + 6 = 24 because the first stick was of 10 meters, the resulting of 8 and the last one of 6. Another choice could be cutting at 4, then at 2, then at 7. This would lead to a price of 10 + 4 + 6 = 20, which is a better price. Your boss trusts your computer abilities to find out the minimum cost for cutting a given stick.

## Requirement

- [x] Code
- [ ] Word doc
  - [ ] Algorthm
- [ ] Junit test cases
- [x] Time complexities
- [ ] Pictorial images for explanation

## Algorithm

1. Enter the cutting points and length of wood
2. Calculate the starting length and endlind lenth of wood (Initially euqal to length of stick)
3. if start cutting index is less than last cutting index return 0 else go to next step
4. Calculate current cost ( Diff between end and start length)
5. Initialize min cost with any large number
6. Recursively run steps 2-4 to calculate min price for starting and ending part of wood
7. Assign calculated price to min cost of step 4
8. Calculate total cost as current cost (Step 5) + newly added min cost(Step 6)

```java
for (int i = startIdx; i <= endIdx; i++) {
  int currentMinCost = getMinCost(arr, startLength, arr[i], startIdx, i - 1)
      + getMinCost(arr, arr[i], endLength, i + 1, endIdx);
  if (currentMinCost < minCost)
    minCost = currentMinCost;
}
```

## Time complexity

- O(3 pow (n-1))
  - Each function call its itself tice insie a form loop

## Pictorial images for explanation

- ![Sticks](sticks-1.png)
