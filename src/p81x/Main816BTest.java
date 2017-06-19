package p81x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main816BTest {

	@Test
	public void test1() {
		String in = "3 2 4\n91 94\n92 97\n97 99\n92 94\n93 97\n95 96\n90 100\n";
		String out = "3\n3\n0\n4\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "2 1 1\n1 1\n200000 200000\n90 100";
		String out = "0\n";
		assertEquals(out,run(in));
	}
	

	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main816B.runTest(is,os);
		String res = baos.toString();
		return res;
	}

}
