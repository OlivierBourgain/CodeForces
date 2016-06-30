package p00x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main4DTest {

	@Test
	public void test() {
		String in = "2 1 1\n2 2\n2 2";
		String out = "1\n1\n";
		assertEquals(out,run(in));
			
	}
	@Test
	public void test0() {
		String in = "2 7 7\n2 2\n2 2";
		String out = "0\n";
		assertEquals(out,run(in));
			
	}

	@Test
	public void test1() {
		String in = "3 3 3\n5 4\n12 11\n9 8\n";
		String out = "3\n1 3 2\n";
		assertEquals(out,run(in));
			
	}

	@Test
	public void test2() {
		String in = "7 1 1\n2 2\n1 4\n2 5\n3 2\n6 5\n6 3\n6 6\n";
		String out = "2\n1 5\n";
		assertEquals(out,run(in));
			
	}
	
	@Test
	public void test3() {
		String in = "9 1 1\n2 2\n1 4\n2 5\n3 2\n6 5\n6 3\n6 6\n4 3\n5 4\n";
		String out = "4\n1 8 9 5\n";
		assertEquals(out,run(in));
			
	}
	
	@Test
	public void test4() {
		String in = "14 1 1\n2 2\n1 4\n2 5\n3 2\n6 5\n6 3\n6 6\n4 3\n5 4\n3 4\n4 5\n5 6\n10 11\n6 7\n";
		String out = "6\n1 10 11 12 14 13\n";
		assertEquals(out,run(in));
			
	}

	
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main4D.run(is,os);
		String res = baos.toString();
		return res;
	}

}
