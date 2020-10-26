import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    int[] arrOneDimension = {1,2,3};
    System.out.println("Testing sum() on array {1,2,3}");
    System.out.println(ArrayOps.sum(arrOneDimension));
    System.out.println("Testing largest() on array {1,2,3}");
    System.out.println(ArrayOps.largest(arrOneDimension));
  }

}
