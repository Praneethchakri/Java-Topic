package stream.functions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;

public class ArraySortedNoDuplicates {
    public static void main(String[] args) {


        int[] intArray = {3,5,7,8,1,98,23};

       int[] i= Arrays.stream(intArray)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(i));

        String[][] array2d = {{"Praneeth","Chakravarthi","Diguvapalem"},
                             {"Praneeth1","Chakravarthi1","Diguvapalem1"}};

        Set<String> data = Arrays.stream(array2d)
                .flatMap(Arrays::stream)
                .sorted(Comparator.naturalOrder())
                .map(String::toLowerCase)
                .collect(Collectors.toSet());
        System.out.println(data);

        String[][][] array3d = {{{"Dhoni","Sachin","Dravid"},{"Raina","Ganguly","Yuvraj"},{"Sehwag","Gambir","Zaheer"}}};

      String [] result =    Arrays.stream(array3d)
                        .flatMap(Arrays::stream)
                        .flatMap(Arrays::stream)
              .toArray(String[]::new);
        System.out.println(Arrays.toString(result));








    }
}
