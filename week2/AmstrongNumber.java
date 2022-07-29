package assignment3.week2;

public class AmstrongNumber {

	public static void main(String[] args) {
		int n = 153;
		 int original =n;
		int remainder;
		int result=0;
		
		
		while (n>0) {
			  remainder= n% 10;
			  result = result +(remainder*remainder*remainder);
			  n=n/10;
			  }
               if(original == result){
			 System.out.println(original +" is an amstrong number");
		 }
		 else {
			 System.out.println(original +" is not an amstrong number");
			  
			 
			}
		
		
		
		 
		 

	}

}
