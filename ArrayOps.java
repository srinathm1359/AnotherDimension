public class ArrayOps {
  public static int sum(int[] arr) {
    int totalSum = 0;
    for (int i = 0; i < arr.length; i++) {
      totalSum += arr[i];
    }
    return totalSum;
  }
}
