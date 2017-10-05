import org.junit.Test;
import static org.junit.Assert.*;

public class StraightsTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] hand = new int[] {0,3,1,2,0,0,0,0,0,0,0,0,0};
		int k = 2;
		assertEquals(5, new Straights().howMany(hand, k));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] hand = new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1};
		int k = 5;
		assertEquals(9, new Straights().howMany(hand, k));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] hand = new int[] {4,4,4,4,4,4,4,4,4,4,4,4,4};
		int k = 13;
		assertEquals(67108864, new Straights().howMany(hand, k));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] hand = new int[] {4,0,4,0,4,0,4,0,4,0,4,0,4};
		int k = 2;
		assertEquals(0, new Straights().howMany(hand, k));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] hand = new int[] {1,2,3,4,1,2,3,4,1,2,3,4,1};
		int k = 1;
		assertEquals(31, new Straights().howMany(hand, k));
	}
}
