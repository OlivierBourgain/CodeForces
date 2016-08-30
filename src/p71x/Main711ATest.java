package p71x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main711ATest {

	@Test
	public void test1() {
		String in = "6\nOO|OX\nXO|XX\nOX|OO\nXX|OX\nOO|OO\nOO|XX";
		String out = "YES\n++|OX\nXO|XX\nOX|OO\nXX|OX\nOO|OO\nOO|XX\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "4\nXO|OX\nXO|XX\nOX|OX\nXX|OX\n";
		String out = "NO";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "5\nXX|XX\nXX|XX\nXO|OX\nXO|OO\nOX|XO";
		String out = "YES\nXX|XX\nXX|XX\nXO|OX\nXO|++\nOX|XO\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "1\nOO|OO";
		String out = "YES\n++|OO\n";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main711A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
