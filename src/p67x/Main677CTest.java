package p67x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Main677CTest {

	@Test
	public void test0() {
		String in = "09AZaz-_";
		String out = "143178169\n";
		assertEquals(out, run(in));
	}
	

	@Test
	public void test6() {
		String in = "0";
		String out = "729\n";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test7() {
		String in = "00";
		String out = "531441\n";
		assertEquals(out, run(in));
	}
	@Test
	public void test1() {
		String in = "z";
		String out = "3\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test4() {
		String in = "V_V\n";
		String out = "9\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test5() {
		String in = "Codeforces\n";
		String out = "130653412\n";
		assertEquals(out, run(in));
	}

	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);

		Main677C.run(is, os);
		String res = baos.toString();
		return res;
	}

}
