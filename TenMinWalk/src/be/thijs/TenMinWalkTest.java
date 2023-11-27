package be.thijs;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TenMinWalkTest {

	@Test
	public void Test() {
		assertEquals("Should return true", true, TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
		assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
		assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'w'}));
		assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
	}

}
