package p72x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main727ATest {

	@Test
	public void test1() {
		String in = "2 162";
		String out = "YES\n5\n2 4 8 81 162 ";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "4 42";
		String out = "NO";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "100 40021";
		String out = "YES\n5\n100 200 2001 4002 40021 ";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "";
		String out = "";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main727A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
