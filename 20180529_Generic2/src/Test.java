
public class Test {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		String str = new String("Hello");
		
		box.set(str);
		System.out.println("The box has " + box.get());

		Box<Integer> box2 = new Box<Integer>();
		Integer i = new Integer(10);
		
		box2.set(i);
		System.out.println("The box has " + box2.get());
	}

}
