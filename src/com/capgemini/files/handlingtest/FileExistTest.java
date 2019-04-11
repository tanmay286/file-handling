package com.capgemini.files.handlingtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.capgemini.files.handlingmain.FileExist;

public class FileExistTest {
//	private FileExist fileexist;
	
	@Test
	public void toCheckFileExisting() {
		FileExist fileexists=new FileExist();
		assertEquals(true, fileexists.file());
	}
	
	@Test
	public void toCheckFileExistingOrNot() {
		FileExist fileexists=new FileExist();
		assertEquals(false, fileexists.file1());
	}
}
