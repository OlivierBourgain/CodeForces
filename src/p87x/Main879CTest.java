package p87x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main879CTest {

	@Test
	public void test1() {
		String in = "3\n" + 
				"| 3\n" + 
				"^ 2\n" + 
				"| 1";
		String out = "3\n" + 
				"| 1\n" + 
				"& 1021\n" + 
				"^ 0";
		assertEquals(out,run(in));
	}
	@Test
	public void test2() {
		String in = "3\n" + 
				"| 1\n" + 
				"& 1021\n" + 
				"^ 0";
		String out = "3\n" + 
				"| 1\n" + 
				"& 1021\n" + 
				"^ 0";
		assertEquals(out,run(in));
	}
	
	
	

	@Test
	public void test11() {
		String in = "3\n" + 
				"& 1\n" + 
				"& 3\n" + 
				"& 5";
		String out = "3\n" + 
				"| 0\n" + 
				"& 1\n" + 
				"^ 0";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test12() {
		String in = "3\n" + 
				"| 0\n" + 
				"& 1\n" + 
				"^ 0";
		String out = "3\n" + 
				"| 0\n" + 
				"& 1\n" + 
				"^ 0";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test20() {
		String in = "3\n" + 
				"^ 1\n" + 
				"^ 2\n" + 
				"^ 3";
		String out = "3\n" + 
				"| 0\n" + 
				"& 1023\n" + 
				"^ 0";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test21() {
		String in = "3\n" + 
				"| 0\n" + 
				"& 1023\n" + 
				"^ 0";
		String out = "3\n" + 
				"| 0\n" + 
				"& 1023\n" + 
				"^ 0";
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
		
		Main879C.run(is,os);
		String res = baos.toString();
		return res;
	}

}
