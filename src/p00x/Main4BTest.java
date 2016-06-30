package p00x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main4BTest {

	@Test
	public void test() {
		String in = "1 48\n5 7\n";
		String out = "NO\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test2() {
		String in = "2 5\n0 1\n3 5\n";
		String out = "YES\n1 4\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test3() {
		String in = "2 16\n0 1\n3 5\n";
		String out = "NO\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test4() {
		String in = "4 16\n0 1\n3 5\n3 5\n4 6\n";
		String out = "YES\n1 5 5 5\n";
		assertEquals(out,run(in));
	}

	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main4B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
