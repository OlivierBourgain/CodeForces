package p91x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main911ATest {

	@Test
	public void test1() {
		String in = "9\n" + 
				"2 1 3 5 4 1 2 3 1";
		String out = "3";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "2\n" + 
				"3 3";
		String out = "1";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "3\n" + 
				"5 6 5";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "10\n2 1 3 1 2 5 4 1 2 5 1";
		String out = "2";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main911A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
