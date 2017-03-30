package p78x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;

import org.junit.Test;

public class Main789BTest {

	@Test
	public void test1() {
		String in = "3 2 30 4\n6 14 25 48";
		String out = "3";
		assertEquals(out, run(in));
	}

	@Test
	public void test1b() {
		String in = "2 -2 1050 4\n6 14 25 10";
		String out = "10";
		assertEquals(out, run(in));
	}

	@Test
	public void test1c() {
		String in = "2 -2 1050 4\n6 14 25 64";
		String out = "10";
		assertEquals(out, run(in));
	}

	@Test
	public void test1d() {
		String in = "2 -2 1050 4\n6 14 25 -64";
		String out = "9";
		assertEquals(out, run(in));
	}

	@Test
	public void test1e() {
		String in = "1 2 1000000000 4\n6 14 25 -64";
		String out = "30";
		assertEquals(out, run(in));
	}

	static Random r = new Random(1);

	@Test
	public void test1f() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append(r.nextInt(10000000) + " ");
		}
		String in = "-1 -2 1000000000 10000\n" + sb.toString();
		String out = "30";
		assertEquals(out, run(in));
	}

	@Test
	public void test2() {
		String in = "123 1 2143435 4\n54343 -13 6 124";
		String out = "inf";
		assertEquals(out, run(in));
	}

	@Test
	public void test3() {
		String in = "123 1 2143435 4\n123 11 -5453 141245";
		String out = "0";
		assertEquals(out, run(in));
	}

	@Test
	public void test4() {
		String in = "0 12 1000 2\n3 4";
		String out = "inf";
		assertEquals(out, run(in));
	}

	@Test
	public void test5() {
		String in = "0 12 1000 2\n0 4";
		String out = "0";
		assertEquals(out, run(in));
	}

	@Test
	public void test6() {
		String in = "12 0 1000 2\n12 0";
		String out = "0";
		assertEquals(out, run(in));
	}

	@Test
	public void test7() {
		String in = "12 0 1000 2\n15 0";
		String out = "1";
		assertEquals(out, run(in));
	}

	@Test
	public void test8() {
		String in = "12 0 1000 2\n12 1";
		String out = "inf";
		assertEquals(out, run(in));
	}

	@Test
	public void test9() {
		String in = "12 0 1000 2\n15 1";
		String out = "inf";
		assertEquals(out, run(in));
	}

	@Test
	public void test10() {
		String in = "12 1 1000 2\n12 1";
		String out = "0";
		assertEquals(out, run(in));
	}

	@Test
	public void test11() {
		String in = "12 1 1000 2\n15 1";
		String out = "inf";
		assertEquals(out, run(in));
	}

	@Test
	public void test12() {
		String in = "123 0 21 4\n543453 -123 6 1424";
		String out = "0";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test43() {
		String in = "123 -1 2143435 4\n54343 -13 6 123";
		String out = "inf";
		assertEquals(out, run(in));		
	}

	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);

		Main789B.runTest(is, os);
		String res = baos.toString();
		return res;
	}

}
