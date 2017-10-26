package composition_Challange;

public class Monitor {
	
	private String model;
	private String resolution;
	private int size;
	
	public Monitor(String model, String resolution, int size){
		this.model = model;
		this.resolution = resolution;
		this.size = size;
	}
	
	public void turnMonitorOn(){
		System.out.println(model+" monitor size "+size+" is turned on at "+resolution+".");
	}
	
	public String getModel(){
		System.out.println("Monitor model is: "+model);
		return model;
	}
	
	public String getResolution(){
		System.out.println("Monitor resolution is: "+resolution);
		return resolution;
	}

	public int getSize(){
		System.out.println("Monitor size is: "+size);
		return size;
	}
}
