package p00x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main6BTest {

	@Test
	public void test1() {
		String in = "3 4 R\nG.B.\n.RR.\nTTT.\n";
		String out = "2";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test2() {
		String in = "3 3 Z\n...\n.H.\n..Z\n";
		String out = "0";
		assertEquals(out,run(in));
	}
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main6B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
