
public class Desklamp {
	//필드
	private boolean isOn;
	
	//메소드
	public void turnOn() {
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
	}
	
	public String toString() {
		if(isOn == true)
			return "현재 상태는 " + "켜짐";
		else 
			return "현재 상태는 " + "꺼짐";
	}
}
