package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
	String[] words = text.split(" ");
	char[] CharArray = text.toCharArray();
	Set<String>name = new LinkedHashSet<String>();
	
	// add each word into Set
	name.add("We");
	name.add("learn");
	name.add("java");
	name.add("basics");
	name.add("as");
	name.add("part");
	name.add("of");
	name.add("java");
	name.add("sessions");
	name.add("in");
	name.add("java");
	name.add("week1");
	//remove coma
	

	System.out.println(name.toString().replace(",",""));
	}
	
	
	
	
	
	
	
	}


