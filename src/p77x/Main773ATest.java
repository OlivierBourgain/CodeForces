package p77x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main773ATest {

	@Test
	public void test1() {
		String in = "4\n3 10 1 2\n7 14 3 8\n20 70 2 7\n5 6 1 1";
		String out = "4\n10\n0\n-1\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test1b() {
		String in = "1\n7 14 3 8\n";
		String out = "10\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "1\n3 7 5 6";
		String out = "17\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "1\n666666 999999 1 2";
		String out = "333333\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test4() {
		String in = "1\n666666 999999 3 4";
		String out = "333333\n";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test4b() {
		String in = "1\n666666666 999999999 3 4";
		String out = "333333333\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "1\n2 10 9999 10000";
		String out = "79990\n";
		assertEquals(out,run(in));
	}
	

	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main773A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
