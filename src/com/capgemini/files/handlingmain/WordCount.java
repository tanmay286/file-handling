package com.capgemini.files.handlingmain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public boolean fileexist() {
		File file = new File("C:\\Tanmay\\path.txt");
		if (file.exists())
			return true;
		return false;
	}

	public WordCount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WordCount(String path) {
		super();
		this.path = path;
	}

	// FileReader file=new FileReader("C:\\Tanmay\\path.txt");
	private String path;
	private int count = 0;
	private String lineCount;
	BufferedReader bufferedReader;
	FileReader fileReader;

	public int countNumberOfWords() throws IOException {
		fileReader = new FileReader(this.path);
		bufferedReader = new BufferedReader(fileReader);

		while ((lineCount = bufferedReader.readLine()) != null) {
			if (!(lineCount.equals(""))) {
				String[] wordList = lineCount.split("");
				count += wordList.length;
			}
		}
		bufferedReader.close();
		fileReader.close();
		return count;
	}

}
