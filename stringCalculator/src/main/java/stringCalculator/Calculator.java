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
		   
		   String[] numArray = numbers.split(",");
	        int sum = 0;

	        for (String num : numArray) {
	            sum += Integer.parseInt(num.trim());
	        }

	        return sum;
	       
	}

}
