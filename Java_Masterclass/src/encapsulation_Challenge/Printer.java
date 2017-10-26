package encapsulation_Challenge;

public class Printer {
	
	private int tonerLevel = 100;
	private int pagesPrinted;
	private String printerName;
	
	public Printer(int tonerLevel, int pagesPrinted){
		this.printerName = "HP SuperLaser 9000";
		if(tonerLevel >0 && tonerLevel <= 100){
			this.tonerLevel = tonerLevel;
		}
		this.pagesPrinted = 0;
	}
	
	public void printOneSidedPages(int print){
		if(tonerLevel >0 && print < tonerLevel){
			this.tonerLevel = this.tonerLevel-print;
			this.pagesPrinted += print;
			System.out.println("Printed "+print+" pages and toner level is at "+tonerLevel+"%");
		}else if(print > tonerLevel){
			System.out.println("Toner level was at "+tonerLevel+" and tried to print "+print+" pages.");
		}
	}
		
	public void printTwoSidesPages(int print){
		if(tonerLevel >0 && print < tonerLevel){
			this.tonerLevel = this.tonerLevel-(print*2);
			this.pagesPrinted += print;
			System.out.println("Printed "+print+ " two sided pages, and toner level is at "+tonerLevel+"%");
		}else if(print > tonerLevel){
			System.out.println("Toner level was at "+tonerLevel+" and tried to print "+print+" pages.");
		}
	}
	
	public void fillToner(int fill){
		int maxFill = 100;
		if(this.tonerLevel + fill < maxFill){
			this.tonerLevel = this.tonerLevel + fill;
			System.out.println("Toner filled by amout "+fill+" and it is now at "+tonerLevel+"%");
		}else if(this.tonerLevel + fill > maxFill){
			System.out.println(fill+" is too much because toner level is at "+tonerLevel+"%");
		}
	}
	
	public String getPrinterName(){
		System.out.println("Printer name is: "+this.printerName);
		return printerName;
	}
	
	public int getTonerLevel(){
		System.out.println("Toner level is at: "+this.tonerLevel+"%");
		return tonerLevel;
	}
	
	public int getPagesPrinted(){
		System.out.println("Total pages printed is: "+this.pagesPrinted);
		return pagesPrinted;
	}
	
	
	
	

}


