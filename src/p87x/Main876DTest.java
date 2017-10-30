package p87x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main876DTest {

	@Test
	public void test1() {
		String in = "4\n" + 
				"1 3 4 2";
		String out = "1 2 3 2 1";
		assertEquals(out,run(in));
	}
	


	

	@Test
	public void test3() {
		String in = "8\n" + 
				"6 8 3 4 7 2 1 5";
		String out = "1 2 2 3 4 3 4 5 1";
		assertEquals(out,run(in));
	}
	


	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main876D.runTest(is,os);
		String res = baos.toString();
		return res;
	}

}
