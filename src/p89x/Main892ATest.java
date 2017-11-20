package p89x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main892ATest {

	@Test
	public void test1() {
		String in = "2\n" + 
				"3 5\n" + 
				"3 6";
		String out = "YES";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "3\n" + 
				"6 8 9\n" + 
				"6 10 12";
		String out = "NO";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "5\n" + 
				"0 0 5 0 0\n" + 
				"1 1 8 10 5";
		String out = "YES";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "4\n" + 
				"4 1 0 3\n" + 
				"5 2 2 3";
		String out = "YES";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main892A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
