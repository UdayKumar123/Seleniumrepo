package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String name = "MADAM";
char[]charArray=name.toCharArray();
for(int i =charArray.length-1; i >=0; i--) {
	System.out.print(charArray[i]);
}
	}
}


