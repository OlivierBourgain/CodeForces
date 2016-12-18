package p74x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main744ATest {

	@Test
	public void test1() {
		String in = "4 1 2\n1 3\n1 2";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "3 3 1\n2\n1 2\n1 3\n2 3";
		String out = "0";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "6 4 1\n2\n1 2\n1 3\n2 3\n4 6";
		String out = "11";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "6 4 2\n2 6\n1 2\n1 3\n2 3\n4 6";
		String out = "3";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "8 4 2\n2 6\n1 2\n1 3\n2 3\n4 6";
		String out = "12";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "8 4 3\n2 6 8\n1 2\n1 3\n2 3\n4 6";
		String out = "7";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test7() {
		String in = "9 7 3\n2 6 8\n1 2\n1 3\n2 3\n4 6\n7 8\n8 9\n9 5\n";
		String out = "3";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test8() {
		String in = "10 7 3\n2 6 8\n1 2\n1 3\n2 3\n4 6\n7 8\n8 9\n9 5\n";
		String out = "7";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main744A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
