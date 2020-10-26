import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    int[] arrOneDimension = {1,2,3};
    //Testing sum()
    System.out.println("Testing sum() on array " + Arrays.toString(arrOneDimension));
    System.out.println(ArrayOps.sum(arrOneDimension) + "\n");
    //Testing largest()
    System.out.println("Testing largest() on array " + Arrays.toString(arrOneDimension));
    System.out.println(ArrayOps.largest(arrOneDimension) + "\n");
    int[][] arrTwoDimension = {{2,3,5},{7,11,13}};
    //Testing sumRows()
    System.out.println("Testing sumRows() on array " + Arrays.deepToString(arrTwoDimension));
    System.out.println(Arrays.toString(ArrayOps.sumRows(arrTwoDimension)) + "\n");
    //Testing largestInRows()
    System.out.println("Testing largestInRows() on array " + Arrays.deepToString(arrTwoDimension));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(arrTwoDimension)) + "\n");
    //Testing sum() for two dimensional array
    System.out.println("Testing sum() on array " + Arrays.deepToString(arrTwoDimension));
    System.out.println(ArrayOps.sum(arrTwoDimension) + "\n");
    //Testing transpose()
    System.out.println("Testing transpose() on array" + Arrays.deepToString(arrTwoDimension));
    System.out.println(Arrays.deepToString(ArrayOps.transpose(arrTwoDimension)) + "\n");
    //Testing sumCols()
    System.out.println("Testing sumCols() on array" + Arrays.deepToString(arrTwoDimension));
    System.out.println(Arrays.toString(ArrayOps.sumCols(arrTwoDimension)) + "\n");
    //Testing isRowMagic()
    System.out.println("Testing isRowMagic() on array" + Arrays.deepToString(arrTwoDimension));
    System.out.println(ArrayOps.isRowMagic(arrTwoDimension) + "\n");
    int[][] arrTwoDimension2 = {{2,4,6},{1,8,3}};
    System.out.println("Testing isRowMagic() on array" + Arrays.deepToString(arrTwoDimension2));
    System.out.println(ArrayOps.isRowMagic(arrTwoDimension2) + "\n");
    //Testing isColMagic()
    System.out.println("Testing isColMagic() on array" + Arrays.deepToString(arrTwoDimension));
    System.out.println(ArrayOps.isColMagic(arrTwoDimension) + "\n");
    int[][] arrTwoDimension3 = {{1,2,3},{6,5,4}};
    System.out.println("Testing isColMagic() on array" + Arrays.deepToString(arrTwoDimension3));
    System.out.println(ArrayOps.isColMagic(arrTwoDimension3) + "\n");
    int[][] arrTwoDimension4 = {{1,2,4},{6,5,4}};
    //Testing isLocationMagic()
    System.out.println("Testing isLocationMagic() on array" + Arrays.deepToString(arrTwoDimension4) + " in position (0,0)");
    System.out.println(ArrayOps.isLocationMagic(arrTwoDimension4, 0, 0) + "\n");
    System.out.println("Testing isLocationMagic() on array" + Arrays.deepToString(arrTwoDimension4) + " in position (0,1)");
    System.out.println(ArrayOps.isLocationMagic(arrTwoDimension4, 0, 1) + "\n");
    System.out.println("Testing isLocationMagic() on array" + Arrays.deepToString(arrTwoDimension4) + " in position (1,1)");
    System.out.println(ArrayOps.isLocationMagic(arrTwoDimension4, 1, 1));
  }
}
