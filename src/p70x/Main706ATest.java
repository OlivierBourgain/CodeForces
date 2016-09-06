package p70x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main706ATest {

	@Test
	public void test1() {
		String in = "0 0\n2\n2 0 1\n0 2 2";
		String out = "1.0";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "1 3\n3\n3 3 2\n-2 3 6\n-2 7 10";
		String out = "0.5";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "0 0\n1\n1 1 1";
		String out = "1.4142135623730951";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "";
		String out = "";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main706A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
