package p91x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main911CTest {

	@Test
	public void test1() {
		String in = "2 2 3";
		String out = "YES";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "2 3 4";
		String out = "NO";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "3 3 3";
		String out = "YES";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "27 1 42";
		String out = "YES";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main911C.run(is,os);
		String res = baos.toString();
		return res;
	}

}
