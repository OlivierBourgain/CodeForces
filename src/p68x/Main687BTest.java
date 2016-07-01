package p68x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Main687BTest {

	@Test
	public void test1() {
		String in = "4 5\n2 3 5 12";
		String out = "Yes";
		assertEquals(out, run(in));
	}

	@Test
	public void test2() {
		String in = "2 7\n2 3";
		String out = "No";
		assertEquals(out,run(in));
	}

	@Test
	public void test3() {
		String in = "3 7\n2 3 4";
		String out = "No";
		assertEquals(out, run(in));
	}

	@Test
	public void test4() {
		String in = "4 7\n2 3 4 5";
		String out = "No";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test5() {
		String in = "4 10\n2 3 4 5";
		String out = "Yes";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test6() {
		String in = "15 91\n49 121 83 67 128 125 27 113 41 169 149 19 37 29 71";
		String out = "Yes";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test7() {
		String in = "13 86\n41 64 17 31 13 97 19 25 81 47 61 37 71";
		String out = "No";
		assertEquals(out, run(in));
	}

	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);

		Main687B.runTest(is, os);
		String res = baos.toString();
		return res;
	}

}
