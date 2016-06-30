package p68x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Main682ATest {

	@Test
	public void test1() {
		String in = "6 12";
		String out = "14";
		assertEquals(out, run(in));
	}

	@Test
	public void test2() {
		String in = "11 14";
		String out = "31";
		assertEquals(out, run(in));
	}

	@Test
	public void test3() {
		String in = "1 5";
		String out = "1";
		assertEquals(out, run(in));
	}

	@Test
	public void test4() {
		String in = "3 8";
		String out = "5";
		assertEquals(out, run(in));
	}

	@Test
	public void test5() {
		String in = "5 7";
		String out = "7";
		assertEquals(out, run(in));
	}

	@Test
	public void test6() {
		String in = "21 21";
		String out = "88";
		assertEquals(out, run(in));
	}

	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);

		Main682A.run(is, os);
		String res = baos.toString();
		return res;
	}

}
