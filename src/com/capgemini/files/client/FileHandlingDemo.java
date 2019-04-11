package com.capgemini.files.client;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		// File exits or not
		/*
		 * File file=new
		 * File("C:\\Users\\tkukkar\\Downloads\\Re__Core_Java_Assignments\\Date.java");
		 * System.out.println(file.exists());
		 * 
		 * File folder=new
		 * File("C:\\Users\\tkukkar\\Downloads\\Re__Core_Java_Assignments");
		 * System.out.println(folder.exists());
		 */

		/*
		 * File file=new File("Text.txt"); if(!(file.exists())) { file.createNewFile();
		 * System.out.println("File is created Successfully"); } //BufferedWriter
		 * writer=new BufferedWriter(new FileWriter(file)); //(file,true) will append
		 * the text file
		 * 
		 * PrintWriter writer=new PrintWriter(file); writer.println("Hello..\n");
		 * writer.println("How are you\n "); writer.println("I hope you are fine");
		 * writer.println("Bye...");
		 * 
		 * 
		 * writer.close(); System.out.println("Content has been written successfully");
		 */

		/*-------Copy the content in File1.java--------------------
		 * FileReader reader=new
		 * FileReader("C:\\Tanmay\\Core Java\\file-handling\\src\\com\\capgemini\\files\\client\\FileHandlingDemo.java"
		 * ); BufferedReader bReader=new BufferedReader(reader); PrintWriter writer=new
		 * PrintWriter("File1.java"); String content;
		 * 
		 * while((content=bReader.readLine())!=null) { //System.out.println(content);
		 * writer.println(content); } writer.close(); bReader.close(); reader.close();
		 */

		/*-----------List of Windows is Displayed----------------------------
		 * File windowsDirectory = new File("c:\\windows");
		 * System.out.println(windowsDirectory.isDirectory()); String content[] =
		 * windowsDirectory.list();
		 * 
		 * for (String s : content) { System.out.println(s); }
		 */

		File newDir = new File("myDir");
		if (!newDir.exists()) {
			newDir.mkdir();
			System.out.println("Folder is Successfully created");
		}
		
		File file= new File(newDir,"myfile.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File is Successfully created");
		}
	}
}