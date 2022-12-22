package week3.day2;

import java.util.Arrays;
import java.util.HashSet;

import java.util.Set;

public class Missingnumber {

	public static void main(String[] args) {
		int[] nums= {1,2,3,5,6,7,8,9,8,10};
		int missingnumber=0;
		Arrays.sort(nums);
		//duplicate number 8
		Set<Integer>unique=new HashSet<Integer>();
		
		for (int i = 1; i < nums.length; i++) {
			if (i+1!=nums[i]) {
				missingnumber=i+1;
			break;
			}
		
			}
			
		

System.out.println(missingnumber);


		
	}
}


