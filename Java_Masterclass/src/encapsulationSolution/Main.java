package encapsulationSolution;

public class Main {

	public static void main(String[] args) {
		
		Printer printer = new Printer(50, true);
		System.out.println("Initial page cout = "+printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was "+pagesPrinted+" new total print count");
	}

}
