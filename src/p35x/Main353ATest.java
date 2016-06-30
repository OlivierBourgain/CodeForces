package p35x;
import static org.junit.Assert.*;

import org.junit.Test;


public class Main353ATest {
	@Test
	public void test() {
		assertEquals("YES", Main353A.go(1,7,3));
		assertEquals("YES", Main353A.go(10,10,0));
		assertEquals("NO", Main353A.go(1,-4,5));
		assertEquals("NO", Main353A.go(0,60,50));
		assertEquals("YES", Main353A.go(1,-15,-2));
		
		assertEquals("NO", Main353A.go(1,-15,2));
		assertEquals("NO", Main353A.go(1,15,-2));
		
		assertEquals("NO", Main353A.go(1,2,0));
	}
}
