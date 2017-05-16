/*
 * Copyright (c) 2016 GE. All Rights Reserved.
 * GE Confidential: Restricted Internal Distribution
 */
package my.alg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Created by 212441280 on 5/12/17.
 */
public class FindTargetSumInArrayTest {
  private FindTargetSumInArray subject = new FindTargetSumInArray();

  @Test
  public void testTargetSum_InArray_LastIndex() {
    int targetSum = 10;
    int[] inputArray = new int[] {1, 3, 4, 5, 6, 7, 10};
    int[][] found = subject.findElements(inputArray, targetSum, false);
    assertNotNull(found);
    assertEquals(3, found[0][0]);
    assertEquals(7, found[0][1]);

    assertEquals(4, found[1][0]);
    assertEquals(6, found[1][1]);
  }

  @Test
  public void testTargetSum_InArray_InBetween() {
    int targetSum = 10;
    int[] inputArray = new int[] {1, 3, 4, 5, 6, 7, 10, 12, 15};
    int[][] found = subject.findElements(inputArray, targetSum, false);
    assertNotNull(found);
    assertEquals(3, found[0][0]);
    assertEquals(7, found[0][1]);

    assertEquals(4, found[1][0]);
    assertEquals(6, found[1][1]);
  }

  @Test
  public void testTargetSum_InArray_FirstIndex() {
    int targetSum = 10;
    int[] inputArray = new int[] {10, 30, 40, 50, 60, 70, 100, 102, 105};
    int[][] found = subject.findElements(inputArray, targetSum, false);
    assertNotNull(found);
    assertEquals(1 + inputArray.length/2, found.length);
    int i = 0;
    for (int[] r : found) {
      assertNull(r);
    }
  }

  @Test
  public void testTargetSum_NotInArray_BeyondLastIndex() {
    int targetSum = 16;
    int[] inputArray = new int[] {1, 3, 4, 5, 6, 7, 10, 11, 12, 15};
    int[][] found = subject.findElements(inputArray, targetSum, false);
    assertNotNull(found);
    assertEquals(1, found[0][0]);
    assertEquals(15, found[0][1]);

    assertEquals(4, found[1][0]);
    assertEquals(12, found[1][1]);

    assertEquals(5, found[2][0]);
    assertEquals(11, found[2][1]);

    assertEquals(6, found[3][0]);
    assertEquals(10, found[3][1]);
  }

  @Test
  public void testTargetSum_NotInArray_InBetween() {
    int targetSum = 9;
    int[] inputArray = new int[] {1, 3, 4, 5, 6, 7, 10, 11, 12, 15};
    int[][] found = subject.findElements(inputArray, targetSum, false);
    assertNotNull(found);
    assertEquals(3, found[0][0]);
    assertEquals(6, found[0][1]);

    assertEquals(4, found[1][0]);
    assertEquals(5, found[1][1]);

    assertNull(found[2]);
    assertNull(found[3]);
    assertNull(found[4]);
  }

  @Test
  public void testTargetSum_OneElement() {
    int targetSum = 10;
    int[] inputArray = new int[] {10};
    int[][] found = subject.findElements(inputArray, targetSum, false);
    assertNotNull(found);
    assertEquals(1 + inputArray.length/2, found.length);
    int i = 0;
    for (int[] r : found) {
      assertNull(r);
    }
  }

  @Test
  public void testTargetSum_NotFound() {
    int targetSum = 17;
    int[] inputArray = new int[] {1, 12, 13, 27};
    int[][] found = subject.findElements(inputArray, targetSum, false);
    assertNotNull(found);
    assertEquals(1 + inputArray.length/2, found.length);
    int i = 0;
    for (int[] r : found) {
      assertNull(r);
    }
  }

  @Test
  public void testTargetSum_InArray_LastIndex_repeat() {
    int targetSum = 10;
    int[] inputArray = new int[] {1, 3, 4, 5, 6, 7, 10};
    int[][] found = subject.findElements(inputArray, targetSum, true);
    assertNotNull(found);
    assertEquals(3, found[0][0]);
    assertEquals(7, found[0][1]);

    assertEquals(4, found[1][0]);
    assertEquals(6, found[1][1]);

    assertEquals(5, found[2][0]);
    assertEquals(5, found[2][1]);

    assertEquals(6, found[3][0]);
    assertEquals(4, found[3][1]);

    assertEquals(7, found[4][0]);
    assertEquals(3, found[4][1]);
  }
}
