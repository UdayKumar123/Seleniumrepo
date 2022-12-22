package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
	List<String>company=new ArrayList<String>();
	company.add("HCL");
	company.add("Wipro");
	company.add("Aspire Systems");
	company.add("CTS");
	
	Collections.sort(company);
	Collections.reverse(company);
	System.out.println(company);	
	}
	
}	
		
			
		
		
		
		
		
	


