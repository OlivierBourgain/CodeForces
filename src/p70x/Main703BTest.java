package p70x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main703BTest {

	@Test
	public void test1() {
		String in = "4 1\n2 3 1 2\n3";
		String out = "17";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "5 2\n3 5 2 2 4\n1 4";
		String out = "71";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "10 10\n1 1 1 1 1 1 1 1 1 1\n1 2 3 4 5 6 7 8 9 10\n";
		String out = "45";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "3 3\n1 1 1\n1 2 3";
		String out = "3";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main703B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
