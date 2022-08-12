package inheritance.week4;

public class AxisBank extends BankInfo {
	
	
	public void deposit() {
		System.out.println("deposit");
	}
     public static void main(String[] args) {
	
	AxisBank axis= new AxisBank();
	axis.deposit();
	axis.saving();
	axis.fixed();
	axis.deposit();
}
}
