
public class car {
	//Fields
	private String color;
	private int speed;
	//정적 변수(Static fields)
	public static int numberOfCars = 0;
	
	/*Constructor(생성자) : 메소드명이 클라스 이름과 같다. 
	  					    반환형이 없다. 
						    객체를 생성할 때 생성자가 돌아감.
						    만약 생성자를 정의하지 않으면 매개변수 없는 생성자를 자바에서 자동으로 생성해준다.
						    생성자를 한번이라도 정의하면 다음부터는 매개변수없는 자동 생성자는 못씀(자바가 만들어주지 않는다.)  
						    */
	public car(String color, int speed){
		this.color = color;
		this.speed = speed;
		numberOfCars ++; //객체 생성할 때마다 1 증가.
	}
	public car() { //매개변수 없는 생성자
		this.color = "White"; //매개변수 대신 default를 지정해줌 
		this.speed = 60;
		numberOfCars ++;
	}
	
	//Methods
	public static void Print() { //정적 메소드 (정적 메소드에서는 정적변수만 접근할 수 있다, 인스턴스 메소드를 호출할 수 없다.)
		//System.out.println(this.color + "," + this.speed);  this 쓰면 error.
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
