package p00x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main6CTest {

	@Test
	public void test1() {
		String in = "5\n2 9 8 2 7";
		String out = "2 3";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "5\n1 2 3 2 1";
		String out = "3 2";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test3() {
		String in = "4\n1 2 3 3";
		String out = "3 1";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test4() {
		String in = "1\n1";
		String out = "1 0";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "2\n1 1";
		String out = "1 1";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "2\n2 1";
		String out = "1 1";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test7() {
		String in = "2\n1 2";
		String out = "1 1";
		assertEquals(out,run(in));
	}
	

	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main6C.run(is,os);
		String res = baos.toString();
		return res;
	}

}
