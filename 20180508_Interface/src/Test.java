import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Animal aaa = new Animal();
//		aaa.sing();
//		Dog tina = new Dog();
//		tina.sing();
//		tina = new Dog();
//		tina.eat();
		Animal aaa = new Dog(); //Dog(�캯) Ŭ�󽺰� Animal(�º�) Ŭ���� subclass�̸� Animal���� ������ �Լ��� �� �� �ִ�.(aaa�� type�� Animal)
								//Animal aaa = (Animal) new Dog(); //Upcasting, ���ٰ� ���� �ǹ�
								

		aaa.sing(); //Dog�� sing�Լ��� ����ȴ�.
					//overriding�� �żҵ带 ȣ���ϸ� subclass�� �żҵ带 �����Ѵ�.
		
		//aaa.eat(); //eat�� Animal�� �Լ��� �ƴϱ� ������ error
		
		aaa = new Cat();
		aaa.sing();//������ (polymorphism) 
				   //1. �ϳ��� Ŭ�󽺷κ��� ���� ����Ŭ�󽺸� ���� ���
				   //2. ��� ����Ŭ�󽺴� ����Ŭ���� �żҵ带 override�Ѵ�.
				   //3. SuperClass refVar = new SubClass();
				   //4. superRefVar.overrideMethod() -> ��ä�� Ŭ�󽺰� ������ �żҵ带 �����Ѵ�.
		
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if (str.equals("dog")) aaa = new Dog(); 
		else aaa = new Cat();
		aaa.sing(); //���� ���ε�(Dynamic Binding) : ���α׷� ���� �� ȣ���� �żҵ带 �����Ѵ�. 
		
		//error// aaa = new Animal(); //Animal�� �߻�Ŭ���� �̹Ƿ� ��ü ���� X
		
		
		
		int a;
		a = (int) 3.1;//����ȯ(type casting)
		
		
		
		Playable t = new Dog(); //dog Ŭ�������� playable���븸 ����
		t.fetch(); 
		
		
		
		
		
		
		
	}

}
