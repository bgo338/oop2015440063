
public class Desklamp {
	
	private boolean isOn;
	
	public void turnOn() {
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
	}
	
	public String toString() {
		return "���� ���´� " + (isOn == true ? "����" : "����");
	}
}
