package composition_Challange;

public class Play {
	
	private Monitor monitor;
	private PS4 ps4;
	
	public Play(Monitor monitor, PS4 ps4){
		this.monitor = monitor;
		this.ps4 = ps4;
	}
	
	public void gameOn(){
		monitor.turnMonitorOn();
		ps4.startPS4();
		ps4.insertGameDisc();
		
	}

	

}
