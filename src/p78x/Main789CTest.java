package p78x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main789CTest {

	@Test
	public void test1() {
		String in = "5\n1 4 2 3 1";
		String out = "3";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "4\n1 5 4 7";
		String out = "6";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "6\n1 10 2 11 3 12";
		String out = "11";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "7\n2 1 10 2 11 3 12";
		String out = "11";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test5() {
		String in = "7\n0 0 0 0 0 0 0";
		String out = "0";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "2\n7 54";
		String out = "47";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main789C.run(is,os);
		String res = baos.toString();
		return res;
	}

}
