package week1.day2;

import java.util.Collections;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String name = "I am a software tester";
		
		String[] strArray = name.split(" ");
		for (int i = 1; i<strArray.length; i++) {
				
			if(i%2 == 0 ) {
				System.out.println(strArray [i]);
				
			}
		}
		char[] reverse = name.toCharArray();
		for (int j = name.length()-1; j>=0; j--) {
			System.out.print( reverse);
			
			
		}
		
	}
}
				
				
	
			
		
	

	

	


