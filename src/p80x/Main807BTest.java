package p80x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main807BTest {

	@Test
	public void test1() {
		String in = "239 10880 9889";
		String out = "0";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "26 7258 6123";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "493 8000 8000";
		String out = "24";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "101 6800 6500";
		String out = "0";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "329 19913 19900";
		String out = "8";
		assertEquals(out,run(in));
	}
	
	@Test
	public void generate() {
		int x = 7408;
		System.err.print(x +"=>");
		int i = (x / 50) % 475;
			i = (i * 96 + 42) % 475;
			System.err.print((i + 26) + " ");
	}
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main807B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
