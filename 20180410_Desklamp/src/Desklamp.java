
public class Desklamp {
	//�ʵ�
	private boolean isOn;
	
	//�޼ҵ�
	public void turnOn() {
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
	}
	
	public String toString() {
		if(isOn == true)
			return "���� ���´� " + "����";
		else 
			return "���� ���´� " + "����";
	}
}
