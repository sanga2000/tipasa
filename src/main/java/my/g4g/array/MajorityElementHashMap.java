package my.g4g.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sangamesh on 6/6/17.
 */
public class MajorityElementHashMap {
    public static void main(String[] args) {
        MajorityElementHashMap majorityElementHashMap = new MajorityElementHashMap();
        int [] arr = {3,3,4,5,4,4,4,4,5};
        Integer majElement = majorityElementHashMap.findMajorityElement(arr);
        System.out.println(majElement == null? "none":majElement);
    }

    public Integer findMajorityElement (int arr[]){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
        }



        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() > arr.length/2)
                return entry.getKey();

        }
        return null;
    }
}
