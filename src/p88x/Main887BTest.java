package p88x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Main887BTest {

	@Test
	public void test1() {
		String in = "3\n" +
				"0 1 2 3 4 5\n" +
				"6 7 8 9 0 1\n" +
				"2 3 4 5 6 7";
		String out = "87";
		assertEquals(out, run(in));
	}

	@Test
	public void test2() {
		String in = "3\n" +
				"0 1 3 5 6 8\n" +
				"1 2 4 5 7 8\n" +
				"2 3 4 6 7 9";
		String out = "98";
		assertEquals(out, run(in));
	}
	
	

	@Test
	public void test3() {
		String in = "1\n0 1 2 3 4 6";
		String out = "4";
		assertEquals(out, run(in));
	}

	@Test
	public void test3b() {
		String in = "1\n2 3 4 5 6 7";
		String out = "0";
		assertEquals(out, run(in));
	}

	@Test
	public void test4() {
		String in = "3\n1 2 3 4 6 7\n8 9 1 2 3 4\n6 7 8 9 1 2";
		String out = "4";
		assertEquals(out, run(in));
	}

	@Test
	public void test5() {
		String in = "3\n1 1 2 3 4 5\n6 7 8 9 0 2\n3 4 5 6 7 8";
		String out = "10";
		assertEquals(out, run(in));
	}

	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);

		Main887B.run(is, os);
		String res = baos.toString();
		return res;
	}

}
