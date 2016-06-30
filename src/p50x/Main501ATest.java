package p50x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main501ATest {

	@Test
	public void test1() {
		String in = "500 1000 20 30";
		String out = "Vasya\n";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test2() {
		String in = "1000 1000 1 1";
		String out = "Tie\n";
		assertEquals(out,run(in));
	}
	
	
	@Test
	public void test3() {
		String in = "1500 1000 176 177";
		String out = "Misha\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test4() {
		String in = "250 500 0 0";
		String out = "Vasya\n";
		assertEquals(out,run(in));
	}
	
	@Test
	public void test5() {
		String in = "1250 500 0 0";
		String out = "Misha\n";
		assertEquals(out,run(in));
	}
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main501A.run(is,os);
		String res = baos.toString();
		return res;
	}

}
