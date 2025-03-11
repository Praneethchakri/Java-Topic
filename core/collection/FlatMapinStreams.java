package core.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapinStreams {
    public static void main(String[] args) {

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );
        System.out.println(listOfLists);
        List<Integer> flatList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flatList);

        List<coreJava.collection.streams.maps.Employee> employees = Arrays.asList(
                new coreJava.collection.streams.maps.Employee(1, "John", 70000),
                new coreJava.collection.streams.maps.Employee(2, "Sarah", 80000),
                new coreJava.collection.streams.maps.Employee(3, "Michael", 60000),
                new coreJava.collection.streams.maps.Employee(4, "Praneeth", 80000)
        );
        Map<Long, List<coreJava.collection.streams.maps.Employee>> employeesBySalary = employees.stream()
                .collect(Collectors.groupingBy(coreJava.collection.streams.maps.Employee::getSalary));
        System.out.println(employeesBySalary);

        List<String> names = Arrays.asList("Praneeth","Prajna","Sushma");
        String s = names.stream().
                collect(Collectors.joining(",","Names: ","."));
        System.out.println(s);

        int sum = Arrays.asList(1, 2, 3, 4).stream()
                .reduce(0, Integer::sum); // Sum is 10
        System.out.println(sum);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        System.out.println(numbers);
        List<Integer> collected = numbers.stream()
                .collect(Collectors.toList()); // Converts to List
        System.out.println(collected);

        List<coreJava.collection.streams.maps.Employee> employees1 = Arrays.asList(
                new coreJava.collection.streams.maps.Employee(1, "John", 70000),
                new coreJava.collection.streams.maps.Employee(2, "Sarah", 80000)
        );
        Map<coreJava.collection.streams.maps.Employee, String> employeeMap = employees1.stream()
                .collect(Collectors.toMap(Function.identity(), coreJava.collection.streams.maps.Employee::getName));
        System.out.println(employeeMap);
//        Stream<Locale> streamOfLocales = Stream.of(Locale.getAvailableLocales());
//        Map<String,List<Locale>> countryToLocale = streamOfLocales .collect(Collectors.groupingBy(Locale::getCountry));
//        System.out.println(countryToLocale);


    }

}
