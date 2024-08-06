package coreJava.collection.streams.maps;

import java.util.Comparator;

public class EmployeeComparatoryBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return Long.compare(o1.getSalary(),o2.getSalary());
	}
	
}