package inheritance.week4;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("student name");
		
	}
	
	public void studentDepart() {
	  System.out.println("student depart");
	}
	
	
	public void studentId() {
		System.out.println("student id");
	}

	public static void main(String[] args) {
	     Student stud = new Student();
	     stud.collegeName();
	     stud.collegeCode();
	     stud.collegeRank();
	     stud.studentDepart();
	     stud.studentName();
	     stud.studentId();
	     stud.departmentName();
	}

}
