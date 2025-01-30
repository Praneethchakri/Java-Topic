package coreJava.markerInterface;

import core.collection.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MarkerInterface_Features {

	public static void main(String[] args) throws ClassNotFoundException {

		Student s = new Student(12, "Praneeth", 1000, "Germany");
		System.out.println("Serializing The Object to Student.txt File in byte format::");
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("Student.txt"));
			oos.writeObject(s);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("Student.txt"));
			Student studentObj = (Student) ois.readObject();
			System.out.println("Deserializing  Object " + studentObj);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
