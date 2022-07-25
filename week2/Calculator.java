package Assignments.week2;

public class Calculator {
	public int addTwoNumber(int a,int b) {
		int c=a+b;
		return(c);
	}
	public int subractionTwoNumber(int e,int f) {
		int g = e-f;
		return(g);
	}
	 public double  multipleTwoNumber(double i,double j) {
		 double k=i*j;
		 return(k);
	 }
	 public float divideTwoNumber(float x,float y) {
		 float z= x/y;
		 return z;
	 }
	
	 public static void main(String[] args) {
		Calculator calc =new Calculator();
		int add = calc.addTwoNumber(50, 50);
		System.out.println("Addition of two numbers : " + add );
		int sub =calc.subractionTwoNumber(100, 50);
		System.out.println("Subtraction of two numbers: " + sub);
		double multi =calc.multipleTwoNumber(6, 7);
		System.out.println("Multiplication of two numbers: " + multi);
		float divide =calc.divideTwoNumber(12, 3);
		System.out.println("Divide of two numbers: "+divide);
		 
			
		}
		

	}


