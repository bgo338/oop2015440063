package PJY;

public class Dog extends Animal {
	public Dog() {
		System.out.println("Dog ����Ʈ ������");		
	}
	public Dog(int a) {
		//����� ����Ŭ���� ������ ȣ�� super();
		super(a);
		System.out.println("Dog ������ ������");
	}
}
