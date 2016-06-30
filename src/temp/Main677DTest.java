package temp;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Main677DTest {

	@Test
	public void test0() {
		String in = "3 4 3\n2 1 1 1\n1 1 1 1\n2 1 1 3\n";
		String out = "5\n";
		assertEquals(out, run(in));
	}
	

	@Test
	public void test6() {
		String in = "3 3 9\n1 3 5\n8 9 7\n4 6 2\n";
		String out = "22\n";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test7() {
		String in = "3 4 12\n1 2 3 4\n8 7 6 5\n9 10 11 12\n";
		String out = "11\n";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test8() {
		String in = "3 3 4\n2 1 3\n1 3 2\n1 3 4\n";
		String out = "6\n";
		assertEquals(out, run(in));
	}
	


	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);

		Main677D.run(is, os);
		String res = baos.toString();
		return res;
	}

}
