package p74x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main745BTest {

	@Test
	public void test1() {
		String in = "2 3\nXXX\nXXX";
		String out = "YES";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "2 2\n.X\nXX";
		String out = "NO";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "5 5\n.....\n..X..\n.....\n.....\n.....";
		String out = "YES";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "5 7\n..XXX..\n..X.X..\n..XXX..\n.......\n.......";
		String out = "NO";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "5 7\n..XXX..\n...XX..\n..XXX..\n.......\n.......";
		String out = "NO";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main745B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
