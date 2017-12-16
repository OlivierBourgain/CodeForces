package p89x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main898CTest {

	@Test
	public void test1() {
		String in = "2\n" + 
				"ivan 1 00123\n" + 
				"masha 1 00123";
		String out = "2\n" + 
				"masha 1 00123\n" + 
				"ivan 1 00123\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "3\n" + 
				"karl 2 612 12\n" + 
				"petr 1 12\n" + 
				"katya 1 612";
		String out = "3\n" + 
				"karl 1 612\n" + 
				"petr 1 12\n" + 
				"katya 1 612\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "4\n" + 
				"ivan 3 123 123 456\n" + 
				"ivan 2 456 456\n" + 
				"ivan 8 789 3 23 6 56 9 89 2\n" + 
				"dasha 2 23 789";
		String out = "2\n" + 
				"dasha 2 789 23\n" + 
				"ivan 4 123 456 789 2\n";
		assertEquals(out,run(in));
	}
	


	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main898C.run(is,os);
		String res = baos.toString();
		return res;
	}

}
