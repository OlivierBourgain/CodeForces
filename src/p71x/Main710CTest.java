package p71x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main710CTest {

	@Test
	public void test1() {
		String in = "1";
		String out = "1";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "3";
		System.out.println(run(in));
	}
	
	@Test
	public void test3() {
		String in = "5";
		System.out.println(run(in));
	}
	
	
	@Test
	public void test4() {
		String in = "7";
		System.out.println(run(in));
	}
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main710C.run(is,os);
		String res = baos.toString();
		return res;
	}

}
