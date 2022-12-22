package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Findmostduplicate {

	public static void main(String[] args) {
		String name = "abbabab";
		int count=0;
		
		char[] charArray = name.toCharArray();
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		//loop through every Integer
		for (int i = 0; i < charArray.length; i++) {
			//before adding to map->i should check if the integer is already exist
		if (map.containsKey(charArray[i])) {
			//if it already exist,update the number (key) with value as e
			Integer existingcount =map.get(charArray[i]);
			map.put(charArray[i], existingcount+1);
			
		} else {
			//if it doesn't exist,add the number key to the map with 1 as value
             map.put(charArray[i],1);
		}
		
		}
	
			
	
System.out.println(map);
	
	}

	}

