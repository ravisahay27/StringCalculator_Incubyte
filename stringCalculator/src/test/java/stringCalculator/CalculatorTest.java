package stringCalculator;

import static org.junit.Assert.assertEquals;

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

}
