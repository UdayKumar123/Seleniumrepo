package week1.day2;

public class DuplicateChracter {

	public static void main(String[] args) {
		String name = "Amazon Development";
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i+1; j < charArray.length; j++) {
				if (charArray[i]==charArray[j]) {
				System.out.println("duplicate:"+charArray[i]);	
				}
				
			}
			
				
			}
		}

	}

