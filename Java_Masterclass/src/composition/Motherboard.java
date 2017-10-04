package composition;

public class Motherboard {
	
	private String model;
	private String manufacturer;
	private int ramSLots;
	private int carSlots;
	private String bios;
	
	public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios){
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSLots = ramSlots;
		this.carSlots = cardSlots;
		this.bios = bios;
	}
	
	public void loadProgram(String programName){
		System.out.println("Program "+programName+" is now loading....");
	}
	
	public String getModel(){
		return model;
	}
	
	public String getManufacturer(){
		return manufacturer;
	}
	
	public int getRamSlots(){
		return ramSLots;
	}
	
	public int getCardSlots(){
		return carSlots;
	}
	
	public String getBios(){
		return bios;
	}
	
	

}
