package my.alg;

/**
 * Created by 212441280 on 5/17/17.
 */
public class FindMissingNumberInSequence {

  public Integer findMissingXOR(int[] inArray) {
    if (null == inArray || inArray.length == 0) {
      return null;
    }
//    Integer missing = 1 ^ inArray[0];
//    for (int i = 1; i < inArray.length; i++) {
//      int m = missing ^ ((i+1) ^ inArray[i]);
//      System.out.println("The " + i + " XOR " + inArray[i] + " = " + m);
//      missing = m;
//    }
    int missing = 0;
    for (int i = 0; i < inArray.length; i++) {
      System.out.print(missing + " XOR " + (i+1) + " XOR " + inArray[i] + " = ");
      missing = missing ^ i + 1 ^ inArray[i];
      System.out.println(missing);
    }
    missing = missing ^ inArray.length + 1;
    return missing;
  }

  public Integer findMissing(int[] inArray, int max) {
    if (null == inArray || inArray.length == 0) {
      return null;
    }
    if (max != inArray[inArray.length -1]) {
      return max;
    }
    Integer missing = findMissing(inArray, 0, inArray.length - 1);
    return missing;
  }

  private Integer findMissing(int[] inArray, int startIndex, int endIndex) {
    if (startIndex >= endIndex) {
      if (inArray[startIndex] == startIndex + 1) {
        return startIndex + 2;
      } else {
        return startIndex + 1;
      }
    }
    int middle = startIndex + (int) (endIndex - startIndex)/2;
    if (inArray[middle] != middle + 1) {
      return findMissing(inArray, startIndex, middle - 1);
    } else {
      return findMissing(inArray, middle + 1, endIndex);
    }
  }
}
