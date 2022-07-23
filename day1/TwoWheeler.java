package week1.day1;

public class TwoWheeler {
	int noOfWheels=4;
	short noOfMirrors =2;
	long chassisNumber =1234567894576767L;
	boolean isPunctured;
	String bikeName ="r15";
	double runningKm = 4.5;
	
		public static void main(String[] args) {
		TwoWheeler bike = new TwoWheeler();
		System.out.println(bike.noOfWheels);
		System.out.println(bike.noOfMirrors);
		System.out.println(bike.chassisNumber);
		System.out.println(bike.isPunctured);
		System.out.println(bike.bikeName);
		System.out.println(bike.runningKm);

	}

}
