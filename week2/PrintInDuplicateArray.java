package assignment3.week2;

import java.util.Arrays;

public class PrintInDuplicateArray {

	public static void  main (String[] args) {
		int[] a = {14,12,13,11,15,14,18,16,17,18,17,20};
		int len = a.length;
		int count;
		Arrays.sort(a);
		for( int i=0;i<a.length-1;i++) {
			count =1;
			
		         for(int j=1+i;j<a.length;j++) {
			
			         if(a[i]==a[j]) {
			 	      count++;
				
			         }
			        
			        	
		         }
		         if(count>1) {
		               
	        		 System.out.println("Dulicate array : "+a[i]);
	        	 }
        
		         
			
		  }
		
	}

}
		


