package my.g4g.array;

/**
 * Created by sangamesh on 6/6/17.
 */
public class MajorityElement {

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int [] arr = {3,3,4,5,4,4,4,4,5};
        int mostOccuring =  majorityElement.findMostOccuring(arr);
        System.out.println(majorityElement.isMajority(arr,mostOccuring) ? mostOccuring:"none");
    }
    public int findMostOccuring(int [] arr){

        int maj_index = 0;
        int count = 1;
        for (int i = 1; i < arr.length; i++){

            if (count == 0) {
                maj_index = i;
            }
            if (arr[maj_index] == arr [i]){
                count++;
            } else {
                count--;
            }



        }
        return arr [maj_index];

    }

    public boolean isMajority(int arr[], int mostOccuring){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] == mostOccuring){
                count++;
            }

        }
        if (count > arr.length/2)
            return true;
        return false;

    }

}


