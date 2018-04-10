
public class Desklamp {
	
	private boolean isOn;
	
	public void turnOn() {
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
	}
	
	public String toString() {
		return "ÇöÀç »óÅÂ´Â " + (isOn == true ? "ÄÑÁü" : "²¨Áü");
	}
}
