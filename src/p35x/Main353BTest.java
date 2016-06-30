package p35x;
import static org.junit.Assert.*;

import org.junit.Test;

public class Main353BTest {

	@Test
	public void test() {
		assertEquals(2, Main353B.go(2, 1, 1, 1, 2));
		assertEquals(6, Main353B.go(3, 3, 1, 2, 3));
		assertEquals(0, Main353B.go(100, 100, 100, 1, 1));
		assertEquals(0, Main353B.go(100, 100, 100, 2, 2));

		assertEquals(6866200000L, Main353B.go(100000, 64022, 49026, 55956, 88430));

		assertEquals(100000, Main353B.go(100000, 1, 1, 1, 100000));
		assertEquals(774000, Main353B.go(1000,522 ,575 ,426, 445));

	}

}
