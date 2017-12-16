package p84x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Main842BTest {

	@Test
	public void test1() {
		String in = "8 4\n" + "7\n" + "7 8 1\n" + "-7 3 2\n" + "0 2 1\n" + "0 -2 2\n" + "-3 -3 1\n" + "0 6 2\n" + "5 3 1";
		String out = "2";
		assertEquals(out, run(in));
	}

	@Test
	public void test2() {
		String in = "10 8\n" + "4\n" + "0 0 9\n" + "0 0 10\n" + "1 0 1\n" + "1 0 2";
		String out = "0";
		assertEquals(out, run(in));
	}

	@Test
	public void test3() {
		String in = "";
		String out = "";
		assertEquals(out, run(in));
	}

	@Test
	public void test4() {
		String in = "";
		String out = "";
		assertEquals(out, run(in));
	}

	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);

		Main842B.run(is, os);
		String res = baos.toString();
		return res;
	}

}
