package p00x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main5ATest {

	@Test
	public void test1() {
		String in = "+Mike\nMike:hello\n+Kate\n+Dmitry\n-Dmitry\nKate:hi\n-Kate";
		String out = "9\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test2() {
		String in = "+Mike\n-Mike\n+Mike\nMike:Hi   I am here\n-Mike\n+Kate\n-Kate";
		String out = "14\n";
		assertEquals(out,run(in));
	}
	
	

	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main5A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
