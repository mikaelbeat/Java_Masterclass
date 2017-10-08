package polymorphism;

class Auto{
	
	protected String name;
	protected int wheels;
	
	public Auto(String name, int wheels){
		this.name = name;
		this.wheels = wheels;
	}
	
	public String getName(){
		System.out.println("Name is: "+name);
		return name;
	}
	
	public int getWheels(){
		System.out.println("Number of wheels is: "+wheels+ " wheels.");
		return wheels;
	}

	public String startEngine(){
		return "Default engine started.";
	}
}

class Nissan extends Auto{

	public Nissan(String name, int wheels) {
		super(name, wheels);
	}

	public String getName(){
		System.out.println("Name is Nissan "+name);
		return name;
	}
	
	public int getWheels(){
		System.out.println("Car has "+wheels+" wheels.");
		return wheels;
	}

	@Override
	public String startEngine(){
		return "Nissan engine started.";
	}
}

class Toyota extends Auto{

	public Toyota(String name, int wheels) {
		super(name, wheels);
	}

	public String getName(){
		System.out.println("Name is Toyota "+name);
		return name;
	}
	
	public int getWheels(){
		System.out.println("Car has "+wheels+" wheels.");
		return wheels;
	}

	@Override
	public String startEngine(){
		return "Toyota engine started.";
	}
}

public class Challenge {
	
	public static void main(String[] args) {
		
		Auto car = new Auto("Default", 5);
		car.getName();
		car.getWheels();
		System.out.println(car.startEngine());
		
		System.out.println("");
		
		Nissan nissan = new Nissan("Cruiser", 9);
		nissan.getName();
		nissan.getWheels();
		System.out.println(nissan.startEngine());
		
		System.out.println("");
		
		Toyota toyota = new Toyota("Ninja", 4);
		toyota.getName();
		toyota.getWheels();
		System.out.println(toyota.startEngine());
	}

}
