package homeWork2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HomeWorkArrayChar {
	
	@Test
	@DisplayName("test of the method count")
	   public void countTest () {
        char[] ar1  = {'1', '2', '3', '1', '2', '2', '2', '3'};
        Arrays arrayChar1 = new Arrays(ar1);
        assertEquals(2, arrayChar1.count('1'));
        assertEquals(4, arrayChar1.count('2'));
        assertEquals(2, arrayChar1.count('3'));
    }
	@Test
	@DisplayName("test of the method compareToIgnoreCase")
	void compareToIgnoreCaseTest() {
		char[] ar1 = {'h', 'E', 'l', 'L', 'o'};
		char[] ar2 = {'h', 'e', 'l', 'l', 'o'};
		Arrays arrayChar1 = new Arrays(ar1);
		Arrays arrayChar2 = new Arrays(ar2);
		assertEquals(0, arrayChar2.compareToIgnoreCase(arrayChar1));
		}
    @Test
	@DisplayName("test of the method Contains")
    void containsTest() {
        char[] ar1 = {'1', '2', '3', '4'};
        Arrays arrayChar = new Arrays(ar1);
        assertTrue(arrayChar.contains('1'));
        assertTrue(arrayChar.contains('2'));
        assertTrue(arrayChar.contains('3'));
        assertTrue(arrayChar.contains('4'));
    }
	@Test
	@DisplayName("test of the method equalsIgnoreCase")
	void equalsIgnoreCaseTest() {
	char[] ar1 = {'h', 'E', 'l', 'L', 'o'};
	char[] ar2 = {'h', 'e', 'l', 'l', 'o'};
	Arrays arrayChar1 = new Arrays(ar1);
	Arrays arrayChar2 = new Arrays(ar2);
	assertEquals(0, arrayChar2.compareToIgnoreCase(arrayChar1));
	}
	void compareToTest() {
		char[] ar1 = {'1','2','3'};
		char[] ar2 = {'9',};
		char[] ar3 = {'1','2','3'};
		Arrays arrayChar1 = new Arrays(ar1);
		Arrays arrayChar2 = new Arrays(ar2);
		Arrays arrayChar3 = new Arrays(ar3);
		assertEquals(8, arrayChar2.compareTo(arrayChar1));
		assertEquals(-8, arrayChar1.compareTo(arrayChar2));
		assertEquals(1, new Arrays(new char [] {'a','a'})
				.compareTo(new Arrays(new char[] {'a'})));
		assertEquals(-1, new Arrays(new char [] {'a'})
				.compareTo(new Arrays(new char[] {'a','a'})));
		assertEquals(0, arrayChar1.compareTo(arrayChar3));
	}
}
