package p89x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main898ATest {

	@Test
	public void test1() {
		String in = "113";
		String out = "110";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "1000000000";
		String out = "1000000000";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "5432359";
		String out = "5432360";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "0";
		String out = "0";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main898A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
