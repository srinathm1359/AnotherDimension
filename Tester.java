import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    int[] arrOneDimension = {1,2,3};
    System.out.println("Testing sum() on array " + Arrays.toString(arrOneDimension));
    System.out.println(ArrayOps.sum(arrOneDimension));
    System.out.println("Testing largest() on array " + Arrays.toString(arrOneDimension));
    System.out.println(ArrayOps.largest(arrOneDimension));
    int[][] arrTwoDimension = {{2,3,5},{7,11,13}};
    System.out.println("Testing sumRows() on array " + Arrays.deepToString(arrTwoDimension));
    System.out.println(Arrays.toString(ArrayOps.sumRows(arrTwoDimension)));
    System.out.println("Testing largestInRows() on array " + Arrays.deepToString(arrTwoDimension));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(arrTwoDimension)));
    System.out.println("Testing sum() on array " + Arrays.deepToString(arrTwoDimension));
    System.out.println(ArrayOps.sum(arrTwoDimension));
    System.out.println("Testing transpose() on array" + Arrays.deepToString(arrTwoDimension));
    System.out.println(Arrays.deepToString(ArrayOps.transpose(arrTwoDimension)));
  }
}
