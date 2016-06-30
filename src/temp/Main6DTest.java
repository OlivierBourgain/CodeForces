package temp;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main6DTest {

	@Test
	public void test1() {
		String in = "3 2 1\n2 2 2";
		String out = "3\n2 2 2 ";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "4 3 1\n1 4 1 1";
		String out = "4\n2 2 3 3 ";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "3 5 3\n1 2 1";
		String out = "1\n2 ";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "4 5 3\n2 2 2 1";
		String out = "2\n2 3 ";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "10 5 2\n12 10 6 7 11 4 3 5 9 3";
		String out = "13\n2 2 2 2 2 2 2 4 5 5 7 9 9 ";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main6D.run(is,os);
		String res = baos.toString();
		return res;
	}

}
