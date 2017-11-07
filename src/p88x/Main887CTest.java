package p88x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main887CTest {

	@Test
	public void test1() {
		String in = "2 5 4 6 1 3 6 2 5 5 1 2 3 5 3 1 1 2 4 6 6 4 3 4";
		String out = "NO";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "5 3 5 3 2 5 2 5 6 2 6 2 4 4 4 4 1 1 1 1 6 3 6 3";
		String out = "YES";
		assertEquals(out,run(in));
	}
	

	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main887C.run(is,os);
		String res = baos.toString();
		return res;
	}

}
