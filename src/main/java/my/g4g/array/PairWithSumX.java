package my.g4g.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sangamesh on 6/5/17.
 */
public class PairWithSumX {
    public static void main(String[] args) {
        PairWithSumX pairWithSumX = new PairWithSumX();
        int []arr = {1,2,3,5,4,6};
        pairWithSumX.findTheNumbers(arr, 8);
        pairWithSumX.findTheNumbers(arr, 9);
        pairWithSumX.findTheNumbers(arr, 19);
    }

    public void findTheNumbers(int arr[], int x){
        Set set = new HashSet<>();
        boolean found = false;
        for (int i=0; i< arr.length; i++){
            if (set.contains(arr[i])) {
                found = true;
                System.out.println("MAtching element found for  "+  x + " --> " + arr[i] + ", " + (x - arr[i]));
            }
            set.add(x-arr[i]);

        }
        if (!found)
            System.out.println("No matching element found for " + x);
    }

}
