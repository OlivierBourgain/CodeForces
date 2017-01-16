package p75x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Main755BTest {

	@Test
	public void test1() {
		String in = "5 1\npolandball\nis\na\ncool\ncharacter\nnope\n";
		String out = "YES";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "2 2\nkremowka\nwadowicka\nkremowka\nwiedenska";
		String out = "YES";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		String in = "1 1\na\nb";
		String out = "NO";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test4() {
		String in = "";
		String out = "";
		assertEquals(out,run(in));
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main755B.run(is,os);
		String res = baos.toString();
		return res;
	}

}
