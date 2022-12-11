package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
	int n=25;
	boolean Prime=true;
	for(int i = 2; i <n; i++) {
		if(n%i== 0)
		{
		System.out.println("it is not a prime");	
		Prime=false;
			break;
		}
	}
	if(Prime==true) {
	System.out.println("it is  a prime");
	  
	}
	}
}
