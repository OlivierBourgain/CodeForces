package p00x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main5BTest {

	@Test
	public void test1() {
		String in = "A";
		String out = "***\n*A*\n***\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test2() {
		String in = "ABCD";
		String out = "******\n*ABCD*\n******\n";
		assertEquals(out,run(in));
	}
	@Test
	public void test3() {
		String in = "1\n12\n123\n";
		String out = "*****\n* 1 *\n*12 *\n*123*\n*****\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test4() {
		String in = "This  is\n\nCodeforces\nBeta\nRound\n5\n";
		String out = "************\n* This  is *\n*          *\n*Codeforces*\n*   Beta   *\n*  Round   *\n*     5    *\n************\n";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test5() {
		String in = "welcome to the\nCodeforces\nBeta\nRound 5\n\nand\ngood luck\n";
		String out = "****************\n*welcome to the*\n*  Codeforces  *\n*     Beta     *\n*   Round 5    *\n*              *\n*      and     *\n*  good luck   *\n****************\n";
		assertEquals(out,run(in));
	}
	
	

	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main5B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
