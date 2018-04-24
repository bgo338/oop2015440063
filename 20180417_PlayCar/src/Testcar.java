
public class Testcar {

	public static void main(String[] args) {
		//정적 메소드(static method) : 객체를 생성하지 않고 사용할 수 있는 메소드
		System.out.println(Math.cos(0)); 
		car.Print(); //클래스명.정적메소드();
		
		car myCar = new car("Space Blue", 300);
		System.out.println(myCar.numberOfCars);
		car yourCar = new car();
		System.out.println(yourCar.numberOfCars);
		System.out.println(car.numberOfCars); //'클라스명.정적변수명' 으로도 가능
		
		//myCar.setColor("Black");
		//myCar.setSpeed(100);
		System.out.println(myCar);
		System.out.println(myCar);
		
		

	}

}
