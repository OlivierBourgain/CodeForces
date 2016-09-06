package p71x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main710ETest {

	@Test
	public void test1() {
		String in = "8 1 1";
		String out = "4";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "8 1 10";
		String out = "8";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "1 7 4";
		String out = "7";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "64 1 2";
		String out = "12";

	}
	
	@Test
	public void test5() {
		String in = "4528217 187553422 956731625";
		String out = "21178755627";

	}
	@Test
	public void test6() {
		String in = "9999999 1 2";
		String out = "54";

	}
	
	
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main710E.run(is,os);
		String res = baos.toString();
		return res;
	}

}
