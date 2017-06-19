package p81x;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main816CTest {

	@Test
	public void test1() {
		String in = "3 5\n2 2 2 3 2\n0 0 0 1 0\n1 1 1 2 1";
		String out = "4\nrow 1\nrow 1\nrow 3\ncol 4\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test1b() {
		String in = "5 3\n1 0 2\n1 0 2\n1 0 2\n2 1 3\n1 0 2";
		String out = "4\ncol 1\ncol 3\ncol 3\nrow 4\n";
		assertEquals(out,run(in));
	}

	@Test
	public void test2() {
		String in = "3 3\n0 0 0\n0 1 0\n0 0 0";
		String out = "-1";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "3 4\n1 1 1 1\n1 1 1 1\n1 1 1 1";
		String out = "3\nrow 1\nrow 2\nrow 3\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3b() {
		String in = "4 3\n1 1 1\n1 1 1\n1 1 1\n1 1 1";
		String out = "3\ncol 1\ncol 2\ncol 3\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test4() {
		String in = "1 1\n1";
		String out = "1\ncol 1\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "10 10\n30 30 30 33 30 33 30 33 30 33\n431 431 431 434 431 434 431 434 431 434\n19 19 19 22 19 22 19 22 19 22\n24 24 24 27 24 27 24 27 24 27\n5 5 5 8 5 8 5 8 5 8\n0 0 0 3 0 3 0 3 0 3\n0 0 0 3 0 3 0 3 0 3\n0 0 0 3 0 3 0 3 0 3\n0 0 0 3 0 3 0 3 0 3\n0 0 0 3 0 3 0 3 0 3";
		assertTrue(run(in).startsWith("521\n"));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main816C.run(is,os);
		String res = baos.toString();
		return res;
	}

}
