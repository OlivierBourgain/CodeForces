package p79x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main796ATest {

	@Test
	public void test1() {
		String in = "5 1 20\n0 27 32 21 19";
		String out = "40";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "7 3 50\n62 0 0 0 99 33 22";
		String out = "30";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "10 5 100\n1 0 1 0 0 0 0 0 1 1";
		String out = "20";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "10 5 100\n0 1 0 0 0 0 1 0 0 0";
		String out = "20";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "10 5 100\n0 0 0 1 0 0 0 1 0 0";
		String out = "10";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "10 10 100\n0 0 0 1 0 0 0 1 0 0";
		String out = "20";
		assertEquals(out,run(in));
	}
	
	
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main796A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
