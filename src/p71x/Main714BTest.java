package p71x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main714BTest {

	@Test
	public void test1() {
		String in = "5\n1 3 3 2 1";
		String out = "YES";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "10\n1 1 1 1 1 1 1 1 1 1";
		String out = "YES";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "5\n1 2 3 4 5";
		String out = "NO";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "5\n12 11 12 11 12";
		String out = "YES";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "10\n1 1 1 1 1 1 1 10 19 19";
		String out = "YES";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test6() {
		String in = "10\n1 1 1 1 1 1 1 11 19 19";
		String out = "NO";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test7() {
		String in = "10\n19 10 1 1 1 1 1 1 10 19 19";
		String out = "YES";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test8() {
		String in = "10\n19 10 11 1 1 1 1 1 10 19 19";
		String out = "NO";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test9() {
		String in = "10\n19 0 0 19 0 19 38 38 0 19";
		String out = "YES";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test10() {
		String in = "9\n1000000000 0 500000000 0 0 500000000 500000000 0 1000000000";
		String out = "YES";
		assertEquals(out,run(in));
	}
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main714B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
