package p72x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main725BTest {

	@Test
	public void test1() {
		String in = "1f";
		String out = "1";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "2d";
		String out = "10";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "4a";
		String out = "11";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "5e";
		String out = "18";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		assertEquals("43",run("10a"));
		assertEquals("36",run("11a"));
		assertEquals("3999999999999999995",run("1000000000000000000a"));
		assertEquals("3999999999999999996",run("1000000000000000000b"));
		assertEquals("3999999999999999997",run("1000000000000000000c"));
		assertEquals("3999999999999999994",run("1000000000000000000d"));
		assertEquals("3999999999999999993",run("1000000000000000000e"));
		assertEquals("3999999999999999992",run("1000000000000000000f"));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main725B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
