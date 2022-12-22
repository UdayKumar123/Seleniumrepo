package week3.day1;
//single inheritance
public class Desktop extends Computer {
	
	public String Desktopsize(){
		return "32";
		
	}
	public static void main(String[] args) {
	
		Desktop name = new Desktop();
		name.Desktopsize();
		name.computerModel();
		
	}
}
