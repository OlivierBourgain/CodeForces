package p87x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main879BTest {

	@Test
	public void test1() {
		String in = "2 2\n" + 
				"1 2";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "4 2\n" + 
				"3 1 2 4";
		String out = "3";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "6 2\n" + 
				"6 5 3 1 2 4";
		String out = "6";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "2 10000000000\n" + 
				"2 1";
		String out = "2";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "10 5\n" + 
				"2 1 3 7 6 9 8 4 6 5";
		String out = "9";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "10 5\n" + 
				"2 1 8 7 6 3 4 6 5 9";
		String out = "8";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main879B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
