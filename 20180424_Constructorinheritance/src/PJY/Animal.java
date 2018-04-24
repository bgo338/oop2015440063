package PJY;

public class Animal {
	public Animal() { //디폴트 생성자, 생성자도 상속을 받는다(묵시적 호출), 먼저 호출된다. 
		System.out.println("Animal 디폴트 생성자");		
	}
	public Animal(int a) {
		//명시적 수퍼클라스의 생성자 호출 super();
		System.out.println("Animal 정수형 생성자");
	}
}
