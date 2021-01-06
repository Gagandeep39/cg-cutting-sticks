package main.java.cuttingsticks;

class CuttingStick {

  private static int getMinCost(int[] arr, int length) {
    return getMinCost(arr, 0, length, 0, arr.length - 1);
  }

  /**
   * @arr - Array
   * @startLength - starting point of stick
   * @endLength - End point of stick
   * @startIdx - Starting index between cutting points
   * @endIdx - Ending index between cutting points
   */
  private static int getMinCost(int[] arr, int startLength, int endLength, int startIdx, int endIdx) {
    if (startIdx > endIdx)
      return 0;
    // Find current Cost - Length of stick
    int currentCost = endLength - startLength;
    // Temp variable -Initialize the additional cost iwth MAX int value
    int minCost = Integer.MAX_VALUE;
    // Find the cuting point such that cost will be minimum recursively
    for (int i = startIdx; i <= endIdx; i++) {
      int currentMinCost = getMinCost(arr, startLength, arr[i], startIdx, i - 1)
          + getMinCost(arr, arr[i], endLength, i + 1, endIdx);
      if (currentMinCost < minCost)
        minCost = currentMinCost;
    }
    return currentCost + minCost;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 7 };
    int length = 10;
    int minCost = getMinCost(arr, length);
    System.out.println("Min Cost -> " + minCost);
  }
}
