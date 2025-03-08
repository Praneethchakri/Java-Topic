package algorithms;

import java.util.List;

public class ArrayPairSumUp {

    public static void main(String[] args) {
        int[] intArray= {1,2,4,5,6,3};
        int target = 9;
        pairSum(intArray,target);
    }
    public static void pairSum(int[] intArray, int target){
    for(int i =0;i < intArray.length;i++){
        for(int j = i+1 ; j< intArray.length;j++){
            if(intArray[i]+intArray[j] == target){
                System.out.println("Value ("+intArray[i]+","+intArray[j]+")");
            }
        }
    }
    }
}
