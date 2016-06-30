package p67x;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Main676DTest {

	@Test
	public void test1() {
		char[][] tab = {{'v'},{'^'}};
		char[][][] t = generate(tab);
		
		Main676D.Pos p = new Main676D.Pos(1,0,0);
		Main676D.Pos q = new Main676D.Pos(0,0,0);
		
		assertEquals(1, Main676D.go(t,p,q));
	}

	@Test
	public void test2() {
		char[][] tab = {{'L'},{'|'}};
		char[][][] t = generate(tab);
		
		Main676D.Pos p = new Main676D.Pos(1,0,0);
		Main676D.Pos q = new Main676D.Pos(0,0,0);
		
		assertEquals(1, Main676D.go(t,p,q));
	}

	
	@Test
	public void test5() {
		char[][] tab = {{'-'},{'|'}};
		char[][][] t = generate(tab);
		
		Main676D.Pos p = new Main676D.Pos(1,0,0);
		Main676D.Pos q = new Main676D.Pos(0,0,0);
		
		assertEquals(-1, Main676D.go(t,p,q));
	}
	
	@Test
	public void test6() {
		char[][] tab = {{'D'},{'U'}};
		char[][][] t = generate(tab);
		
		Main676D.Pos p = new Main676D.Pos(1,0,0);
		Main676D.Pos q = new Main676D.Pos(0,0,0);
		
		assertEquals(2, Main676D.go(t,p,q));
	}
	
	


	@Test
	public void test4() {
		char[][] tab = {{'^'},{'|'}};
		char[][][] t = generate(tab);
		
		Main676D.Pos p = new Main676D.Pos(1,0,0);
		Main676D.Pos q = new Main676D.Pos(0,0,0);
		
		assertEquals(3, Main676D.go(t,p,q));
	}

	@Test
	public void test3() {
		char[][] tab = {{'R'},{'L'}};
		char[][][] t = generate(tab);
		
		Main676D.Pos p = new Main676D.Pos(1,0,0);
		Main676D.Pos q = new Main676D.Pos(0,0,0);
		
		assertEquals(1, Main676D.go(t,p,q));
	}

	@Test
	public void test7() {
		char[][] tab = {{'D'},{'U'}};
		char[][][] t = generate(tab);
		
		Main676D.Pos p = new Main676D.Pos(0,0,0);
		Main676D.Pos q = new Main676D.Pos(1,0,0);
		
		assertEquals(2, Main676D.go(t,p,q));
	}
	
	@Test
	public void test8() {
		char[][] tab = {{'|'},{'|'},{'U'}};
		char[][][] t = generate(tab);
		
		Main676D.Pos p = new Main676D.Pos(0,0,0);
		Main676D.Pos q = new Main676D.Pos(2,0,0);
		
		assertEquals(4, Main676D.go(t,p,q));
	}
	
	@Test
	public void test9() {
		char[][] tab = {{'|'},{'|'},{'+'}};
		char[][][] t = generate(tab);
		
		Main676D.Pos p = new Main676D.Pos(0,0,0);
		Main676D.Pos q = new Main676D.Pos(2,0,0);
		
		assertEquals(2, Main676D.go(t,p,q));
	}
	
	@Test
	public void test10() {
		System.out.println("Test 10 ");
		char[][] tab = {{'+','*'},{'*','U'}};
		char[][][] t = generate(tab);
		
		Main676D.Pos p = new Main676D.Pos(0,0,0);
		Main676D.Pos q = new Main676D.Pos(1,1,0);
		
		assertEquals(-1, Main676D.go(t,p,q));
	}

	@Test
	public void test11() {
		System.out.println("Test 11 ");
		char[][] tab = {{'+','*'},{'*','U'}};
		char[][][] t = generate(tab);
		
		Main676D.Pos p = new Main676D.Pos(1,1,0);
		Main676D.Pos q = new Main676D.Pos(0,0,0);
		
		assertEquals(-1, Main676D.go(t,p,q));
	}

	@Test
	public void testA() {
		char[][] tab = {{'<','>','<'},{'>','<','>'}};
		char[][][] t = generate(tab);
		
		Main676D.Pos p = new Main676D.Pos(0,0,0);
		Main676D.Pos q = new Main676D.Pos(1,0,0);
		
		assertEquals(4, Main676D.go(t,p,q));
	}
	
	@Test
	public void testB() {
		char[][] tab = {{'<','>','<'},{'>','<','>'}};
		char[][][] t = generate(tab);
		
		Main676D.Pos p = new Main676D.Pos(0,0,0);
		Main676D.Pos q = new Main676D.Pos(1,2,0);
		
		assertEquals(9, Main676D.go(t,p,q));
	}


	private char[][][] generate(char[][] t) {
		char[][][] res = new char[t.length][t[0].length][4];
		for(int i = 0; i<t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {
				res[i][j][0] = t[i][j];
				res[i][j][1] =  Main676D.rotation.get(res[i][j][0]);
				res[i][j][2] =  Main676D.rotation.get(res[i][j][1]);
				res[i][j][3] =  Main676D.rotation.get(res[i][j][2]);
				
			}
		}
		return res;
	}
}
