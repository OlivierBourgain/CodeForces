package p91x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main911DTest {

	@Test
	public void test1() {
		String in = "3\n" + 
				"1 2 3\n" + 
				"2\n" + 
				"1 2\n" + 
				"2 3";
		String out = "odd\neven\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "4\n" + 
				"1 2 4 3\n" + 
				"4\n" + 
				"1 1\n" + 
				"1 4\n" + 
				"1 4\n" + 
				"2 3";
		String out = "odd\n" + 
				"odd\n" + 
				"odd\n" + 
				"even\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "";
		String out = "";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "";
		String out = "";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main911D.run(is,os);
		String res = baos.toString();
		return res;
	}

}
