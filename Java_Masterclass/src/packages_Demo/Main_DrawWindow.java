package packages_Demo;

public class Main_DrawWindow {

	public static void main(String[] args) {
		
//		How to import same named thing from two different packages.		
//		javafx.scene.Node node = null;
//		org.w3c.dom.Node anotherNode = null;

		MyWindow myWindow = new MyWindow("Complete Java");
		myWindow.setVisible(true);
		
		
	}

}
