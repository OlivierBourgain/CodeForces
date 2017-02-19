package p76x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main767ATest {

	@Test
	public void test1() {
		String in = "3\n3 1 2";
		String out = "3\n\n2 1\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "5\n4 5 1 2 3";
		String out = "\n5 4\n\n\n3 2 1\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "5\n1 2 3 4 5";
		String out = "\n\n\n\n5 4 3 2 1\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "5\n5 4 3 2 1\n";
		String out = "5\n4\n3\n2\n1\n";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main767A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
