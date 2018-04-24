
public class Dog extends Animal {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sing() { //Overriding
		System.out.println(this.name + " ¸Û¸Û");
	}
	
}
