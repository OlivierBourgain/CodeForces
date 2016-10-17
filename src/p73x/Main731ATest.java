package p73x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Main731ATest {

	@Test
	public void test1() {
		String in = "zeus";
		String out = "18";
		assertEquals(out, run(in));
	}

	@Test
	public void test2() {
		String in = "map";
		String out = "35";
		assertEquals(out, run(in));
	}

	@Test
	public void test3() {
		String in = "ares";
		String out = "34";
		assertEquals(out, run(in));
	}

	@Test
	public void test4() {
		String in = "aaaaaaa";
		String out = "0";
		assertEquals(out, run(in));
	}

	@Test
	public void test5() {
		String in = "abcdef";
		String out = "5";
		assertEquals(out, run(in));
	}

	@Test
	public void test6() {
		String in = "azyxwv";
		String out = "5";
		assertEquals(out, run(in));
	}

	@Test
	public void test7() {
		String in = "aza";
		String out = "2";
		assertEquals(out, run(in));
	}

	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);

		Main731A.run(is, os);
		String res = baos.toString();
		return res;
	}

}
