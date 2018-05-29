
public class Test {

	public static void main(String[] args) {
		Box box = new Box();
		String str = new String("Hello");
		
		box.setObject(str); //Object 타입이 아닌 string이어도 upcasting되어서 쓸 수 있음(상속관계)
		//Integer i = i + box.getdata(); //int는 primitive type, Integer는 reference type
		Integer i = new Integer(3);
		System.out.println(i);
		System.out.println("the box contain " + box.getdata());
		int a = 10;
		box.setObject(a); //autoboxing
		//a = box.setObject(a) + 10; //error box.setObject의 반환형은 Object
		System.out.println(box.getdata());
	}

}
