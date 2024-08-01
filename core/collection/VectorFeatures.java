package core.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorFeatures {
	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		System.out.println("Add " + vector.add("Adhra"));
		vector.addElement("Tamilnadu");
		vector.add(2, "Karnataka");
		System.out.println("Remove Element " + vector.removeElement("Tamilnadu"));

		System.out.println("ElementAt" + vector.elementAt(0));
		System.out.println("Capacity " + vector.capacity());
		vector.ensureCapacity(20);
		System.out.println("Capacity " + vector.capacity());
		
		Enumeration<String> itr = vector.elements();
		while (itr.hasMoreElements()) {
			String string = (String) itr.nextElement();
			System.out.println(string);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		String s = "Praneeth";
		String s1 = "Praneeth";
		
		
		System.out.println(s==s1);
		
		
		System.out.println("s Hascode "+s.hashCode());
		System.out.println("s1 Hascode "+s1.hashCode());
		System.out.println(s.equals(s1));
		
		String s3 = "Praneeth";
		String s2 = "Dhoni";
		System.out.println(s3==s2);
		
		
	}
}
