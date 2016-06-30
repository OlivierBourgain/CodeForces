package p50x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Main501CTest {

	@Test
	public void test1() {
		String in = "3\n2 3\n1 0\n1 0\n";
		String out = "2\n1 0\n2 0\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test2() {
		String in = "2\n1 1\n1 0\n";
		String out = "1\n0 1\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test3() {
		String in = "3\n0 0\n0 0\n0 0\n";
		String out = "0\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test4() {
		String in = "4\n2 3\n1 0\n2 3\n1 2\n";
		String out = "3\n1 0\n3 2\n0 2\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test5() {
		String in = "10\n3 0\n3 1\n2 6\n1 0\n4 7\n1 1\n1 2\n1 4\n1 4\n1 4\n";
		String out = "9\n3 0\n5 1\n6 2\n7 4\n8 4\n9 4\n2 0\n4 1\n0 1\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test6() {
		String in = "13\n3 0\n3 1\n2 6\n1 0\n5 13\n1 1\n1 2\n1 4\n1 4\n1 4\n3 3\n1 10\n1 10";
		String out = "12\n3 0\n5 1\n6 2\n7 4\n8 4\n9 4\n11 10\n12 10\n2 0\n10 4\n0 1\n4 1\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test7() {
		int max = 5;
		String in = (max+1) + "\n1 1\n";
		for (int i = 1; i <= (max - 1); i++) {
			int sum = (i - 1) ^ (i + 1);
			in += "2 " + sum + "\n";
		}
		in += "1 " + (max-1) + "\n";
		System.err.println(in);
		String out = "5\n0 1\n5 4\n1 2\n4 3\n2 3\n";
		assertEquals(out, run(in));
	}

	
	@Test
	public void test8() {
		int max = 65536;
		StringBuilder sb = new StringBuilder();
		sb.append("" + (max+1) + "\n1 1\n");
		for (int i = 1; i <= (max - 1); i++) {
			int sum = (i - 1) ^ (i + 1);
			sb.append("2 " + sum + "\n");
		}
		sb.append("1 " + (max-1) + "\n");
		System.err.println("GOGOGOGO");
		
		
		InputStream is = new ByteArrayInputStream(sb.toString().getBytes());
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		long start = System.currentTimeMillis();
		Main501C.run(is, os);
		long end = System.currentTimeMillis();
		System.err.println("Time : " + (end - start));
		
	}
	

	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);

		Main501C.run(is, os);
		String res = baos.toString();
		return res;
	}

}
