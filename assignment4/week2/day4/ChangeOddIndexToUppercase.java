package assignment4.week2.day4;
 //change odd index to Upper case

public class ChangeOddIndexToUppercase {
	
	

	public static void main(String[] args) {
		String a ="changeme";
		char[] charArray = a.toCharArray();
		String replacestring="";
		
		for(  int i=0;i< charArray.length;i++) {
			
	    if(i%2 ==0)		 
		
		   {
			char replacestring1 = Character.toUpperCase(a.toCharArray()[i]);
			System.out.println(replacestring1  +"  : is odd index" );
		    }
	        else {
	         char replacestring1 = Character.toLowerCase(a.toCharArray()[i]);
	         System.out.println(replacestring1);
	         }
	}
	}
}




