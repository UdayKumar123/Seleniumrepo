package week3.day1;

public class Students {
	

	

	private static Students student;
	public void getStudentInfo(int id) {
		
		int vaue=1345;
		System.out.println(vaue);
		}
	
		public void getStudentInfo(int id,String name) 
		{
				int num=1345;
			String name1="uday";
			System.out.println(num);
			System.out.println(name1);
		}
	
		public void getStudentInfo(String email,String phone) 
		{
				String email1="udayan2992@gmail.com";
				String phone2 = "12345678";
				System.out.println(email1);
				System.out.println(phone2);
			}
		public static void main(String[] args) {
		
		
		Students.student = new Students();
		student.getStudentInfo(1345);
		student.getStudentInfo(1345,"uday");
		
		student.getStudentInfo("udayan2992@gmail.com","12345678");
		
		}
}
	


