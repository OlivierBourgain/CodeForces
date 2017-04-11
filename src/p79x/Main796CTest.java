package p79x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Main796CTest {

	@Test
	public void test1() {
		String in = "5\n1 2 3 4 5\n1 2\n2 3\n3 4\n4 5";
		String out = "5";
		assertEquals(out, run(in));
	}

	@Test
	public void test2() {
		String in = "7\n38 -29 87 93 39 28 -55\n1 2\n2 5\n3 2\n2 4\n1 7\n7 6";
		String out = "93";
		assertEquals(out, run(in));
	}

	@Test
	public void test3() {
		String in = "5\n1 2 7 6 7\n1 5\n5 3\n3 4\n2 4";
		String out = "8";
		assertEquals(out, run(in));
	}

	@Test
	public void test4() {
		String in = "1\n-268";
		String out = "-268";
		assertEquals(out, run(in));
	}

	@Test
	public void test5() {
		String in = "2\n-268 322\n1 2";
		String out = "322";
		assertEquals(out, run(in));
	}

	@Test
	public void test6() {
		String in = "2\n7 7\n1 2";
		String out = "8";
		assertEquals(out, run(in));
	}

	@Test
	public void test7() {
		String in = "3\n5 5 5\n1 2\n2 3";
		String out = "6";
		assertEquals(out, run(in));
	}

	@Test
	public void test8() {
		String in = "4\n5 5 5 5\n1 2\n2 3\n3 4";
		String out = "7";
		assertEquals(out, run(in));
	}

	@Test
	public void test9() {
		String in = "4\n5 5 5 5\n1 2\n1 3\n1 4";
		String out = "6";
		assertEquals(out, run(in));
	}

	@Test
	public void test10() {
		String in = "3\n8 1 8\n1 2\n2 3";
		String out = "9";
		assertEquals(out, run(in));
	}

	@Test
	public void test11() {
		String in = "4\n8 1 1 8\n1 2\n2 3\n3 4";
		String out = "10";
		assertEquals(out, run(in));
	}

	@Test
	public void test12() {
		int n = 300000;
		StringBuilder in = new StringBuilder().append(n).append("\n");
		for (int i = 0; i < n; i++)
			in.append(i + 1).append("\n");
		for (int i = 1; i < n; i++)
			in.append(i).append(' ').append(i + 1).append("\n");

		String out = "" + n;
		assertEquals(out, run(in.toString()));
	}

	@Test
	public void test13() {
		int n = 300000;
		StringBuilder in = new StringBuilder().append(n).append("\n");
		for (int i = 0; i < n; i++)
			in.append(i + 1).append("\n");
		for (int i = 1; i < n; i++)
			in.append(1).append(' ').append(i + 1).append("\n");

		String out = "" + (n + 1);
		assertEquals(out, run(in.toString()));
	}

	@Test
	public void test14() {
		int n = 300000;
		StringBuilder in = new StringBuilder().append(n).append("\n");
		for (int i = 0; i < n; i++)
			if (i % 2 == 1) in.append(-i).append("\n");
			else in.append(i + 1).append("\n");
		for (int i = 1; i < n; i++)
			if (i % 2 == 1) in.append(i).append(' ').append(i + 1).append("\n");
			else in.append(1).append(' ').append(i + 1).append("\n");

		String out = "" + (n - 1);
		assertEquals(out, run(in.toString()));
	}

	// ==================================================================================
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main796C.runTest(is,os);
		String res = baos.toString();
		return res;
	}

}
