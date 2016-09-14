package p71x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main713ATest {

	@Test
	public void test1() {
		String in = "12\n+ 1\n+ 241\n? 1\n+ 361\n- 241\n? 0101\n+ 101\n? 101\n- 101\n? 101\n+ 4000\n? 0";
		String out = "2\n1\n2\n1\n1\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "4\n+ 200\n+ 200\n- 200\n? 0\n";
		String out = "1\n";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "3\n+ 13579\n+ 35791\n? 11111";
		String out = "2\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test4() {
		String in = "7\n+ 24680\n+ 86420\n? 00000\n+ 1234567\n? 00000\n? 1010101\n+ 121212\n";
		String out = "2\n2\n1\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "7\n+ 0\n? 0\n? 1\n+ 0\n? 0\n? 1\n? 0000\n";
		String out = "1\n0\n2\n0\n2\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "8\n+ 1\n? 0\n? 1\n+ 1\n? 0\n? 1\n? 0000\n? 1111\n";
		String out = "0\n1\n0\n2\n0\n0\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test7() {
		String in = "10\n+ 92\n+ 2212\n+ 50\n+ 414\n? 010\n+ 3\n+ 110\n+ 25\n+ 1030\n? 010";
		String out = "4\n4\n";
		assertEquals(out,run(in));
	}
	

	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main713A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
