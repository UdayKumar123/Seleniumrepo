package week1.day2;

public class RemoveDuplicateCharacter {
//to remove the duplicate charatcer in a string
	public static void main(String[] args) {
		String name =("Bangalore");
		int count=0;
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
		for (int j = i+1; j < charArray.length; j++) {	
	     if (charArray[i]==charArray[j]) {
	    	
	    	charArray[i] =' ';
	    	charArray[j] =' ';
	 	
}
}
   System.out.println(charArray[i]);
   
  
		}
		}
		 
	
	}

		

		




		
		


