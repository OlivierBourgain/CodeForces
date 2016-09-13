package p71x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main712BTest {

	@Test
	public void test1() {
		String in = "RRU";
		String out = "-1";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "UDUR";
		String out = "1";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "RUUR";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "LDDLLDDLUR";
		String out = "3";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "LDDLLDDLLDDLURRU";
		String out = "4";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main712B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
