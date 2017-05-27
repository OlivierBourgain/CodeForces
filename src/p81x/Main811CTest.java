package p81x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main811CTest {

	@Test
	public void test1() {
		String in = "6\n4 4 2 5 2 3";
		String out = "14";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "9\n5 1 3 1 5 2 4 2 5";
		String out = "9";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "9\n5 1 6 1 5 2 4 2 5";
		String out = "13";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "10\n5 1 3 1 5 2 4 8 2 5";
		String out = "17";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "10\n5 1 3 1 5 2 4 8 1 5";
		String out = "17";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "11\n5 1 3 1 5 2 4 8 1 2 5";
		String out = "15";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test7() {
		String in = "11\n5 5 3 5 1 2 4 8 1 2 5";
		String out = "18";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test8() {
		String in = "5\n1558 4081 3591 1700 3232";
		String out = "14162";
		assertEquals(out,run(in));
	}	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main811C.runTest(is,os);
		String res = baos.toString();
		return res;
	}

}
