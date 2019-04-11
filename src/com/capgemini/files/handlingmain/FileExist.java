package com.capgemini.files.handlingmain;

import java.io.File;

public class FileExist {

	public boolean file(){
		File files = new File("C:\\Tanmay\\path.txt");
		if(files.exists())
			return true;
		return false;
	}
	
	public boolean file1(){
		File filesexist = new File("C:\\Tanmay\\paths.txt");
		if(filesexist.exists())
			return true;
		return false;
	}
}
