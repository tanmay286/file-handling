package com.capgemini.files.handlingtest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.handlingmain.CountLine;

public class CountLineTest {

	@Test
	public void toCheckFileExisting() {
		CountLine file=new CountLine();
		assertTrue(file.fileexist());
	}
	
	@Test
	public void toCountNumberOfLineInFile() throws IOException {
		CountLine file=new CountLine();
		assertEquals(5, file.countNumberOfLine());
	}
	
	@Test
	public void toCheckFileIsEmpty() throws IOException {
		CountLine file=new CountLine();
		assertEquals(0, file.fileIsEmpty());
	}
}
