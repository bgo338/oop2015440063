
public class Test {

	public static void main(String[] args) {
		Box box = new Box();
		String str = new String("Hello");
		
		box.setObject(str); //Object Ÿ���� �ƴ� string�̾ upcasting�Ǿ �� �� ����(��Ӱ���)
		//Integer i = i + box.getdata(); //int�� primitive type, Integer�� reference type
		Integer i = new Integer(3);
		System.out.println(i);
		System.out.println("the box contain " + box.getdata());
		int a = 10;
		box.setObject(a); //autoboxing
		//a = box.setObject(a) + 10; //error box.setObject�� ��ȯ���� Object
		System.out.println(box.getdata());
	}

}
