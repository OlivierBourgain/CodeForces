package p87x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main877CTest {

	@Test
	public void test1() {
		String in = "2";
		String out = "3\n2 1 2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "3";
		String out = "4\n2 1 3 2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "5";
		String out = "7\n2 4 1 3 5 2 4";
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
		
		Main877C.run(is,os);
		String res = baos.toString();
		return res;
	}

}
