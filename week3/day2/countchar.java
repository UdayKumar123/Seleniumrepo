package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class countchar {

	public static void main(String[] args) {
		String company="amazon development center";
		String replace = company.replace(" ","");
		char[] charArray = replace.toCharArray();
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if(map.containsKey(charArray[i])) {
				Integer existingcount = map.get(charArray[i]);
				map.put(charArray[i], existingcount+1);
			}else {
				map.put(charArray[i], 1);
			}
			
		}
		System.out.println(map);
		
	}

}
