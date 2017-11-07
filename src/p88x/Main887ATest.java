package p88x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main887ATest {

	@Test
	public void test1() {
		String in = "100010001";
		String out = "yes";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "100";
		String out = "no";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "1001100110101010100111010101";
		String out = "yes";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "0000000010000000";
		String out = "yes";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main887A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
