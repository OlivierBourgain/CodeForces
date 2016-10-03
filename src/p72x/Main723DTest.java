package p72x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Main723DTest {

	@Test
	public void test1() {
		String in = "5 4 1\n****\n*..*\n****\n**.*\n..**";
		String out = "1\n****\n*..*\n****\n****\n..**\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test2() {
		String in = "3 3 0\n***\n*.*\n***";
		String out = "1\n***\n***\n***\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test3() {
		String in = "12 10 0\n..********\n******...*\n**....**.*\n.****....*\n****.**.**\n**....****\n***.**.***\n..****.***\n....******\n******...*\n***...****\n**********";
		String out = "27\n..********\n**********\n**********\n.*********\n**********\n**********\n**********\n..********\n....******\n**********\n**********\n**********\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test3b() {
		String in = "12 10 3\n..********\n******...*\n**....**.*\n.****....*\n****.**.**\n**....****\n***.**.***\n..****.***\n....******\n******...*\n***...****\n**********";
		String out = "5\n..********\n******...*\n**....**.*\n.****....*\n****.**.**\n**....****\n***.******\n..********\n....******\n**********\n***...****\n**********\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test3C() {
		String in = "12 10 2\n..********\n******...*\n**....**.*\n.****....*\n****.**.**\n**....****\n***.**.***\n..****.***\n....******\n******...*\n***...****\n**********";
		String out = "8\n..********\n******...*\n**....**.*\n.****....*\n****.**.**\n**....****\n***.******\n..********\n....******\n**********\n**********\n**********\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test4() {
		String in = "1 1 0\n*";
		String out = "0\n*\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test5() {
		String in = "2 2 0\n..\n..";
		String out = "0\n..\n..\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test6() {
		String in = "1 11 0\n*****.*****";
		String out = "0\n*****.*****\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test7() {
		String in = "11 1 0\n*\n*\n*\n*\n*\n*\n.\n*\n*\n*\n*\n";
		String out = "0\n*\n*\n*\n*\n*\n*\n.\n*\n*\n*\n*\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test8() {
		String in = "9 30 0\n******************************\n*............................*\n*............................*\n*............................*\n*............................*\n*............................*\n*............................*\n*............................*\n******************************\n";
		String out = "196\n******************************\n******************************\n******************************\n******************************\n******************************\n******************************\n******************************\n******************************\n******************************\n";
		assertEquals(out, run(in));
	}
	@Test
	public void test8b() {
		String in = "9 30 1\n******************************\n*............................*\n*............................*\n*............................*\n*............................*\n*............................*\n*............................*\n*............................*\n******************************\n";
		String out = "0\n******************************\n*............................*\n*............................*\n*............................*\n*............................*\n*............................*\n*............................*\n*............................*\n******************************\n";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test9() {
		String in = "5 6 0\n******\n*....*\n*....*\n*....*\n******\n";
		String out = "12\n******\n******\n******\n******\n******\n";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test10() {
		String in = "5 6 0\n******\n*....*\n******\n*....*\n******\n";
		String out = "8\n******\n******\n******\n******\n******\n";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test11() {
		String in = "6 6 0\n*.*.*.\n.*****\n**.**.\n.*****\n*****.\n.*.*.*\n";
		String out = "1\n*.*.*.\n.*****\n*****.\n.*****\n*****.\n.*.*.*\n";
		assertEquals(out, run(in));
	}
	
	
	
	@Test
	public void test12() {
		String in = "5 7 0\n*******\n*.*.*.*\n*******\n*.*.*.*\n*******\n";
		String out = "6\n*******\n*******\n*******\n*******\n*******\n";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test12b() {
		String in = "5 7 2\n*******\n*.*.*.*\n*******\n*.*.*.*\n*******\n";
		String out = "4\n*******\n*******\n*******\n***.*.*\n*******\n";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test13() {
		String in = "3 4 0\n****\n*..*\n****\n\n";
		String out = "2\n****\n****\n****\n";
		assertEquals(out, run(in));
	}
	@Test
	public void test13b() {
		String in = "3 4 1\n****\n*..*\n****\n\n";
		String out = "0\n****\n*..*\n****\n";
		assertEquals(out, run(in));
	}
	
	
	@Test
	public void test14() {
		String in = "3 50 7\n***.********.*********************.**********.****\n*...**..*.**.*.*.*.*.*.*.*..*.*.*.*.*.*.*.*.*.*..*\n****************.*.********.**********************";
		String out = "8\n***.********.*********************.**********.****\n*...**..****.***.*.*******..*******.*.*.*.*.*.*..*\n****************.*.********.**********************\n";
		assertEquals(out, run(in));
	}
	


	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);

		Main723D.run(is, os);
		String res = baos.toString();
		return res;
	}

}
