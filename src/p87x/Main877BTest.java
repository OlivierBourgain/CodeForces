package p87x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Main877BTest {

	@Test
	public void test1() {
		String in = "abba";
		String out = "4";
		assertEquals(out, run(in));
	}

	@Test
	public void test2() {
		String in = "bab";
		String out = "2";
		assertEquals(out, run(in));
	}

	@Test
	public void test3() {
		String in = "aabbaaabbbaaa";
		String out = "11";
		assertEquals(out, run(in));
	}

	@Test
	public void test4() {
		String in = "aabbaababbbaaa";
		String out = "11";
		assertEquals(out, run(in));
	}

	@Test
	public void test5() {
		String in = "aabbaabbbbbbbabbbaaa";
		String out = "17";
		assertEquals(out, run(in));
	}

	@Test
	public void test6() {
		String in = "aaaaaaaa";
		String out = "8";
		assertEquals(out, run(in));
	}

	@Test
	public void test7() {
		String in = "baaaaaaaa";
		String out = "9";
		assertEquals(out, run(in));
	}

	
	public void test7b() {
		String in = "baabaaaaaa";
		String out = "9";
		assertEquals(out, run(in));
	}

	@Test
	public void test8() {
		String in = "aaabbb";
		String out = "6";
		assertEquals(out, run(in));
	}
	

	@Test
	public void test9() {
		String in = "bbabbbaabbbb";
		String out = "9";
		assertEquals(out, run(in));
	}

	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);

		Main877B.run(is, os);
		String res = baos.toString();
		return res;
	}

}
