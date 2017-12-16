package p89x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main898ETest {

	@Test
	public void test1() {
		String in = "4\n12 14 30 4";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "6\n0 0 0 0 0 0";
		String out = "6";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "6\n120 110 23 34 25 45";
		String out = "3";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "10\n121 56 78 81 45 100 1 0 54 78";
		String out = "0";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main898E.runTest(is,os);
		String res = baos.toString();
		return res;
	}

}
