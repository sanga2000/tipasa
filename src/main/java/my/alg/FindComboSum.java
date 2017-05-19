package my.alg;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 212441280 on 5/17/17.
 */
public class FindComboSum {
  public List<Combo> findCombo(int target, int[] array) {
    List<Combo> combos = new ArrayList<>();
    Combo max = new Combo();
    for (int i = 0 ; i< array.length; i++) {
      int a = array[i];
      int mFactor = (int) target / a;
      int[] c = new int[2];
      c[0] = i;
      c[1] = mFactor;
      max.add(c);
    }
    return combos;
  }

  public static class Combo {
    List<int[]> combos = new ArrayList<>();

    void add(int[] c) {
      combos.add(c);
    }

  }

  public static void main(String[] args) {
    int i = 0;
    int n = 201;
    while(i < n) {
      System.out.println("The unary of " + i + " = " + (~i));
      i++;
    }
  }
}
