package com.capgemini.files.serialization_assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeserialization {
	public Object doDeSerialization(String filepath) throws IOException, ClassNotFoundException {
//		Employee e1 = new Employee();
		FileInputStream fileinputstream = new FileInputStream("abc.ser");
		ObjectInputStream objectinputstream = new ObjectInputStream(fileinputstream);
		Employee e2 = (Employee) objectinputstream.readObject();
		System.out.println(e2.getEmployeeId() + "...." + e2.getEmployeename() + "...." + e2.getEmployeesalary());
		objectinputstream.close();
		return e2;
	}
}
