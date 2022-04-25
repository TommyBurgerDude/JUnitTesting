/**
 * 
 */
package mod1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Tommy Burger
 *
 */
class CounterTester {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		
		//Test Increment
		Counter counter1 = new Counter();
		counter1.increment();
		assertEquals(counter1.getCount(), 1);
	}
	
	@Test
	void test2() {
		
		//Test Decrement
		Counter counter1 = new Counter();
		counter1.decrement();
		assertEquals(counter1.getCount(), -1);
	}

	@Test
	void test3() {
		
		//Test Both
		Counter counter1 = new Counter();
		counter1.increment();
		counter1.decrement();
		assertEquals(counter1.getCount(), 0);
	}

}
