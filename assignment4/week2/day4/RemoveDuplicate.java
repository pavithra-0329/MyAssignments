package assignment4.week2.day4;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text = "We learn java basics as java part of Java sessions in java week1";
		String[] split = text.split(" ");
		int count=0;
		for (int i = 0; i < split.length; i++) {
			for (int j = i+1; j < split.length; j++) {
				if (split[i].equalsIgnoreCase(split[j])) {
					split[j] = "";
				    count++;
		        	}
				}
		}
		
		System.out.println("String without duplicates: ");
		if(count>=1) {
		for (int k = 0; k < split.length; k++) {
			System.out.print(split[k] + " ");
		}

	}
	}
	


	}


