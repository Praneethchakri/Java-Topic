package coreJava.collection.streams.maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map_Features {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("Diguvapalem", "Chakravarthi");
		map.put(null, "TestingNull");
		map.put(null, "TestingNull2");
//		Non Generic Style of Iteration
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		Set keySet = map.keySet();
		Iterator keyItr = keySet.iterator();
		while (keyItr.hasNext()) {
			Object key = keyItr.next();
			System.out.println("Keys " + key);
		}
//		with Generics
		for (Map.Entry entry : map.entrySet()) {
			System.out.println("Key :: " + entry.getKey() + " , Value:: " + entry.getValue());
		}

		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::println);

		TreeMap<String, String> treeMap = new TreeMap<String, String>();
//		treeMap.put(null, null);

		treeMap.entrySet().stream().sorted(Entry.comparingByKey()).forEach(System.out::println);
		
		

	}
}
