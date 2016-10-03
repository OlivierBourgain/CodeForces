package p72x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main723CTest {

	@Test
	public void test1() {
		String in = "4 2\n1 2 3 2";
		String out = "2 1\n1 2 1 2\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "7 3\n1 3 2 2 2 2 1";
		String out = "2 1\n1 3 3 2 2 2 1\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test2b() {
		String in = "7 3\n1 1 1 1 3 2 2";
		String out = "2 1\n3 1 1 1 3 2 2\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "4 4\n1000000000 100 7 1000000000";
		String out = "1 4\n1 2 3 4\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "7 3\n1 2 3 2 1 3 4";
		String out = "2 0\n1 2 3 2 1 3 4\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "10 2\n10 11 12 13 14 15 16 17 18 19";
		String out = "5 10\n1 1 1 1 1 2 2 2 2 2\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "1 1\n1";
		String out = "1 0\n1\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test7() {
		String in = "1 1\n2";
		String out = "1 1\n1\n";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test8() {
		String in = "5 1\n1 2 3 4 5";
		String out = "5 4\n1 1 1 1 1\n";
		assertEquals(out,run(in));
	}
	
	
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main723C.run(is,os);
		String res = baos.toString();
		return res;
	}

}
