package week1.day2;

public class Intersection {

	public static void main(String[] args) {
		int[]score= {1,2,3};
		int[]score1= {1,2,3,4};
		int count=0;
		for (int i = 0; i <score.length; i++) {
			for (int j = 0; j < score1.length; j++) {
				if (score[i]==score1[j]) {
					count++;
				}
				
			}
			
		}
		System.out.println("Commom Value:"+count);
	}

}
