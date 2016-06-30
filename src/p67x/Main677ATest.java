package p67x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Main677ATest {

	@Test
	public void test1() {
		String in = "3 7\n4 5 14\n";
		String out = "4\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test2() {
		String in = "6 1\n1 1 1 1 1 1\n";
		String out = "6\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test3() {
		String in = "6 5\n7 6 8 9 10 5";
		String out = "11\n";
		assertEquals(out,run(in));
	}
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main677A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
