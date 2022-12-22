package week3.day1;

//using multilevel inheritance calling all methods into student class

public class Student extends Department {
	
public String studentName() {
	return studentName();
		
	}
public String studentDept() {
	return studentDept();
	
}
public String studentld() {
	return studentld();
	
}

public static void main(String[] args) {
	Student professor=new Student();
	professor.collegeName();
	professor.collegecode();
	professor.collegeRank();
	professor.deptName();
	professor.studentName();
	professor.studentDept();
	professor.studentld();
}
}
