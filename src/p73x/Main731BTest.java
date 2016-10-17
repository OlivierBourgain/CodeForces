package p73x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main731BTest {

	@Test
	public void test1() {
		String in = "4\n1 2 1 2";
		String out = "YES";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "3\n1 0 1";
		String out = "NO";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "4\n1 1 1 1";
		String out = "YES";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "5\n1 1 1 1 1";
		String out = "NO";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "5\n7 7 15 13 12";
		String out = "YES";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "1\n7";
		String out = "NO";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test7() {
		String in = "1\n6";
		String out = "YES";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test8() {
		String in = "5\n6 4 2 0 2";
		String out = "YES";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test9() {
		String in = "5\n6 4 2 3 2";
		String out = "NO";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main731B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
