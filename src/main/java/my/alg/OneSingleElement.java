package my.alg;

/**
 * Given an Array of sorted integers with consecutive repeating numbers and one non repeating number, find the non repeating number.
 * <br>
 *   Example:
 *   <li>input: [1, 1, 4, 4, 9, 9, 14]; output : 14</li>
 *   <li>input: [17, 17, 24, 29, 29, 34, 34]; output : 24</li>
 * </br>
 * This class has O(n) and O(log n) implementations.
 * <br>
 * Created by 212441280 on 5/10/17.
 */
public class OneSingleElement {

  /**
   * O(n)
   *
   * @param sortedOneSingleArr
   * @return
   */
  public Integer findSingleElement_On(int[] sortedOneSingleArr) {
    Integer element = null;
    int i = 1;
    for (; i < sortedOneSingleArr.length; i = i + 2) {
      if (sortedOneSingleArr[i] != sortedOneSingleArr[i-1]) {
        return new Integer(sortedOneSingleArr[i - 1]);
      }
    }
    if (i == sortedOneSingleArr.length) {
      element = new Integer(sortedOneSingleArr[i - 1]);
    }
    return element;
  }

  /**
   * O(log n)
   * @param sortedOneSingleArr
   * @return
   */
  public Integer findSingleElement_Ologn(int[] sortedOneSingleArr) {
    return findSingleElement_Ologn(sortedOneSingleArr, 0, sortedOneSingleArr.length - 1);
  }

  private Integer findSingleElement_Ologn(int[] sortedOneSingleArr, int startIndex, int endIndex) {
    int middle = startIndex + (int) (endIndex - startIndex  + 1) / 2;
    if (sortedOneSingleArr[middle] != sortedOneSingleArr[middle - 1] && sortedOneSingleArr[middle] != sortedOneSingleArr[middle + 1]) {
      return sortedOneSingleArr[middle];
    }
    if (endIndex - startIndex + 1 == 3) {
      if (sortedOneSingleArr[middle] != sortedOneSingleArr[middle - 1]) {
        return sortedOneSingleArr[middle - 1];
      } else {
        return sortedOneSingleArr[middle + 1];
      }
    }
    int leftStart = -1;
    int leftEnd = -1;
    int rightStart = -1;
    int rightEnd = -1;
    if (sortedOneSingleArr[middle] == sortedOneSingleArr[middle - 1]) {
      leftStart = 0;
      leftEnd = middle - 2;
      rightStart = middle + 1;
      rightEnd = sortedOneSingleArr.length - 1;
    }

    if (sortedOneSingleArr[middle] == sortedOneSingleArr[middle + 1]) {
      leftStart = 0;
      leftEnd = middle - 1;
      rightStart = middle + 2;
      rightEnd = sortedOneSingleArr.length - 1;
    }

    if ((leftEnd - leftStart + 1) % 2 != 0) {
      return findSingleElement_Ologn(sortedOneSingleArr, leftStart, leftEnd);
    } else if ((rightEnd - rightStart + 1) % 2 != 0) {
      return findSingleElement_Ologn(sortedOneSingleArr, rightStart, rightEnd);
    }
    return null;
  }
}
