package p89x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main898BTest {

	@Test
	public void test1() {
		String in = "7\n" + 
				"2\n" + 
				"3";
		String out = "YES\n" + 
				"2 1";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "100\n" + 
				"25\n" + 
				"10";
		String out = "YES\n" + 
				"0 10";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "15\n" + 
				"4\n" + 
				"8";
		String out = "NO";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "9960594\n" + 
				"2551\n" + 
				"2557";
		String out = "YES\n" + 
				"1951 1949";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "10000000\n1\n734098";
		String out = "YES\n456726 13";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test6() {
		String in = "10000000\n734098\n3";
		String out = "YES\n1 3088634";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main898B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
