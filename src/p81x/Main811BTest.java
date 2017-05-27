package p81x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main811BTest {

	@Test
	public void test1() {
		String in = "5 5\n5 4 3 2 1\n1 5 3\n1 3 1\n2 4 3\n4 4 4\n2 5 3";
		String out = "Yes\nNo\nYes\nYes\nNo\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "6 5\n1 4 3 2 5 6\n2 4 3\n1 6 2\n4 5 4\n1 3 3\n2 6 3";
		String out = "Yes\nNo\nYes\nNo\nYes\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "1 2\n1\n1 1 1\n1 1 1\n";
		String out = "Yes\nYes\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "2 3\n2 1\n1 1 1\n1 1 2\n1 2 1\n";
		String out = "Yes\nYes\nNo\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test5() {
		String in = "20 1\n5 4 3 2 1 10 9 8 7 6 15 14 13 12 11 20 19 18 17 16\n1 20 1\n";
		String out = "No\n";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main811B.runTest(is,os);
		String res = baos.toString();
		return res;
	}

}
