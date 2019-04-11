package com.capgemini.files.serialization_assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class EmployeeDesrializationTest {

	@Test
	public void testDeserialization() throws IOException, ClassNotFoundException{
		Employee e = new Employee(1,"tanmay",4354);
		EmployeeDeserialization emp=new EmployeeDeserialization();
		assertEquals(e,emp.doDeSerialization("abc.ser"));
	}

}
