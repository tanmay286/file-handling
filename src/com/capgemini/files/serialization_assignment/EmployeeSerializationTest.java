package com.capgemini.files.serialization_assignment;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class EmployeeSerializationTest {

	@Test
	public void testSerialization() throws IOException{
		Employee e=new Employee(3,"Tanmay",35000);
		EmployeeSerialization emp=new EmployeeSerialization();
		assertTrue(emp.doSerialization("abc.ser",e));
	}

}
