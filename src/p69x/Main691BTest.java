package p69x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main691BTest {

	@Test
	public void test1() {
		String in = "oXoxoXo";
		String out = "TAK";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "bod";
		String out = "TAK";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "ER";
		String out = "NIE";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "ZoZ";
		String out = "NIE";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test5() {
		assertEquals("NIE",run("a"));
		assertEquals("NIE",run("ab"));
		assertEquals("NIE",run("ba"));
		assertEquals("NIE",run("aba"));
		assertEquals("NIE",run("AsA"));
		assertEquals("NIE",run("dfqsflksqkdflkjdg"));
		assertEquals("NIE",run("xxxxxxX"));
		assertEquals("NIE",run("ff"));
		assertEquals("NIE",run("uu"));
	}

	@Test
	public void test6() {
		assertEquals("TAK",run("O"));
		assertEquals("TAK",run("OOO"));
		assertEquals("TAK",run("bOoOd"));
		assertEquals("TAK",run("pq"));
		
	}
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main691B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
