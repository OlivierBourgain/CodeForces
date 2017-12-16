package p89x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main898DTest {

	@Test
	public void test1() {
		String in = "3 3 2\n" + 
				"3 5 1";
		String out = "1";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "5 10 3\n" + 
				"12 8 18 25 1";
		String out = "0";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "7 7 2\n" + 
				"7 3 4 1 6 5 2";
		String out = "6";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "2 2 2\n" + 
				"1 3";
		String out = "0";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "20 1 1\n" + 
				"1 4 545 3123 34 34 232 1212 322 3356 98 776 67 234324 35 313 897 4343 665 3";
		String out = "20";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5b() {
		String in = "20 1 1\n" + 
				"1 3 4 7 10 10 13 16 19 22 25 28 31 34 37 40 43 46 49 52";
		String out = "20";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5c() {
		String in = "3 1 1\n" + 
				"1 3 4";
		String out = "3";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "20 1 2\n" + 
				"7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7";
		String out = "19";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test7() {
		String in = "20 2 2\n" + 
				"7 7 7 7 7 7 7 7 7 7 8 8 8 8 8 8 8 8 8 8";
		String out = "19";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test8() {
		String in = "10 3 2\n" + 
				"1 4 7 10 13 16 19 22 25 28";
		String out = "0";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main898D.runTest(is,os);
		String res = baos.toString();
		return res;
	}

}
