
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Tina");
		Animal aCat = new Cat("망고");
		
		aDog.sing();
		aCat.sing();
		//aDog.playFetch(); //error : upcasting되어있기 때문에  Dog에만 있는 메소드 가져올 수 없다.
		((Dog) aDog).playFetch(); //downcasting했기 때문에 가능
		//((Dog) aCat).playFetch(); //runtime error
	}

}
