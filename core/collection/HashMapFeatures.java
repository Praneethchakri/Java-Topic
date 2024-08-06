package coreJava.collection.streams.maps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapFeatures {

	public static void main(String[] args) {

		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Diguvapalem", "Praneeth");
		hashMap.put("Prasad", "Sushma");
		hashMap.put("Singh", "Dhoni");
		hashMap.put("Rajput", "Sushanth");
		hashMap.put("Ramesh", "Sachin");

		// As Hashmap doesn't maintain order of insertion.
		System.out.println("comparingByKey");
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("\n");

		System.out.println("comparingByValue");
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::println);

		System.out.println("\n");
		hashMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + "  " + entry.getValue()));

		LinkedHashMap<String, Employee> employeeMap = new LinkedHashMap();

		employeeMap.put("Diguvapalem", new Employee("Praneeth", 33, 1000000));
		employeeMap.put("Dhoni", new Employee("MahendraSingh", 43, 7000000));
		employeeMap.put("Tendulkar", new Employee("Sachin", 53, 10000000));
		employeeMap.put("Singh", new Employee("yuvraj", 44, 9000000));
		employeeMap.put("Ganguly", new Employee("Saurav", 54, 99000000));

		employeeMap.entrySet().stream().sorted(Entry.comparingByValue(new EmployeeComparatoryBySalary().reversed()))
				.forEach(System.out::println);

		LinkedHashMap<Employee, String> employeeMap1 = new LinkedHashMap();

		employeeMap1.put(new Employee("Praneeth", 33, 1000000), "Diguvapalem");
		employeeMap1.put(new Employee("MahendraSingh", 43, 7000000), "Dhoni");
		employeeMap1.put(new Employee("Sachin", 53, 10000000), "Tendulkar");
		employeeMap1.put(new Employee("yuvraj", 44, 9000000), "Singh");
		employeeMap1.put(new Employee("Saurav", 54, 99000000), "Ganguly");
		
		
		employeeMap1.entrySet().stream().sorted(Entry.comparingByKey(new EmployeeComparatoryBySalary()))
		.forEach(System.out::println);
		
		System.out.println("\n");
		employeeMap1.entrySet().stream().
		sorted(Entry.comparingByKey(new Employee.EmployeeSortByAge()))
		.forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
		
//		computeIfabsent, based on key availabilty , we will update the value
		
		List<String> names = List.of("Diguvapalem","Dhoni","Tendulkar","Singh","Ganguly");
		Map<Integer,List<String>> hashMap3 = new HashMap();
		
		for (String string : names) {
			hashMap3.computeIfAbsent(string.length(), k->new ArrayList<>()).add(string);
		}
		System.out.println(hashMap3);
		
		
		String nameOfDeveloper = "Diguvapalem Praneeth Chakravarthi";
		
		Map<Character,Integer> hashMap4 = new HashMap<>();
		
		for (char letter : nameOfDeveloper.toCharArray()) {
			hashMap4.computeIfAbsent(letter, k->0);
			hashMap4.computeIfPresent(letter, (k,v)->v+1);
		}
		
		System.out.println(hashMap4);
		
		
		
		
		
		
		
		
		
	}

}
