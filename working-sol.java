
// import java.io.*;
// import java.util.*;

// class CuttingStick {

// private static int getMinCost(int[] arr, int length) {
// return getMinCost(arr, 0, length, 0, arr.length - 1);
// }

// private static int getMinCost(int[] arr, int startLength, int endLength, int
// startIdx, int endIdx) {
// if (startIdx > endIdx)
// return 0;
// System.out.println("startIdx -> " + startIdx + " endIdx -> " + endIdx);
// int currentCost = endLength - startLength;
// int minCost = Integer.MAX_VALUE;
// for (int i = startIdx; i <= endIdx; i++) {
// int currentMinCost = getMinCost(arr, startLength, arr[i], startIdx, i - 1)
// + getMinCost(arr, arr[i], endLength, i + 1, endIdx);
// if (currentMinCost < minCost)
// minCost = currentMinCost;
// }
// return currentCost + minCost;
// }

// public static void main(String[] args) {
// int arr[] = { 4, 5, 7, 8 };
// int length = 10;
// int minCost = getMinCost(arr, length);
// System.out.println("Min Cost -> " + minCost);
// }
// }

// import java.io.*;
// import java.util.*;

// class CuttingStick {
// private static class Pair {
// int start;
// int end;

// @Override
// public boolean equals(Object o) {
// Pair p = (Pair) o;

// return (start == p.start) && (end == p.end);
// }

// public int hashCode() {
// int prime = 101;

// return prime * start + end;
// }
// }

// private static int getMinCost(int[] arr, int length) {
// HashMap<Pair, Integer> memoMap = new HashMap<Pair, Integer>();
// return getMinCost(arr, 0, length, 0, arr.length - 1, memoMap);
// }

// private static int getMinCost(int[] arr, int startLength, int endLength, int
// startIdx, int endIdx,
// HashMap<Pair, Integer> memoMap) {
// if (startIdx > endIdx)
// return 0;

// Pair pair = new Pair();
// pair.start = startIdx;
// pair.end = endIdx;

// if (memoMap.containsKey(pair))
// return memoMap.get(pair);

// System.out.println("startIdx -> " + startIdx + " endIdx -> " + endIdx);

// int currentCost = endLength - startLength;
// int minCost = Integer.MAX_VALUE;

// for (int i = startIdx; i <= endIdx; i++) {
// int currentMinCost = getMinCost(arr, startLength, arr[i], startIdx, i - 1,
// memoMap)
// + getMinCost(arr, arr[i], endLength, i + 1, endIdx, memoMap);

// if (currentMinCost < minCost)
// minCost = currentMinCost;
// }

// memoMap.put(pair, currentCost + minCost);

// return currentCost + minCost;
// }

// public static void main(String[] args) {

// int arr[] = { 25, 50, 75 };
// int length = 100;
// int minCost = getMinCost(arr, length);
// System.out.println("Min Cost -> " + minCost);
// }
// }