package week1.day2;

public class Charco {

	public static void main(String[] args) {
		//print how many time expected character "a" present !!
String name ="momm";
char expected='m';
int count =0;
char[] charArray =name.toCharArray();
for (int i = 0; i < charArray.length; i++){
	if (charArray[i]==expected){
	count++;
	//System.out.println(charArray[i]);
	}	
}
System.out.println(count);
	}
}
	


