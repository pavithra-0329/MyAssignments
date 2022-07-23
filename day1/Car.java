package week1.day1;

public class Car {
	
	public void applyBreak() {
		System.out.println("applybreak");
	}
    public  void applyGear() {
    	System.out.println("apply gear");
    }
    public  void switchOnAc() {
    	System.out.println("switchonac");
    }
    
    public  void applyAccelerate() {
    	System.out.println("apply accelerate");
    }
    
    	public static void main(String[] args) {
		Car  ca = new Car();
		ca.applyBreak();
		ca.applyGear();
		ca.switchOnAc();
		ca.applyAccelerate();
	}
}



