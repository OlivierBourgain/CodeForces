package p77x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main773BTest {

	@Test
	public void test1() {
		String in = "2\n5 15 40 70 115\n50 45 40 30 15";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "3\n55 80 10 -1 -1\n15 -1 79 60 -1\n42 -1 13 -1 -1";
		String out = "3";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "5\n119 119 119 119 119\n0 0 0 0 -1\n20 65 12 73 77\n78 112 22 23 11\n1 78 60 111 62";
		String out = "27";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "4\n-1 20 40 77 119\n30 10 73 50 107\n21 29 -1 64 98\n117 65 -1 -1 -1";
		String out = "-1";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main773B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
