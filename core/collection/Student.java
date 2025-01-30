package core.collection;

import java.io.Serializable;
import java.util.Comparator;

public class Student implements Serializable ,Comparable<Student>{

	private int id;
	private String name;
	private int grade;
	private String country;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

	public Student(int id, String name, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public Student(int id, String name, int grade, String country) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.country = country;
	}

	//static Comparator
	public static Comparator<Student> sortByName = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.name.compareTo(o2.name);
		}
	};
	public static Comparator<Student> sortByGrade = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			/*if(o1.grade>o2.grade)
				return 1;
			else if(o1.grade<o2.grade)
				return -1;
			else
				return 0;*/
			return Integer.compare(o2.grade,o1.grade);
		}
	};

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
}
