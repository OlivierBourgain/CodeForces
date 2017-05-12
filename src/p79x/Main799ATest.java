package p79x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main799ATest {

	@Test
	public void test1() {
		String in = "8 6 4 5";
		String out = "YES";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "8 6 4 6";
		String out = "NO";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "10 3 11 4";
		String out = "NO";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "4 2 1 4";
		String out = "YES";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main799A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
