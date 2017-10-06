package encapsulationChallenge;



public class Main {
	
	public static void main(String[] args) {
		
		Printer printer = new Printer(null, 0, 0);
		
		printer.getTonerLevel();
		printer.printOneSidedPages(50);
		printer.getPagesPrinted();
		printer.printTwoSidesPages(10);
		printer.getPagesPrinted();
		printer.fillToner(60);
		
		

	}

}
