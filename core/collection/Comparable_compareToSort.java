package core.collection;

import java.util.Arrays;

public class Comparable_compareToSort {

	public static void main(String[] args) {

		Student[] s = new Student[4];

		s[0] = new Student(12, "Praneeth",  10,"Germany");
		s[1] = new Student(11, "Ramesh",  11,"India");
		s[2] = new Student(10, "Suresh",12  ,"Bankok");
		s[3] = new Student(9, "Harish", 13, "China");
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		
	}

}
