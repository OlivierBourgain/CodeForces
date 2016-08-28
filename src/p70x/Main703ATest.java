package p70x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main703ATest {

	@Test
	public void test1() {
		String in = "3\n3 5\n2 1\n4 2";
		String out = "Mishka";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "2\n6 1\n1 6";
		String out = "Friendship is magic!^^";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "3\n1 5\n3 3\n2 2";
		String out = "Chris";
		assertEquals(out,run(in));
	}
	

	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main703A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
