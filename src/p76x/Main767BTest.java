package p76x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main767BTest {

	@Test
	public void test1() {
		String in = "10 15 2\n2\n10 13";
		String out = "12";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "8 17 3\n4\n3 4 5 8";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "10 64 5\n10\n10 10 10 10 10 10 40 40 40 40";
		String out = "9";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test4() {
		String in = "10 64 5\n10\n0 0 0 0 0 0 40 40 40 40";
		String out = "39";
		assertEquals(out,run(in));
	}

	
	@Test
	public void test5() {
		String in = "10 21 2\n5\n2 2 2 2 2";
		String out = "1";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "10 22 2\n5\n2 2 2 2 2";
		String out = "20";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test7() {
		String in = "88888888888 99999999999 2\n5\n88888888888 88888888888 88888888888 88888888888 88888888888";
		String out = "88888888898";
		assertEquals(out,run(in));
	}

	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main767B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
