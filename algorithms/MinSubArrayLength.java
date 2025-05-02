package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinSubArrayLength {

    public static void main(String[] args) {
        int[] i= {1,2,4,5,6,7};
        System.out.println( minSubArrayLength(15,i));
    }
    public static int minSubArrayLength(int target,int [] array) {
        List<int[]> result = new ArrayList<>();
//        {1,2,4,5,6,7}
        int left = 0, sum = 0, min = Integer.MAX_VALUE;
        int right;
        for (right = 0; right < array.length; right++) {
            sum += array[right];
            while (sum >= target) {
                result.add(Arrays.copyOfRange(array, left, right + 1));
                min = Math.min(min, right - left + 1);
                sum -= array[left++];

            }
        }
        System.out.println(result.toString());
        return min == Integer.MAX_VALUE ? 0 : min;

    }
}
