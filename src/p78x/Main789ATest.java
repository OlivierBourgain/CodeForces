package p78x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main789ATest {

	@Test
	public void test1() {
		String in = "3 2\n2 3 4";
		String out = "3";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "5 4\n3 1 8 9 7";
		String out = "5";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "3 2\n2 2 4";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "3 2\n2 2 2";
		String out = "2";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "5 1\n1 2 3 4 5";
		String out = "8";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "5 100\n1 1 1 1 1";
		String out = "3";
		assertEquals(out,run(in));
	}
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main789A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
