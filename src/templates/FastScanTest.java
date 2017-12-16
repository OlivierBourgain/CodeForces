package templates;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class FastScanTest {

	@Test
	public void test1() {
		String in = "";
		String out = "";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "";
		String out = "";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "";
		String out = "";
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
		
		FastScan.runTest(is,os);
		String res = baos.toString();
		return res;
	}

}
