package p71x;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;

import org.junit.Test;


public class Main710BTest {

	@Test
	public void test1() {
		String in = "4\n1 2 3 4";
		String out = "2";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test2() {
		String in = "5\n1 2 3 4 5";
		String out = "3";
		assertEquals(out,run(in));
	}
	

	@Test
	public void test3() {
		Random r = new Random(1234l);
		StringBuilder sb = new StringBuilder();
		sb.append("300000\n");
		for (int i = 0; i < 300000; i++) {
			sb.append(r.nextInt()).append("\n");
		}
		
		String in = sb.toString();
		String out = "2423136";
		long t1 = System.currentTimeMillis();
		assertEquals(out,run(in));
		long t2 = System.currentTimeMillis();
		System.out.println((t2 - t1) + "ms");
	}
	

	@Test
	public void test4() {StringBuilder sb = new StringBuilder();
		sb.append("100000\n");
		for (int i = 0; i < 100000; i++) {
			sb.append(i).append(" ");
		}
		String in = sb.toString();
		String out = "49999";
		long t1 = System.currentTimeMillis();
		assertEquals(out,run(in));
		long t2 = System.currentTimeMillis();
		System.out.println((t2 - t1) + "ms");
	}
	
	
	
	// ==================================================================================
	private String run(String in) {
		InputStream is = new ByteArrayInputStream(in.getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream os = new PrintStream(baos);
		
		Main710B.runTest(is,os);
		String res = baos.toString();
		return res;
	}

}
