public class ArrayOps {
  public static int sum(int[] arr) {
    int totalSum = 0;
    for (int i = 0; i < arr.length; i++) {
      totalSum += arr[i];
    }
    return totalSum;
  }
  public static int largest(int[] arr) {
    int biggest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (biggest < arr[i]) {
        biggest = arr[i];
      }
    }
    return biggest;
  }
}
