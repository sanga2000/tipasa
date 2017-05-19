package my.alg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Created by 212441280 on 5/10/17.
 */
public class OneSingleElementTest {

  private OneSingleElement subject = new OneSingleElement();

  @Test
  public void testFindSingleElement_1() {
    int expected = 11;
    int[] arr = {3, 3, 7, 7, 9, 9, 11};
    Integer element = subject.findSingleElement_On(arr);
    assertNotNull(element);
    assertEquals(expected, element.intValue());
  }

  @Test
  public void testFindSingleElement_2() {
    int expected = 1;
    int[] arr = {1, 3, 3, 7, 7, 9, 9};
    Integer element = subject.findSingleElement_On(arr);
    assertNotNull(element);
    assertEquals(expected, element.intValue());
  }

  @Test
  public void testFindSingleElement_3() {
    int expected = 8;
    int[] arr = {3, 3, 7, 7, 8, 9, 9};
    Integer element = subject.findSingleElement_On(arr);
    assertNotNull(element);
    assertEquals(expected, element.intValue());
  }

  @Test
  public void testFindSingleElement_4() {
    int expected = 7;
    int[] arr = {3, 3, 7, 8, 8, 9, 9};
    Integer element = subject.findSingleElement_On(arr);
    assertNotNull(element);
    assertEquals(expected, element.intValue());
  }

  @Test
  public void testFindSingleElement_5() {
    int expected = 10;
    int[] arr = {3, 3, 7, 7, 8, 8, 9, 9, 10};
    Integer element = subject.findSingleElement_On(arr);
    assertNotNull(element);
    assertEquals(expected, element.intValue());
  }

  @Test
  public void testFindSingleElement_6() {
    int expected = 1;
    int[] arr = {1, 3, 3, 7, 7, 8, 8, 9, 9};
    Integer element = subject.findSingleElement_On(arr);
    assertNotNull(element);
    assertEquals(expected, element.intValue());
  }

  @Test
  public void testFindSingleElement_7() {
    int expected = 7;
    int[] arr = {1, 1, 3, 3, 7, 8, 8, 9, 9};
    Integer element = subject.findSingleElement_On(arr);
    assertNotNull(element);
    assertEquals(expected, element.intValue());
  }

  /************************************************************************/
  /*                  O Log n                                             */
  /************************************************************************/

  @Test
  public void testFindSingleElement_findSingleElement_Ologn_1() {
    int expected = 11;
    int[] arr = {3, 3, 7, 7, 9, 9, 11};
    Integer element = subject.findSingleElement_Ologn(arr);
    assertNotNull(element);
    assertEquals(expected, element.intValue());
  }

  @Test
  public void testFindSingleElement_findSingleElement_Ologn_2() {
    int expected = 8;
    int[] arr = {1, 1, 3, 3, 7, 7, 8, 9, 9};
    Integer element = subject.findSingleElement_Ologn(arr);
    assertNotNull(element);
    assertEquals(expected, element.intValue());
  }

  @Test
  public void testFindSingleElement_findSingleElement_Ologn_3() {
    int expected = 3;
    int[] arr = {1, 1, 3, 7, 7, 8, 8, 9, 9};
    Integer element = subject.findSingleElement_Ologn(arr);
    assertNotNull(element);
    assertEquals(expected, element.intValue());
  }

  @Test
  public void testFindSingleElement_findSingleElement_Ologn_4() {
    int expected = 3;
    int[] arr = {1, 1, 3};
    Integer element = subject.findSingleElement_Ologn(arr);
    assertNotNull(element);
    assertEquals(expected, element.intValue());
  }

  @Test
  public void testFindSingleElement_findSingleElement_Ologn_5() {
    int expected = 1;
    int[] arr = {1, 3, 3};
    Integer element = subject.findSingleElement_Ologn(arr);
    assertNotNull(element);
    assertEquals(expected, element.intValue());
  }

  @Test
  public void testFindSingleElement_findSingleElement_Ologn_6() {
    int expected = 3;
    int[] arr = {1, 1, 3, 7, 7, 8, 8, 9, 9, 10, 10};
    Integer element = subject.findSingleElement_Ologn(arr);
    assertNotNull(element);
    assertEquals(expected, element.intValue());
  }

  @Test
  public void testFindSingleElement_findSingleElement_Ologn_7() {
    int expected = 8;
    int[] arr = {1, 1, 3, 3, 5, 5, 7, 7, 8, 9, 9};
    Integer element = subject.findSingleElement_Ologn(arr);
    assertNotNull(element);
    assertEquals(expected, element.intValue());
  }
}
