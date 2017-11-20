package p89x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main892BTest {

	@Test
	public void test0() {
		String in = "1\n" + 
				"0";
		String out = "1";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test0b() {
		String in = "1\n" + 
				"10";
		String out = "1";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test1() {
		String in = "4\n" + 
				"0 1 0 10";
		String out = "1";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "2\n" + 
				"0 0";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "10\n" + 
				"1 1 3 0 0 0 2 1 0 3";
		String out = "3";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "10\n0 1 0 1 0 1 0 1 0 1 0 1";
		String out = "5";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "10\n1 2 3 4 5 6 7 8 9 0";
		String out = "2";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "10\n0 0 0 0 0 0 0 0 0 0";
		String out = "10";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test7() {
		String in = "10\n0 0 0 0 0 0 0 0 0 3";
		String out = "7";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main892B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
