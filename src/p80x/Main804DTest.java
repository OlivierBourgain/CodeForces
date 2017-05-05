package p80x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Main804DTest {

	public int reference(String s) {
		int cpt = 0;

		while (s.contains("ab")) {
			cpt = (cpt + 1) % 1000000007;
			s = s.replaceFirst("ab", "bba");
		}
		return cpt;
	}

	@Test
	public void test1() {
		String in = "a";
		String out = "0";
		assertEquals(out, run(in));
	}

	@Test
	public void test2() {
		String in = "ab";
		String out = "1";
		assertEquals(out, run(in));
	}

	@Test
	public void test3() {
		String in = "aab";
		String out = "3";
		assertEquals(out, run(in));
	}

	@Test
	public void test3b() {
		String in = "aaab";
		String out = "7";
		assertEquals(out, run(in));
	}

	@Test
	public void test3c() {
		String in = "aaaab";
		String out = "15";
		assertEquals(out, run(in));
	}

	@Test
	public void test3d() {
		String in = "aaaaab";
		String out = "31";
		assertEquals(out, run(in));
	}

	@Test
	public void test4() {
		String in = "bab";
		String out = "1";
		assertEquals(out, run(in));
	}

	@Test
	public void test4b() {
		String in = "baab";
		String out = "3";
		assertEquals(out, run(in));
	}

	@Test
	public void test4c() {
		String in = "baaab";
		String out = "7";
		assertEquals(out, run(in));
	}

	@Test
	public void test4d() {
		String in = "baaaab";
		String out = "15";
		assertEquals(out, run(in));
	}

	@Test
	public void test5() {
		String in = "abb";
		String out = "2";
		assertEquals(out, run(in));
	}

	@Test
	public void test5b() {
		String in = "abab";
		String out = "4";
		assertEquals(out, run(in));
	}

	@Test
	public void test5c() {
		String in = "abaab";
		String out = "8";
		assertEquals(out, run(in));
	}

	@Test
	public void test5d() {
		String in = "abaaab";
		String out = "16";
		assertEquals(out, run(in));
	}

	@Test
	public void test10() {
		String in = "ababababab";
		String out = "57";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test11() {
		String in = "bbabaababaaba";
		String out = "" + reference(in);
		
		assertEquals(out, run(in));
	}
	
	@Test
	public void test12() {
		String in = "baaaaaaaaaaababaababaa";
		//String out = "" + reference(in);
		//System.err.println("Test 12, res = " + out);
		assertEquals("55292", run(in));
	}
	
	@Test
	public void test13() {
		String in = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaababaababaa";
		assertEquals("55292", run(in));
	}

	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);

		Main804D.run(is, os);
		String res = baos.toString();
		return res;
	}

}
