package p00x;
import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class Main001BTest {
	 @Test
	 public void t() {
		assertEquals("BC23", Main001B.go("R23C55")); 
		assertEquals("A1", Main001B.go("R1C1")); 
		assertEquals("Z1", Main001B.go("R1C26"));
		assertEquals("AA1", Main001B.go("R1C27"));
		assertEquals("AZ1", Main001B.go("R1C52"));
		assertEquals("BA1", Main001B.go("R1C53"));
		assertEquals("ZZ1", Main001B.go("R1C702"));
		assertEquals("AAA1", Main001B.go("R1C703"));
		assertEquals("ACO1", Main001B.go("R1C769"));
		
		assertEquals("E99999", Main001B.go("R99999C5"));		
	 }
	 @Test
	 public void inv() {
		assertEquals("R23C55", Main001B.go("BC23")); 
		assertEquals("R1C1", Main001B.go("A1")); 
		assertEquals("R1C26", Main001B.go("Z1"));
		assertEquals("R1C27", Main001B.go("AA1"));
		assertEquals("R1C52", Main001B.go("AZ1"));
		assertEquals("R1C53", Main001B.go("BA1"));
		assertEquals("R1C702", Main001B.go("ZZ1"));
		assertEquals("R1C703", Main001B.go("AAA1"));
		assertEquals("R1C769", Main001B.go("ACO1"));
		
		assertEquals("R99999C5", Main001B.go("E99999"));		
	 }
}
