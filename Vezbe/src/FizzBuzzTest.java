import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void testFizzBazz() {
		String rez = FizzBuzz.fizzBazz(15);
		assertEquals("FizzBuzz", rez);
	}	
	@Test
	void testFizzBazz_1() {
		String rez = FizzBuzz.fizzBazz(1);
		assertEquals("1", rez);
	}	
	@Test
	void testFizzBazz_2() {
		String rez = FizzBuzz.fizzBazz(20);
		assertEquals("Buzz", rez);
	}	
	@Test
	void testFizzBazz_3() {
		String rez = FizzBuzz.fizzBazz(66);
		assertEquals("Fizz", rez);
	}	
	@Test
	void testFizzBazz_4() {
		String rez = FizzBuzz.fizzBazz(30);
		assertEquals("FizzBuzz", rez);
	}	
	@Test
	void testFizzBazz_5() {
		String rez = FizzBuzz.fizzBazz(99);
		assertEquals("Fizz", rez);	
	}
}
