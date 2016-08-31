package p71x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main710ATest {

	@Test
	public void test1() {
		String in = "e4";
		String out = "8";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "a1";
		String out = "3";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "b1";
		String out = "5";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "a2";
		String out = "5";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main710A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
