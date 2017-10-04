package compositionChallange;

public class Play {
	
	private Monitor monitor;
	private PS4 ps4;
	
	public Play(Monitor monitor, PS4 ps4){
		this.monitor = monitor;
		this.ps4 = ps4;
	}
	
	public void gameOn(){
		ps4.startPS4();
		monitor.turnMonitorOn();
	}
	
	private void useCheats(){
		System.out.println("Cheats used!");
	}
	

}
