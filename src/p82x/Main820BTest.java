package p82x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main820BTest {

	@Test
	public void test1() {
		String in = "4 2\n2 1\n3 5\n2 3\n1 5";
		String out = "10";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "4 1\n0 2\n0 3\n3 5\n0 6";
		String out = "5";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "1 0\n100 1000";
		String out = "100";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3bis() {
		String in = "1 1\n100 1000";
		String out = "200";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "10 10\n1 10\n2 10\n3 10\n4 10\n5 10\n6 10\n7 10\n8 10\n9 10\n10 10";
		String out = "80";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main820B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
