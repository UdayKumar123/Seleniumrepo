package week1.day2;

import java.util.Arrays;

public class MissingelementInArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,7,6,8};
		//{1,2,3,4,6,7,8}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
	
				if(i+1 != nums[i])  {
		          		
		     		 
					System.out.println(i+1);	
					i=i+2;
					
				}
				}
			
			}
			
			
			
				
			}
			
		
		

	


