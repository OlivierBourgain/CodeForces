package p71x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main712CTest {

	@Test
	public void test1() {
		String in = "6 3";
		String out = "4";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "8 5";
		String out = "3";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "22 4";
		String out = "6";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "30 2";
		String out = "9";
		assertEquals(out,run(in));
	}
	
	

	@Test
	public void test5() {
		String in = "100000 3";
		String out = "25";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main712C.run(is,os);
		String res = baos.toString();
		return res;
	}

}
