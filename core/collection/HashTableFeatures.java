package core.collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableFeatures {

	public static void main(String[] args) {

		Hashtable<String, String> hashTable = new Hashtable<>();

		hashTable.put("Praneeth", "India");
		hashTable.put("Praneeth1", "India");
		hashTable.put("Praneeth2", "India");
		hashTable.put("Praneeth3", "India");
		hashTable.put("Praneeth4", "India");

		Enumeration<String> enumr = hashTable.elements();

		while (enumr.hasMoreElements()) {
			String s = enumr.nextElement();
			System.out.println(s);
		}

		Iterator<Entry<String, String>> itr = hashTable.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("KEY  " + key + " : Value  " + value);
		}

		Set<String> key = hashTable.keySet();
		for (String string : key) {
			System.out.println("keys "+string);
		}
		
		
		

	}

}
