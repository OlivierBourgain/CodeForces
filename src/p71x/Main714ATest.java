package p71x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main714ATest {

	@Test
	public void test1() {
		String in = "1 10 9 20 1";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "1 100 50 200 75";
		String out = "50";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "100000 200000 10 12 14";
		String out = "0";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "100000100 100001000 100000100 100001000 1";
		String out = "901";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "1 100 50 200 50";
		String out = "50";
		assertEquals(out,run(in));
	}	@Test
	public void test6() {
		String in = "1 100 50 200 100";
		String out = "50";
		assertEquals(out,run(in));
	}
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main714A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
