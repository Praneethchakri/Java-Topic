package number.programs;

import java.util.HashSet;

public class PairSumTarge {
    public static void main(String[] args) {
        int[] i = {1,3,4,5,6,2};
        int target = 7;
        printPair(i,target);
    }

    public static void printPair(int[] i,int target){

        int n = i.length;
        HashSet<Integer> set = new HashSet<>();
        for (int x:i) {
            int complement = target-x;
            if(set.contains(complement)){
                System.out.println("Pair : ("+x+","+complement+")");
            }
            set.add(x);
        }
    }
}
