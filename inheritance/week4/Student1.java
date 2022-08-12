package inheritance.week4;

public class Student1 {
	
	public void getStudentInfo(int id) {
		System.out.println(id);
	}

	
	public void getStudentInfo(String name) {
		System.out.println(name);
		
		
	}
	
	public void getStudentInfo(int id,String email) {
		System.out.println(id+" "+email);
	}
	
	public void getStudentInfo(long id) {
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		Student1 stude= new Student1();
		stude.getStudentInfo(100);
		stude.getStudentInfo("pavithra");
		stude.getStudentInfo(100, "pavi897@gmail.com");
		stude.getStudentInfo(90876452213l);
		
		
		
	

	}

}
