package core.collection;

import java.util.ArrayList;
import java.util.List;

public class Comparator_compareSort {
	public static void main(String[] args) {

		Student[] s = new Student[4];

		s[0] = new Student(12, "Praneeth", 1000, "Germany");
		s[1] = new Student(11, "Ramesh", 1100, "India");
		s[2] = new Student(10, "Suresh", 1200, "Bankok");
		s[3] = new Student(9, "Harish", 1400, "China");

		List<Student> list = new ArrayList<Student>();

		list.add(new Student(20, "TestStudnet1", 23000, "India"));
		list.add(new Student(26, "TestStudnet2", 24000, "Germany"));
		list.add(new Student(19, "TestStudnet3", 27000, "China"));
		list.add(new Student(21, "TestStudnet4", 28200, "Singapour"));
		list.add(new Student(29, "TestStudnet5", 19000, "UnitedKingdom"));

			list.sort(Student.sortByAge);
			System.out.println("Sorted By Student Age "+list);
			
			list.sort(Student.sortByName);
			System.out.println("Sorted By Student Name "+list);
			list.sort(Student.sortByFee);
			System.out.println("Sorted By Student Fee "+list);
	}

}
