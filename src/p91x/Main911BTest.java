package p91x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main911BTest {

	@Test
	public void test1() {
		String in = "5 2 3";
		String out = "1";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "4 7 10";
		String out = "3";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "10 15 30";
		String out = "4";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "10 15 35";
		String out = "5";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "10 100 3";
		String out = "3";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main911B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
