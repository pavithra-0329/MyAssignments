package Assignments.week2;

public class EmployeeDatabase {
	
		 public void employeeName(String empname) {
			 System.out.println(empname); 
		 }
	 public void employeeId(int empid) {
		 System.out.println(empid);
		 
	 }
	 public void employeeAddress(String empaddress) {
		 System.out.println(empaddress);
	 }
		 public void employeeSalary(double empsalary  ) {
			 System.out.println(empsalary);
		 }
			 
		 public void employeeMobileNumber(long mobnum) {
			 System.out.println(mobnum);
		 }
	 
	public static void main(String[] args) {
		EmployeeDatabase emp = new EmployeeDatabase();
		emp.employeeName("divya");
		emp.employeeId(14);
		emp.employeeAddress("chennai");
		emp.employeeSalary(30000);
		emp.employeeMobileNumber(1234567489L);
		
		
		}

	}


	