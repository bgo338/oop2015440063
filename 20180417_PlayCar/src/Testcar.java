
public class Testcar {

	public static void main(String[] args) {
		//���� �޼ҵ�(static method) : ��ü�� �������� �ʰ� ����� �� �ִ� �޼ҵ�
		System.out.println(Math.cos(0)); 
		car.Print(); //Ŭ������.�����޼ҵ�();
		
		car myCar = new car("Space Blue", 300);
		System.out.println(myCar.numberOfCars);
		car yourCar = new car();
		System.out.println(yourCar.numberOfCars);
		System.out.println(car.numberOfCars); //'Ŭ�󽺸�.����������' ���ε� ����
		
		//myCar.setColor("Black");
		//myCar.setSpeed(100);
		System.out.println(myCar);
		System.out.println(myCar);
		
		

	}

}
