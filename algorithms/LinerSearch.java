package algorithms;

public class LinerSearch {

    public static void main(String[] args) {
        int[] intArray = {1,5,3,2,3,45,78};
        System.out.println( "index Value "+leanerSearching(intArray,3));
    }
    public static  int leanerSearching(int[] intArray,int value){  // O(n) Time complexity / Linear TimeConstant
        int valueIndex =0;
        for(int i = 0; i<=intArray.length;i++){
            if(intArray[i] == value){
                return  valueIndex = i;
            }
        }
        return -1;
    }
}
