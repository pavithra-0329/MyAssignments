package assignment3.week2;

public class PrimeNumber {

	public static void main(String[] args) {
	int input=13;
	int n=input/2;
	int flag=0;
	
	if (input==0||input==1){
		System.out.println(input+" is not a prime number");
	}
	else {
		
	for(int i=2;i<=n;i++) {
		if(input%i==0) {
			System.out.println(input + "  is not prime number");
			flag=1;
			break;
		     }
			}
	}
	
			if(flag==0) {
				 System.out.println(input +" is a prime number");
			
		}
	
	}
}
	
	
	
	
    

	


