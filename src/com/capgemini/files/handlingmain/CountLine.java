package com.capgemini.files.handlingmain;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class CountLine {

	public boolean fileexist() {
		File file = new File("C:\\Tanmay\\path.txt");
		if (file.exists())
			return true;
		return false;
	}

	public int countNumberOfLine() throws IOException {
		File file = new File("C:\\Tanmay\\path.txt");
		FileReader fileReader = new FileReader(file);
		LineNumberReader lineReader = new LineNumberReader(fileReader);
		int linenumber = 0;

		while (lineReader.readLine() != null) {
			linenumber++;
		}
		lineReader.close();
		return linenumber;
		
	}
	public int fileIsEmpty() throws IOException {
		File file = new File("C:\\Tanmay\\path1.txt");
		FileReader fileReader = new FileReader(file);
		LineNumberReader lineReader = new LineNumberReader(fileReader);
		int linenumber = 0;

		while (lineReader.readLine() != null) {
			linenumber++;
		}
		lineReader.close();
		return linenumber;
		
	}
}
