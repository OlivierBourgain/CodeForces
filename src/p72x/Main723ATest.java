package p72x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main723ATest {

	@Test
	public void test1() {
		String in = "7 1 4";
		String out = "6";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "10 20 30";
		String out = "20";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "1 10 11";
		String out = "10";
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
		
		Main723A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
