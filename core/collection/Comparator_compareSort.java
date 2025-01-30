package core.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Comparator_compareSort {
	public static void main(String[] args) {

		Student[] s = new Student[4];

		s[0] = new Student(12, "Praneeth", 1000, "Germany");
		s[1] = new Student(11, "Ramesh", 1100, "India");
		s[2] = new Student(10, "Suresh", 1200, "Bankok");
		s[3] = new Student(9, "Harish", 1400, "China");

		Arrays.sort(s);
		System.out.println("Sorted Array of Students "+s);

		List<Student> list = new ArrayList<Student>();

		list.add(new Student(20, "James", 23000, "India"));
		list.add(new Student(26, "Koner", 24000, "Germany"));
		list.add(new Student(19, "Steive", 27000, "China"));
		list.add(new Student(21, "Max", 28200, "Singapour"));
		list.add(new Student(29, "Andri", 19000, "UnitedKingdom"));

			System.out.println("Sorted By Student Grade Before"+list);
			list.sort(Student.sortByGrade);
			System.out.println("Sorted By Student Grade "+list);
			list.sort(Student.sortByName);
			System.out.println("Sorted By Student Name "+list);
//			list.sort(Student.sortByFee);
//			System.out.println("Sorted By Student Fee "+list);
	}

}
