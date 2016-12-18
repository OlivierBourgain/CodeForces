package p74x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main745ATest {

	@Test
	public void test1() {
		String in = "abcd";
		String out = "4";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "bbb";
		String out = "1";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "yzyz";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "x";
		String out = "1";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "dslqfjqglkqsdqslkgjqlskmgjqslkdjgqlmskdgjqlskdjdgq";
		String out = "50";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main745A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
