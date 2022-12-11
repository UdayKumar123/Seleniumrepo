package week1.day2;

//To sum the digit from string

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		
		int sum =0;
	     char[] charArray = text.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			
			//boolean digit = Character.isDigit(i);
			boolean digit = Character.isDigit(charArray[i]);
			if(digit == true) {
				sum = sum + Character.getNumericValue(charArray[i]);
		


			}
			
				
							}
		System.out.println(sum);

		}
		
	}


