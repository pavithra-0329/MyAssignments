package inheritance.week4;

public class Desktop extends Computer {
	
	
	public void desktopSize() {
		System.out.println("desktopsize");
	}

	public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.desktopSize();
		desk.computerModel();
				


	}

}
