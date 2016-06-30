package p00x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main6ATest {

	@Test
	public void test1() {
		String in = "4 2 1 3";
		String out = "TRIANGLE";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test2() {
		String in = "7 2 2 4";
		String out = "SEGMENT";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test3() {
		String in = "3 5 9 1";
		String out = "IMPOSSIBLE";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test4() {
		String in = "10 10 10 10";
		String out = "TRIANGLE";
		assertEquals(out,run(in));
	}
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main6A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
