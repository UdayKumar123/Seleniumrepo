package week1.day2;

public class Wordcount {

	public static void main(String[] args) {
String name ="AMAZON DEVELOPMENT CENETR CHENNAI";
String name1 =name.toLowerCase();
String[] name2= name1.split(" ");
for (int i = name2.length-1; i>=0; i--) {
	System.out.print(name2[i]+" ");
}
	}

}
