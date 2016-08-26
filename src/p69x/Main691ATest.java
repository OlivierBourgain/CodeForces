package p69x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main691ATest {

	@Test
	public void test1() {
		String in = "3\n1 0 1";
		String out = "YES";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "3\n1 0 0";
		String out = "NO";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "1\n1";
		String out = "YES";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "1\n0";
		String out = "NO";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main691A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
