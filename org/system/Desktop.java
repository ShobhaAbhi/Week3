package org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("I do not have desktop");
		
	}
	public static void main(String[] args) {
		
		Desktop Model = new Desktop();
		Model.computerModel();
		Model.desktopSize();
		
	}

}
