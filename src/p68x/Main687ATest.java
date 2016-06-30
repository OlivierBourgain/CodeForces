package p68x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Main687ATest {

	@Test
	public void test1() {
		String in = "4 2\n1 2\n2 3";
		String out = "2\n1 3\n1\n2\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test2() {
		String in = "3 3\n1 2\n2 3\n1 3";
		String out = "-1";
		assertEquals(out, run(in));
	}

	@Test
	public void test3() {
		String in = "5 4\n1 2\n1 5\n2 3\n5 4";
		String out = "3\n1 3 4\n2\n2 5\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test4() {
		String in = "5 5\n1 2\n1 5\n2 3\n5 4\n3 4";
		String out = "-1";
		assertEquals(out, run(in));
	}

	@Test
	public void test5() {
		String in = "5 6\n1 2\n1 5\n2 3\n5 4\n3 4\n1 5";
		String out = "-1";
		assertEquals(out, run(in));
	}

	@Test
	public void test6() {
		String in = "4 2\n2 3\n3 4";
		String out = "2\n2 4\n1\n3\n";
		assertEquals(out, run(in));
	}

	
	@Test
	public void test7() {
		String in = "5 4\n1 2\n2 5\n2 3\n5 4";
		String out = "3\n1 3 5\n2\n2 4\n";
		assertEquals(out, run(in));
	}
	
	
	@Test
	public void test8() {
		String in = "5 5\n1 2\n2 5\n2 3\n5 4\n3 4";
		String out = "3\n1 3 5\n2\n2 4\n";
		assertEquals(out, run(in));
	}
	
	
	@Test
	public void test9() {
		String in = "2 1\n1 2\n";
		String out = "1\n1\n1\n2\n";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test10() {
		String in = "100000 1\n4900 2345\n";
		String out = "1\n2345\n1\n4900\n";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test11() {
		String in = "100000 2\n1 2\n11 12\n";
		String out = "2\n1 11\n2\n2 12\n";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test12() {
		String in = "100000 4\n1 2\n11 12\n21 22\n31 32\n";
		String out = "4\n1 11 21 31\n4\n2 12 22 32\n";
		assertEquals(out, run(in));
	}
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);

		Main687A.run(is, os);
		String res = baos.toString();
		return res;
	}

}
