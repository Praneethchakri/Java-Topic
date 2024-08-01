package core.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListFeatures {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Praneeth");
		list.add("Sushma");
		list.add("Prajna");
		list.add("Son");
		list.add("Praneeth");
		list.add("Praneeth");
		list.add("Praneeth");

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println("lastIndexOf()" + list.lastIndexOf("Praneeth"));

		/*
		 * implicit methods of List void add()
		 * 
		 * 
		 */
		ListIterator<String> litr = list.listIterator();
		while(litr.hasNext()) {
			
		}
	}
}
