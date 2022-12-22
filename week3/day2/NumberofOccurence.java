package week3.day2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;



public class NumberofOccurence {

	public static void main(String[] args) {
		int[] number= {2,3,5,6,3,2,1,4,2,1,6,-1};
		Map<Integer,Integer>map=new TreeMap<Integer, Integer>();
		//loop through every Integer
		for (int i = 0; i < number.length; i++) {
			//before adding to map->i should check if the integer is already exist
		if (map.containsKey(number[i])) {
			//if it already exist,update the number (key) with value as e
			Integer existingcount =map.get(number[i]);
			map.put(number[i], existingcount+1);
		} else {
			//if it doesn't exist,add the number key to the map with 1 as value
             map.put(number[i],1);
		}
		
		}
System.out.println(map);
	}

}
