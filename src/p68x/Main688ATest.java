package p68x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main688ATest {

	@Test
	public void test1() {
		String in = "2 2\n10\n00";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "4 1\n0100";
		String out = "1";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "4 5\n1101\n1111\n0110\n1011\n1111";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "4 11\n1111\n0111\n0111\n1111\n0111\n0111\n0111\n1111\n0111\n0111\n0111\n";
		String out = "3";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test5() {
		String in = "4 12\n1111\n0111\n0111\n1111\n0111\n0111\n0111\n1111\n0111\n0111\n0111\n0111\n";
		String out = "4";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main688A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
