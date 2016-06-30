package p67x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main677BTest {

	@Test
	public void test1() {
		String in = "5 6 3\n5 4 3 2 1\n";
		String out = "5\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test4() {
		String in = "10 10 10\n1 1 1 1 1 1 1 1 1 1\n";
		String out = "1\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "10 10 5\n1 1 1 1 1 1 1 1 1 1\n";
		String out = "2\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test2() {
		String in = "5 6 3\n5 5 5 5 5\n";
		String out = "10\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test3() {
		String in = "5 6 3\n1 2 1 1 1\n";
		String out = "2\n";
		assertEquals(out,run(in));
	}
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main677B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
