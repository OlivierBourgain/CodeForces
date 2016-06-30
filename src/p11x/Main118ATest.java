package p11x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main118ATest {

	@Test
	public void test() {
		String in = "tour";
		String out = ".t.r\n";
		assertEquals(out,run(in));
			
	}

	@Test
	public void test2() {
		String in = "aBAcAba";
		String out = ".b.c.b\n";
		assertEquals(out,run(in));
			
	}

	
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main118.run(is,os);
		String res = baos.toString();
		return res;
	}

}
