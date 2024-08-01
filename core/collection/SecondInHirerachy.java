package core.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class SecondInHirerachy {

	public static void main(String[] args) {

		Collection<String> c = new ArrayList<String>();

		List<String> l = new ArrayList<String>();
		
			l.add("Praneeth");
			l.add("Prakash");
			l.add("Pramod");
			l.add("Pramesh");
			l.add("Pranish");
			l.add("Praneik");
			l.add("Prankaj");
			l.add("Pranmesh");
		c.addAll(l);
		
		System.out.println("Size" +c.size());
		System.out.println("Contain: "+c.contains("Praneeth"));
		System.out.println("ContatinAll : "+c.containsAll(l));
		System.out.println("IsEmpty :"+c.isEmpty());
		System.out.println("remove "+c.remove("Praneeth"));
		System.out.println("removeIf"+c.removeIf(x->x.endsWith("mod")));// It removes Pramod final result
		System.out.println("Check after remove Praneeth ,Pramod "+c.toString());
		System.out.println(" retainAll() "+c.retainAll(c));
		System.out.println("Check after retainall() Praneeth ,Pramod "+c.toString());
		System.out.println("toArray "+c.toArray());
		System.out.println("toArray +"+c.toArray());
		
		System.out.println("stream()"+c.stream());
		System.out.println("parallelStream() "+c.parallelStream());
		
		Iterator itr = c.iterator();
		System.out.println("iterator(): "+itr);
		
		Spliterator<String> splitr = c.spliterator();
		System.out.println("spliterator ()"+splitr);
		
		System.out.println("removeAll() "+c.removeAll(c));
		System.out.println("Clear()");
			c.clear();
		System.out.println("After Clear and remove All "+c.size());

	}

}
