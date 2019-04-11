package com.capgemini.files.handlingtest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.handlingmain.WordCount;

public class WordCountTest {
	
	@Test
	public void toCheckCheckFileExisting() {
		WordCount file=new WordCount();
		assertTrue(file.fileexist());
	}
	@Test
	public void toCountNumberOfWordsInFile() throws IOException{
		WordCount file=new WordCount("C:\\Tanmay\\path.txt");
		assertEquals(282, file.countNumberOfWords());
	}
	
	@Test
	public void toCheckEmptyFile() throws IOException{
		WordCount file=new WordCount("C:\\Tanmay\\path1.txt");
		assertEquals(0, file.countNumberOfWords());
	}
}
