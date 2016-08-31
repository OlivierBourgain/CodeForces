package p71x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main711CTest {

	

	@Test
	public void test0() {
		String in = "3 2 2\n0 0 0\n1 2\n3 4\n5 3";
		String out = "7";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test1() {
		String in = "3 2 2\n0 0 0\n1 2\n3 4\n5 6";
		String out = "10";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "3 2 2\n2 1 2\n1 3\n2 4\n3 5";
		String out = "-1";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "3 2 2\n2 0 0\n1 3\n2 4\n3 5";
		String out = "5";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "3 2 3\n2 1 2\n1 3\n2 4\n3 5";
		String out = "0";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test5() {
		String in = "4 2 1\n0 0 0 0\n10 30000\n20000 1000000000\n1000000000 50000\n55 55";
		String out = "1000020065";
		assertEquals(out,run(in));
	}
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main711C.run(is,os);
		String res = baos.toString();
		return res;
	}

}
