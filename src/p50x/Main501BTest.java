package p50x;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Main501BTest {

	@Test
	public void test1() {
		String in = "5\nMisha ILoveCodeforces\nVasya Petrov\nPetrov VasyaPetrov123\nILoveCodeforces MikeMirzayanov\nPetya Ivanov";
		String out = "3\nPetya Ivanov\nVasya VasyaPetrov123\nMisha MikeMirzayanov\n";
		assertEquals(out, run(in));
	}

	@Test
	public void test2() {
		String in = "2\nMisha ILoveCodeforces\nVasya Petrov\n";
		String out = "2\nVasya Petrov\nMisha ILoveCodeforces\n";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test3() {
		String in = "3\nA B\nB C\nC D\n";
		String out = "1\nA D\n";
		assertEquals(out, run(in));
	}
	
	@Test
	public void test4() {
		String in = "6\nA B\n1 2\nB C\nC D\n2 3\nD E\n";
		String out = "2\nA E\n1 3\n";
		assertEquals(out, run(in));
	}

	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);

		Main501B.run(is, os);
		String res = baos.toString();
		return res;
	}

}
