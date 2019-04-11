package com.capgemini.files.handlingtest;

	import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.handlingmain.GrepApplication;


	public class GrepApplicationTest {

		@Test
		public void toCheckStringIsAvailable() throws IOException {
			GrepApplication file = new GrepApplication();
			file.checkAppearances().get(3);
		//	System.out.println(file.checkAppearances());
			assertEquals("Hello",file.checkAppearances().get(1));
		}
		@Test
		public void toCheckStringIsAvailableOrNot() throws IOException {
			GrepApplication file = new GrepApplication();
			file.checkAppearances().get(3);
		//	System.out.println(file.checkAppearances());
			assertNotEquals("This "  ,file.checkAppearances().get(1));
		}
		

	}

