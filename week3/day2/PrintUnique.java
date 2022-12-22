package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUnique {

	public static void main(String[] args) {
		String text ="babu";
		char[] CharArray = text.toCharArray();
		Set<Character>unique = new LinkedHashSet<Character>();
		Set<Character>duplicate = new LinkedHashSet<Character>();
	
		
		for (int i = 0; i <CharArray.length; i++) {
			if (!unique.add(CharArray[i])) {
				duplicate.add(CharArray[i]);
									
				}
			
		}
		unique.removeAll(duplicate);	
		System.out.println(unique.toString().replace(",",""));	
		
			
			
			}
			
	
		
			
		
		
		}
		
		
		

	


