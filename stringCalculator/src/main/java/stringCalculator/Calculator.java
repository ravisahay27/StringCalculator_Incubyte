package stringCalculator;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Object Add(String numbers) {
		// TODO Auto-generated method stub
		   if (numbers.isEmpty()) {
	            return 0;
	        }
		   
		   String delimiter = ","; 
	        String numbersToProcess = numbers;

	        // Check for custom delimiter at the start of the string
	        if (numbers.startsWith("//")) {
	            int delimiterIndex = numbers.indexOf("\n");
	            delimiter = numbers.substring(2, delimiterIndex); 
	            numbersToProcess = numbers.substring(delimiterIndex + 1); 
	        }

	       
	        numbersToProcess = numbersToProcess.replace("\n", delimiter);

	        // Split the numbers string by the delimiter
	        String[] numArray = numbersToProcess.split(delimiter);
	        
	        int sum = 0;

	        for (String num : numArray) {
	            sum += Integer.parseInt(num.trim());
	        }

	        return sum;
	       
	}

}
