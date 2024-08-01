package core.collection;

import java.util.Comparator;

public class Student implements Comparable<Student> {

	private int age;
	private String name;
	private int fee;
	private String address;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(int age, String name, int fee, String address) {
		super();
		this.age = age;
		this.name = name;
		this.fee = fee;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", fee=" + fee + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Student obj) {
		return this.age - obj.age;
	}

	public static Comparator<Student> sortByAge = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getAge() - o2.getAge();
		}
	};
	public static Comparator<Student> sortByName = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
	};
	
	public static  Comparator<Student> sortByFee = new Comparator<Student>() {
		
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getFee()-o2.getFee();
		}
	};

}
