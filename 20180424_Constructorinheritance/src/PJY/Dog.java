package PJY;

public class Dog extends Animal {
	public Dog() {
		System.out.println("Dog 디폴트 생성자");		
	}
	public Dog(int a) {
		//명시적 수퍼클라스의 생성자 호출 super();
		super(a);
		System.out.println("Dog 정수형 생성자");
	}
}
