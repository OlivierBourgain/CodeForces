package p80x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main807ATest {

	@Test
	public void test1() {
		String in = "6\n3060 3060\n2194 2194\n2876 2903\n2624 2624\n3007 2991\n2884 2884";
		String out = "rated";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "4\n1500 1500\n1300 1300\n1200 1200\n1400 1400";
		String out = "unrated";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "5\n3123 3123\n2777 2777\n2246 2246\n2246 2246\n1699 1699";
		String out = "maybe";
		assertEquals(out,run(in));
	}
	

	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main807A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
