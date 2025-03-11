package core.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SteamsInterviewQuestion {
    public static void main(String[] args) {

        String[] stringArray= {"aa","bb","cc","bb","aa"};
        List<String> stringList = Arrays.asList(stringArray);

        stringList.stream().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(count -> count.getValue() > 1)
                .forEach(System.out::println);

        Map<String,Integer> result = stringList.stream()
        .collect(Collectors.toMap(Function.identity(),v->1,Integer::sum))
                .entrySet()
                .stream()
                .filter(value-> value.getValue() > 1)
//                .forEach(System.out::println);
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(result);



    }
}
