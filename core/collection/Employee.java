package coreJava.collection.streams.maps;

import java.util.Comparator;

public class Employee {
	private String name;
	private int age;
	private long salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Employee(String name, int age, long salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	public static class EmployeeSortByAge implements Comparator<Employee>{
		@Override
		public int compare(Employee o1, Employee o2) {
			return Integer.compare(o1.getAge(), o2.getAge());
		}
		
		
	}

}
