package p80x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main805BTest {



	@Test
	public void test0() {
		String in = "1";
		String out = "a";
		assertEquals(out,run(in));
	}
	@Test
	public void test1() {
		String in = "2";
		String out = "aa";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "3";
		String out = "aab";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "10";
		String out = "aabbaabbaa";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "7";
		String out = "aabbaab";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test5() {
		String in = "200000";
		String res = run(in);
		assertEquals(200000, res.length());
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main805B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
