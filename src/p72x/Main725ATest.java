package p72x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main725ATest {

	@Test
	public void test1() {
		String in = "4\n<<><";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "5\n>>>>>";
		String out = "5";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "4\n>><<";
		String out = "0";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "0\n<<<<<<>>>>><<<<>>>>>>>";
		String out = "13";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main725A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
