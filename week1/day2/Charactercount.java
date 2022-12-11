package week1.day2;

public class Charactercount {

	public static void main(String[] args) {
		String name = "hexaware";
		char expected ='a';
		int count=0;
		char[] charArray =name .toCharArray();
        for (int i = 0; i < charArray.length; i++) {
	    if(charArray[i]==expected){
		count++;
	
	}
		
	}
System.out.println(count);
}
	
	}

