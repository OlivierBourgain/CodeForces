package p68x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Main682CTest {

	@Test
	public void test1() {
		String in = "9\n88 22 83 14 95 91 98 53 11\n3 24\n7 -8\n1 67\n1 64\n9 65\n5 12\n6 -80\n3 8\n";
		String out = "5";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test2() {
		String in = "3\n1 2 3\n1 1\n1 2\n";
		String out = "0";
		assertEquals(out, run(in));
	}
	
	
	@Test
	public void test3() {
		String in = "3\n1 2 3\n1 1\n1 4\n";
		String out = "1";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test4() {
		String in = "1\n1";
		String out = "0";
		assertEquals(out, run(in));
	}
	@Test
	public void test6() {
		String in = "8\n53 41 22 22 34 95 56 24\n3 -20\n7 -56\n5 -3\n3 22\n1 37\n6 -34\n2 32";
		String out = "1";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test5() {
		String in = "8\n2 19 83 95 9 87 15 6\n6 16\n7 98\n5 32\n7 90\n8 37\n2 -34\n1 -83";
		String out = "5";
		assertEquals(out, run(in));
	}



	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);

		Main682C.run(is, os);
		String res = baos.toString();
		return res;
	}

}
