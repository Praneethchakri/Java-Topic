package algorithms;

import java.util.Arrays;

public class BinarySearchAlgorithm {

    public static int binarySearchMethod(int[] intArray , int inputValue){
        int startPointer = 0 ;
        int endPointer = intArray.length-1;
        int middleValue=  (startPointer+endPointer)/2;
        System.out.println("startPointer "+startPointer +" , MiddlerPointer "+middleValue+" ,EndPointer "+endPointer );
        while(intArray[middleValue]!= inputValue && startPointer <= endPointer){
            if(inputValue < intArray[middleValue]){
                endPointer = middleValue-1;
            }else{
                startPointer = middleValue+1;
            }
            middleValue =  (startPointer+endPointer)/2;
            System.out.println("startPointer "+startPointer +" , MiddlerPointer "+middleValue+" ,EndPointer "+endPointer );
        }
        return middleValue;
    }

    public static void main(String[] args) {
        int[] intArray = {1,5,6,3,2,45,78};
//        for (int i :intArray) {
//            System.out.print(i+" ,");
//        }
                Arrays.sort(intArray);
        for (int i :intArray) {
            System.out.print(i+" ," +"\n");
        }
        System.out.println(binarySearchMethod(intArray,3));
    }





}
