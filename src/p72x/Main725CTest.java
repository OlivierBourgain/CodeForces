package p72x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main725CTest {

	@Test
	public void test1() {
		String in = "ABCDEFGHIJKLMNOPQRSGTUVWXYZ";
		String out = "ABCDEFGHIJKLM\nZYXWVUTSRQPON";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "BUVTYZFQSNRIWOXXGJLKACPEMDH";
		String out = "Impossible";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "ABCDEFGHIJKGLMNOPQRSTUVWXYZ";
		String out = "WXYZABCDEFGHI\nVUTSRQPONMLKJ";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "ABCDEFGHIJKLMNOPQRSTUVBWXYZ";
		String out = "ZABCDEFGHIJKL\nYXWVUTSRQPONM";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "LMNOPQRSTUVWXYQZABCDEFGHIJK";
		String out = "IJKLMNOPQRSTU\nHGFEDCBAZYXWV";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "ABCDEFGHIJGKLMNOPQRSTUVWXYZ";
		String out = "VWXYZABCDEFGH\nUTSRQPONMLKJI";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test7() {
		String in = "ABCDEFGHIJKDLMNOPQRSTUVWXYZ";
		String out = "UVWXYZABCDEFG\nTSRQPONMLKJIH";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test8() {
		String in = "AEIOUYBCDFGHJKLMNPQRSTOVWXZ";
		String out = "AEIOUYBCDFGHJ\nZXWVTSRQPNMLK";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test9() {
		String in = "AEIOUYBCDFGHJKLMNPQRSTVOWXZ";
		String out = "AEIOUYBCDFGHJ\nZXWVTSRQPNMLK";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test10() {
		String in = "AEIOUYBCDFGHJKLMNPQRSZTVWXZ";
		String out = "HJKLMNPQRSZTV\nGFDCBYUOIEAXW";
		assertEquals(out,run(in));
	}
	@Test
	public void test11() {
		String in = "ABCDEFGHIJKLMNOPQRSTUVWXZYZ";
		String out = "MNOPQRSTUVWXZ\nLKJIHGFEDCBAY";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test12() {
		String in = "ZABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String out = "ZABCDEFGHIJKL\nYXWVUTSRQPONM";
		assertEquals(out,run(in));
	}

	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main725C.run(is,os);
		String res = baos.toString();
		return res;
	}

}
