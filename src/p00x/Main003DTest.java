package p00x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main003DTest {

	@Test
	public void test1() {
		String in = "(??)\n1 2\n2 8\n";
		String out = "4\n()()\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test2() {
		String in = "(??)\n1 10\n2 8\n";
		String out = "9\n(())\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test3() {
		String in = "(((?)\n1 10\n";
		String out = "-1\n";
		assertEquals(out,run(in));
	}
	
	

	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main003D.run(is,os);
		String res = baos.toString();
		return res;
	}

}
