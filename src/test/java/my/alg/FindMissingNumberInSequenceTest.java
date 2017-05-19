package my.alg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Created by 212441280 on 5/17/17.
 */
public class FindMissingNumberInSequenceTest {
  FindMissingNumberInSequence subject = new FindMissingNumberInSequence();

  @Test
  public void testFindMissing_XOR() {
    int[] a = {1, 2, 4, 5, 6, 7, 8, 9};
    Integer out = subject.findMissingXOR(a);
    assertNotNull(out);
    assertEquals(3, out.intValue());
  }

  @Test
  public void testFindMissing_OutofOrder_XOR() {
    int[] a = {8, 4, 1, 2, 5, 6, 7};
    Integer out = subject.findMissingXOR(a);
    assertNotNull(out);
    assertEquals(3, out.intValue());
  }

  @Test
  public void testFindMissing_Desc_XOR() {
    int[] a = {8, 7, 6, 5, 4, 2, 1};
    Integer out = subject.findMissingXOR(a);
    assertNotNull(out);
    assertEquals(3, out.intValue());
  }

  @Test
  public void testFindMissing_3() {
    int[] a = {1, 2, 4, 5, 6, 7, 8, 9};
    Integer out = subject.findMissing(a, a[a.length - 1]);
    assertNotNull(out);
    assertEquals(3, out.intValue());
  }

  @Test
  public void testFindMissing_8() {
    int[] a = {1, 2, 3, 4, 5, 6, 7, 9};
    Integer out = subject.findMissing(a, a[a.length - 1]);
    assertNotNull(out);
    assertEquals(8, out.intValue());
  }

  @Test
  public void testFindMissing_1() {
    int[] a = {2, 3, 4, 5, 6, 7, 8, 9, 10};
    Integer out = subject.findMissing(a, a[a.length - 1]);
    assertNotNull(out);
    assertEquals(1, out.intValue());
  }
}
