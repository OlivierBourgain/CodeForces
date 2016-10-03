package p72x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main723BTest {

	@Test
	public void test1() {
		String in = "37\n_Hello_Vasya(and_Petya)__bye_(and_OK)";
		String out = "5 4";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "37\n_a_(_b___c)__de_f(g_)__h__i(j_k_l)m__";;
		String out = "2 6";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "27\n(LoooonG)__shOrt__(LoooonG)";
		String out = "5 2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "5\n(___)";
		String out = "0 0";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "100\n(a_b_c_d)(a_b_c_d)";
		String out = "0 8";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test6() {
		String in = "100\na_b_c_da_b_c_d";
		String out = "2 0";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test7() {
		String in = "100\n(a_b_c_da_b_c_)d";
		String out = "1 6";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test8() {
		String in = "4\nTest";
		String out = "4 0";
		assertEquals(out,run(in));
	}
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main723B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
