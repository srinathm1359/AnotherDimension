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
  public static int[] sumRows(int[][] matrix) {
    int[] arr = new int[matrix.length];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sum(matrix[i]);
    }
    return arr;
  }
  public static int[] largestInRows(int[][] matrix) {
    int[] arr = new int[matrix.length];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = largest(matrix[i]);
    }
    return arr;
  }
  public static int sum(int[][] arr) {
    return sum(sumRows(arr));
  }
  public static int[][] transpose(int[][] matrix) {
    int transposeHeight = matrix.length;
    int transposeLength = matrix[0].length;
    int[][] transposeMatrix = new int[transposeLength][transposeHeight];
    for (int row = 0; row < transposeLength; row++) {
      for (int col = 0; col < transposeHeight; col++) {
        transposeMatrix[row][col] = matrix[col][row];
      }
    }
    return transposeMatrix;
  }
}
