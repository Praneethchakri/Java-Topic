package number.programs;

import java.util.Arrays;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] intArray = {1,4,6,7,8,9,9,3};

        Arrays.sort(intArray);
        int secondHighest = -1;
    for(int i =intArray.length-1;i>=0;i--){
        System.out.println(intArray[i]);
        if(intArray[i] != intArray[i-1]){
            secondHighest = intArray[i-1];
            break;
        }

    }
        if (secondHighest != -1) {
            System.out.println("Second highest number: " + secondHighest);
        } else {
            System.out.println("No second highest number available.");
        }

     }
}
