package week3.day2;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] numbers = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> numberset = new TreeSet<Integer>();
		Set<Integer> numbersetduplicate = new TreeSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (!numberset.add(numbers[i])) {
				numbersetduplicate.add(numbers[i]);
				
			}
			
			}
		//System.out.println(numberset);
		//System.out.println(numbersetduplicate);
			
		
		//System.out.println(unique);	
		//changing into list
		List<Integer> numberlist = new ArrayList<Integer>();
		numberlist.addAll(numberset);
		System.out.println(numberlist);
		

	
	System.out.println(numberlist.size()+1);
		
		
	}

}
