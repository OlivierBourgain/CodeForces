package p68x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main688BTest {

	@Test
	public void test1() {
		String in = "1";
		String out = "11";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "10";
		String out = "1001";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "123456789";
		String out = "123456789987654321";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "123456789987654321";
		String out = "123456789987654321123456789987654321";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "123456789987654321123456789987654321";
		String out = "123456789987654321123456789987654321123456789987654321123456789987654321";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main688B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
