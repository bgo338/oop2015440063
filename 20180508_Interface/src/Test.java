import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Animal aaa = new Animal();
//		aaa.sing();
//		Dog tina = new Dog();
//		tina.sing();
//		tina = new Dog();
//		tina.eat();
		Animal aaa = new Dog(); //Dog(우변) 클라스가 Animal(좌변) 클라스의 subclass이면 Animal관련 변수와 함수를 쓸 수 있다.(aaa의 type은 Animal)
								//Animal aaa = (Animal) new Dog(); //Upcasting, 윗줄과 같은 의미
								

		aaa.sing(); //Dog의 sing함수가 실행된다.
					//overriding한 매소드를 호출하면 subclass의 매소드를 수행한다.
		
		//aaa.eat(); //eat는 Animal의 함수가 아니기 때문에 error
		
		aaa = new Cat();
		aaa.sing();//다형성 (polymorphism) 
				   //1. 하나의 클라스로부터 여러 서브클라스를 만들 경우
				   //2. 모든 서브클라스는 수퍼클라스의 매소드를 override한다.
				   //3. SuperClass refVar = new SubClass();
				   //4. superRefVar.overrideMethod() -> 객채의 클라스가 구현한 매소드를 실행한다.
		
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if (str.equals("dog")) aaa = new Dog(); 
		else aaa = new Cat();
		aaa.sing(); //동적 바인딩(Dynamic Binding) : 프로그램 수행 시 호출할 매소드를 결정한다. 
		
		//error// aaa = new Animal(); //Animal은 추상클래스 이므로 객체 생성 X
		
		
		
		int a;
		a = (int) 3.1;//형변환(type casting)
		
		
		
		Playable t = new Dog(); //dog 클래스에서 playable내용만 관심
		t.fetch(); 
		
		
		
		
		
		
		
	}

}
