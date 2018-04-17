
public class car {
	//Fields
	private String color;
	private int speed;
	//���� ����(Static fields)
	public static int numberOfCars = 0;
	
	/*Constructor(������) : �޼ҵ���� Ŭ�� �̸��� ����. 
	  					    ��ȯ���� ����. 
						    ��ü�� ������ �� �����ڰ� ���ư�.
						    ���� �����ڸ� �������� ������ �Ű����� ���� �����ڸ� �ڹٿ��� �ڵ����� �������ش�.
						    �����ڸ� �ѹ��̶� �����ϸ� �������ʹ� �Ű��������� �ڵ� �����ڴ� ����(�ڹٰ� ��������� �ʴ´�.)  
						    */
	public car(String color, int speed){
		this.color = color;
		this.speed = speed;
		numberOfCars ++; //��ü ������ ������ 1 ����.
	}
	public car() { //�Ű����� ���� ������
		this.color = "White"; //�Ű����� ��� default�� �������� 
		this.speed = 60;
		numberOfCars ++;
	}
	
	//Methods
	public static void Print() { //���� �޼ҵ� (���� �޼ҵ忡���� ���������� ������ �� �ִ�, �ν��Ͻ� �޼ҵ带 ȣ���� �� ����.)
		//System.out.println(this.color + "," + this.speed);  this ���� error.
		System.out.println(numberOfCars);
	}
	
	
	
	
	
	
	
	public String toString() {
		return ("Color is " + this.color + ". Speed is " + this.speed + ".");		
	}
	
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
