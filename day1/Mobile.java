package week1.day1;

public class Mobile {
	 public void   sendMessage() {
		 System.out.println(" send message");
	 }
				 
		 public void shareDocument() {
			 System.out.println("share document");
		 }
		 public void call() {
			 System.out.println("call");
		 }
		 
		 public static void main(String[] args) {
			Mobile mob = new Mobile();
			mob.sendMessage();
			mob.shareDocument();
			mob.call();
			
		}

}