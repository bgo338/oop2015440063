
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Tina");
		Animal aCat = new Cat("����");
		
		aDog.sing();
		aCat.sing();
		//aDog.playFetch(); //error : upcasting�Ǿ��ֱ� ������  Dog���� �ִ� �޼ҵ� ������ �� ����.
		((Dog) aDog).playFetch(); //downcasting�߱� ������ ����
		//((Dog) aCat).playFetch(); //runtime error
	}

}
