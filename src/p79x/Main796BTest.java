package p79x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main796BTest {

	@Test
	public void test1() {
		String in = "7 3 4\n3 4 6\n1 2\n2 5\n5 7\n7 1";
		String out = "1";
		assertEquals(out, run(in));
	}

	@Test
	public void test2() {
		String in = "5 1 2\n2\n1 2\n2 4";
		String out = "2";
		assertEquals(out, run(in));
	}

	@Test
	public void test3() {
		String in = "5 2 4\n2 4\n1 3\n3 5\n5 1\n1 3";
		String out = "3";
		assertEquals(out, run(in));
	}

	@Test
	public void test4() {
		String in = "5 2 4\n1 4\n1 3\n3 5\n5 1\n1 3";
		String out = "1";
		assertEquals(out, run(in));
	}

	@Test
	public void test5() {
		String in = "5 2 4\n2 4\n2 3\n3 4\n4 5\n5 1";
		String out = "5";
		assertEquals(out, run(in));
	}

	@Test
	public void test6() {
		String in = "5 2 1\n2 4\n4 1";
		String out = "4";
		assertEquals(out, run(in));
	}

	@Test
	public void test7() {
		String in = "5 5 1\n1 2 3 4 5\n4 1";
		String out = "1";
		assertEquals(out, run(in));
	}

	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);

		Main796B.runTest(is, os);
		String res = baos.toString();
		return res;
	}

}
