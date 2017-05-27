package p81x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main811ATest {

	@Test
	public void test1() {
		String in = "1 1";
		String out = "Valera";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "7 6";
		String out = "Vladik";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "99999999 99999999";
		String out = "Vladik";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test4() {
		String in = "9 6";
		String out = "Valera";
		assertEquals(out,run(in));
	}
	


	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main811A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
