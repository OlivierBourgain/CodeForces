package p79x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main796DTest {

	@Test
	public void test1() {
		String in = "6 2 4\n1 6\n1 2\n2 3\n3 4\n4 5\n5 6";
		String out = "1\n3";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "6 3 2\n1 5 6\n1 2\n1 3\n1 4\n1 5\n5 6";
		String out = "2\n4 5";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "10 1 5\n5\n1 2\n2 3\n3 4\n4 5\n5 6\n6 7\n7 8\n8 9\n9 10";
		String out = "0\n";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main796D.runTest(is,os);
		String res = baos.toString();
		return res;
	}

}
