package p75x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main755ATest {

	@Test
	public void test1() {
		String in = "3";
		String out = "1";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "4";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "10";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "98";
		String out = "1";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "666";
		String out = "1";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "900";
		String out = "1";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test7() {
		String in = "906";
		String out = "2";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main755A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
