package com.capgemini.files.serialization_assignment;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialization
{
	public boolean doSerialization(String filepath,Employee e) throws IOException{
//		Employee e1=new Employee();
		FileOutputStream fileoutputstream= new FileOutputStream(filepath);
		ObjectOutputStream objectoutputstream = new ObjectOutputStream(fileoutputstream);
		objectoutputstream.writeObject(e);
		objectoutputstream.close();
		return true;
		
	}
}
