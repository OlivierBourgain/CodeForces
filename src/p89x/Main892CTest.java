package p89x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main892CTest {


	@Test
	public void test0() {
		String in = "1\n2";
		String out = "-1";
		assertEquals(out,run(in));
	}

	@Test
	public void test0b() {
		String in = "1\n1";
		String out = "0";
		assertEquals(out,run(in));
	}

	@Test
	public void test1() {
		String in = "5\n2 2 3 4 6";
		String out = "5";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "4\n2 4 6 8";
		String out = "-1";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test2b() {
		String in = "2\n4 6";
		String out = "-1";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "3\n2 6 9";
		String out = "4";
		assertEquals(out,run(in));
	}
	
	// 4 - Order of the first reduction matters.
	@Test
	public void test4() {
		String in = "5\n3 6 9 12 16";
		String out = "6";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test4b() {
		String in = "5\n12 16 9 6 3";
		String out = "5";
		assertEquals(out,run(in));
	}

	@Test
	public void test4c() {
		String in = "5\n16 12 9 6 3";
		String out = "6";
		assertEquals(out,run(in));
	}

	@Test
	public void test5() {
		String in = "5\n97 97 97 97 2";
		String out = "5";
		assertEquals(out,run(in));
	}
	
	
	// 6 - List contains several `1`
	@Test
	public void test6() {
		String in = "5\n1 97 1 97 2";
		String out = "3";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6b() {
		String in = "5\n1 1 1 97 2";
		String out = "2";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6c() {
		String in = "5\n1 1 1 1 1";
		String out = "0";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test7() {
		String in = "5\n3 9 36 18 4";
		String out = "7";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test8() {
		String in = "10\n3 9 36 18 4 28 56 21 9 6";
		String out = "11";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test9() {
		String in = "10\n3 9 36 18 180 28 56 21 28 14";
		String out = "12";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test10() {
		String in = "11\n3 9 36 18 54 180 28 56 21 28 14";
		String out = "13";
		assertEquals(out,run(in));
	}
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main892C.run(is,os);
		String res = baos.toString();
		return res;
	}

}
