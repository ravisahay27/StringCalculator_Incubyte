package stringCalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CalculatorTest {
	
	 @Test
	    public void testAddEmptyString() {
	        assertEquals(0,Calculator.Add(""));
	    }
	 
	 @Test
	 public void testAddnumbers() {
		 assertEquals(1, Calculator.Add("1"));
	 }
	 
	 @Test
	 public void testAddtwonumbers() {
		 assertEquals(3, Calculator.Add("1,2"));
	 }
	 
	 @Test
	 public void testAddmultiplenumbers() {
		 assertEquals(4, Calculator.Add("1,2,1"));
	 }
	 
	 @Test
	 public void testnewLineDelimeter() {
		 
		 assertEquals(6,Calculator.Add("1\n2,3"));
	 }
	 
	 @Test
	 public void testdiffrentDelimeter() {
		 assertEquals(3, Calculator.Add("//;\n1;2"));
	 }
	 
	  @Test
	    public void testAddWithNegativeNumbers() {
	        try {
	            Calculator.Add("1,-2,3");
	            fail("Exception expected for negative numbers ");
	        } catch (IllegalArgumentException e) {
	            assertEquals("Negatives not allowed: [-2]", e.getMessage());
	        }
	    }

}
