package p81x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main810ATest {

	@Test
	public void test1() {
		String in = "2 10\n8 9";
		String out = "4";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "3 5\n4 4 4";
		String out = "3";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "1 10\n1";
		String out = "17";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "2 10\n9 10";
		String out = "0";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main810A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
