package p87x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main876CTest {

	@Test
	public void test1() {
		String in = "21";
		String out = "1\n15";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "20";
		String out = "0";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "444";
		String out = "1\n429";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "1234567";
		String out = "1\n" + 
				"1234544";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "932758346";
		String out = "0";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "932758393";
		String out = "1\n932758346";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main876C.run(is,os);
		String res = baos.toString();
		return res;
	}

}
