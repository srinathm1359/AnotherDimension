import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    int[] arrOneDimension = {1,2,3};
    System.out.println("Testing sum() on array " + Arrays.toString(arrOneDimension));
    System.out.println(ArrayOps.sum(arrOneDimension) + "\n");
    System.out.println("Testing largest() on array " + Arrays.toString(arrOneDimension));
    System.out.println(ArrayOps.largest(arrOneDimension) + "\n");
    int[][] arrTwoDimension = {{2,3,5},{7,11,13}};
    System.out.println("Testing sumRows() on array " + Arrays.deepToString(arrTwoDimension));
    System.out.println(Arrays.toString(ArrayOps.sumRows(arrTwoDimension)) + "\n");
    System.out.println("Testing largestInRows() on array " + Arrays.deepToString(arrTwoDimension));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(arrTwoDimension)) + "\n");
    System.out.println("Testing sum() on array " + Arrays.deepToString(arrTwoDimension));
    System.out.println(ArrayOps.sum(arrTwoDimension) + "\n");
    System.out.println("Testing transpose() on array" + Arrays.deepToString(arrTwoDimension));
    System.out.println(Arrays.deepToString(ArrayOps.transpose(arrTwoDimension)) + "\n");
    System.out.println("Testing sumCols() on array" + Arrays.deepToString(arrTwoDimension));
    System.out.println(Arrays.toString(ArrayOps.sumCols(arrTwoDimension)) + "\n");
    System.out.println("Testing isRowMagic() on array" + Arrays.deepToString(arrTwoDimension));
    System.out.println(ArrayOps.isRowMagic(arrTwoDimension) + "\n");
    int[][] arrTwoDimension2 = {{2,4,6},{1,8,3}};
    System.out.println("Testing isRowMagic() on array" + Arrays.deepToString(arrTwoDimension2));
    System.out.println(ArrayOps.isRowMagic(arrTwoDimension2) + "\n");
    System.out.println("Testing isColMagic() on array" + Arrays.deepToString(arrTwoDimension));
    System.out.println(ArrayOps.isColMagic(arrTwoDimension) + "\n");
    int[][] arrTwoDimension3 = {{1,2,3},{6,5,4}};
    System.out.println("Testing isColMagic() on array" + Arrays.deepToString(arrTwoDimension3));
    System.out.println(ArrayOps.isColMagic(arrTwoDimension3));
  }
}
