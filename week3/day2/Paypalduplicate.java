package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Paypalduplicate {



	public static void main(String[] args) {
		String Company="Paypal India";
		Company=Company.toLowerCase();
		
		char[] charArray = Company.toCharArray();
		Set<Character>charset = new LinkedHashSet<Character>();
		Set<Character>duplicateset = new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			if (!charset.add(charArray[i])) {
				duplicateset.add(charArray[i]);
	
			}
			charset.removeAll(duplicateset);
		}
		
		System.out.println(charset.toString().replace(",",""));
		System.out.println(duplicateset.toString().replace(",",""));
		
			
		}
		
		}
	

