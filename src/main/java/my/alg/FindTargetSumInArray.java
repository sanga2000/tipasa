package my.alg;

/**
 * Given an sorted integer array in acending order, find sets of 2 numbers that add up to a sum of 'x'.
 * <br>
 *   <li>Input {1, 3, 4, 5, 6, 7, 10, 11, 12, 15}; Target sum: 16; output: {[1, 15], [4, 12], [5, 11], [6, 10]}</li>
 *   <li>Input {1, 3, 4, 5, 6, 7, 10, 11, 12, 15}; Target sum: 9; output: {[3, 6], [4, 5]}</li>
 * </br>
 * Created by 212441280 on 5/12/17.
 */
public class FindTargetSumInArray {

  public int[][] findElements(int[] sortedArray, int targetSum, boolean repeated) {
    int[][] arr = new int[1 + (repeated?sortedArray.length:sortedArray.length/2)][];
    int j = 0;
    for (int i = 0; i < (repeated?sortedArray.length:sortedArray.length/2); i++) {
      int c = targetSum - sortedArray[i];
      Integer complement = findComplement(sortedArray, c, (repeated ? 0 : i + 1), sortedArray.length - 1);

      if (null != complement) {
        arr[j] = new int[2];
        arr[j][0] = sortedArray[i];
        arr[j][1] = complement.intValue();
        j++;
      }
    }
    return arr;
  }

  private Integer findComplement(int[] sortedArray, int find, int startIndex, int endIndex) {
    if (startIndex > endIndex) {
      return null;
    }
    if (endIndex - startIndex == 0 || endIndex - startIndex == 1) {
      if (sortedArray[endIndex] == find) {
        return sortedArray[endIndex];
      } else if (sortedArray[startIndex] == find) {
        return sortedArray[startIndex];
      } else {
        return null;
      }
    }
    int middle = startIndex + (int) (endIndex - startIndex + 1) / 2;
    if (sortedArray[middle] == find) {
      return find;
    } else if (sortedArray[middle] > find) {
      return findComplement(sortedArray, find, startIndex, middle - 1);
    } else {
      return findComplement(sortedArray, find, middle + 1, endIndex);
    }
  }
}
