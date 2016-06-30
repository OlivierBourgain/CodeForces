package p68x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;

import org.junit.Test;

public class Main682BTest {

	@Test
	public void test1() {
		String in = "5\n1 3 3 3 6";
		String out = "5";
		assertEquals(out, run(in));
	}

	@Test
	public void test2() {
		String in = "2\n2 1";
		String out = "3";
		assertEquals(out, run(in));
	}

	@Test
	public void test3() {
		String in = "10\n1 3 5 7 9 2 4 6 8 10";
		String out = "11";
		assertEquals(out, run(in));
	}

	@Test
	public void test4() {
		String in = "10\n1 3 5 7 9 2 4 6 8 0";
		String out = "10";
		assertEquals(out, run(in));
	}

	@Test
	public void test5() {
		Random r = new Random();
		StringBuilder in = new StringBuilder("100000\n");
		for (int i = 0; i < 100000; i++)
			in.append(r.nextInt(100000) + " ");
		System.out.println("GO GO GO");
		String res = run(in.toString());
		System.out.println(res);
	}

	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);

		Main682B.run(is, os);
		String res = baos.toString();
		return res;
	}

}
