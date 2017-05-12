package p79x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Main799BTest {

	@Test
	public void test1() {
		String in = "5\n300 200 400 500 911\n1 2 1 2 3\n2 1 3 2 1\n6\n2 3 1 2 1 1";
		String out = "200 400 300 500 911 -1";
		assertEquals(out, run(in));
	}

	@Test
	public void test2() {
		String in = "2\n1000000000 1\n1 1\n1 2\n2\n2 1";
		String out = "1 1000000000";
		assertEquals(out, run(in));
	}

	@Test
	public void test3() {
		String in = "3\n100 200 300\n1 1 1\n2 2 2\n3\n3 3 3";
		String out = "-1 -1 -1";
		assertEquals(out, run(in));
	}

	@Test
	public void test4() {
		String in = "10\n251034796 163562337 995167403 531046374 341924810 828969071 971837553 183763940 857690534 687685084\n3 2 1 3 2 3 1 3 2 1\n2 3 3 1 2 3 2 3 3 2\n10\n1 3 2 3 2 3 3 1 2 3";
		String out = "531046374 163562337 251034796 183763940 341924810 828969071 857690534 687685084 971837553 995167403";
		assertEquals(out, run(in));
	}

	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);

		Main799B.runTest(is, os);
		String res = baos.toString();
		return res;
	}

}