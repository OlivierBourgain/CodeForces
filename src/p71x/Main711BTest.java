package p71x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main711BTest {

	@Test
	public void test0() {
		String in = "1\n0";
		String out = "1";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test1() {
		String in = "3\n4 0 2\n3 5 7\n8 1 6";
		String out = "9";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "4\n1 1 1 1\n1 1 0 1\n1 1 1 1\n1 1 1 1";
		String out = "1";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "4\n1 1 1 1\n1 1 0 1\n1 1 2 1\n1 1 1 1";
		String out = "-1";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "3\n0 7 6\n9 5 1\n4 3 8";
		String out = "2";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test5() {
		String in = "2\n1 2\n2 0";
		String out = "-1";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "2\n1 2\n0 1";
		String out = "-1";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test7() {
		String in = "4\n1 2 3 4\n2 0 4 1\n3 4 1 2\n4 1 2 3";
		String out = "-1";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test8() {
		String in = "4\n1 2 3 4\n2 3 0 1\n3 4 1 2\n4 1 2 3";
		String out = "-1";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test9() {
		String in ="4\n2 2 2 2\n2 0 2 2\n3 2 2 1\n2 2 2 2";
		String out = "-1";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main711B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
