package cuttingsticks;

class CuttingStick {

  private static int counter = 0;

  public static int getMinCost(int[] arr, int length) {
    for (int i : arr) {
      if (i > length)
        throw new RuntimeException("Cutting point is larger than stick length");
    }
    return getMinCost(arr, 0, length, 0, arr.length - 1);
  }

  //******************************************************
  // * @arr - Array
  // * ------- Stick length -------
  // * @startLength - starting point of stick
  // * @endLength - End point of stick
  // * ------- Points for which the price is to be calculated -------
  // * @startIdx - Starting index between cutting points
  // * @endIdx - Ending index between cutting points
  // *****************************************************
  private static int getMinCost(int[] arr, int startLength, int endLength, int startIdx, int endIdx) {
    // System.out.println("Stick length: " + startLength + ", " + endLength);
    // System.out.println("Array index: " + startIdx + ", " + endIdx);
    // counter++;
    // System.out.println("------------");
    // Wood cannot be further divided
    if (startIdx > endIdx) return 0;
    // Find current Cost - Length of stick
    int currentCost = endLength - startLength;
    // Temp variable -Initialize the additional cost iwth MAX int value
    int minCost = Integer.MAX_VALUE;
    // Check different cuting point such that cost will be minimum recursively
    for (int i = startIdx; i <= endIdx; i++) {
      int currentMinCost = getMinCost(arr, startLength, arr[i], startIdx, i - 1)
          + getMinCost(arr, arr[i], endLength, i + 1, endIdx);
      if (currentMinCost < minCost) {
        minCost = currentMinCost;
      }
    }
    // Return the cost for that wood section
    return currentCost + minCost;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 5, 6, 7 };
    int length = 10;
    int minCost = getMinCost(arr, length);
    System.out.println("Min Cost : " + minCost);
    // System.out.println(counter+"");
  }
}
