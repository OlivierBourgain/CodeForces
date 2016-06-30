package p00x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main003ATest {

	@Test
	public void test() {
		String in = "a8\nh1";
		String out = "7\nRD\nRD\nRD\nRD\nRD\nRD\nRD\n";
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main003A.run(is,os);
		String res = baos.toString();
		
		assertEquals(out,res);
			
	}

	
	@Test
	public void test2() {
		String in = "h2\nb7";
		String out = "6\nLU\nLU\nLU\nLU\nLU\nL\n";
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main003A.run(is,os);
		String res = baos.toString();
		
		assertEquals(out,res);
			
	}
	
	@Test
	public void test3() {
		String in = "h2\nh2";
		String out = "0\n";
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main003A.run(is,os);
		String res = baos.toString();
		
		assertEquals(out,res);
			
	}
	
	
	@Test
	public void test4() {
		String in = "b2\nb4";
		String out = "2\nU\nU\n";
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main003A.run(is,os);
		String res = baos.toString();
		
		assertEquals(out,res);
			
	}

}
