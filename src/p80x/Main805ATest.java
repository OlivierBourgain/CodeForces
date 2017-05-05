package p80x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main805ATest {

	@Test
	public void test1() {
		String in = "19 29";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "3 6";
		String out = "2";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test2b() {
		String in = "33 36";
		String out = "2";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test2c() {
		String in = "6 10";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "2 1000000000";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "99993 99995";
		String out = "99993";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "99993 99993";
		String out = "99993";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "232 233";
		String out = "232";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test7() {
		String in = "419873015 419873018";
		String out = "2";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main805A.runTest(is,os);
		String res = baos.toString();
		return res;
	}

}
