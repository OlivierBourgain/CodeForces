package p75x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main755CTest {

	@Test
	public void test1() {
		String in = "5\n2 1 5 3 3";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "1\n1";
		String out = "1";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "8\n6 4 7 7 7 7 4 8";
		String out = "2";
		assertEquals(out,run(in));
	}
	


	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main755C.run(is,os);
		String res = baos.toString();
		return res;
	}

}
