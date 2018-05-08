package PJY1;

public class Test {

	public static void main(String[] args) {
		Dog tina = new Dog();
		tina.print();
		tina.name = "Tina";
	//	tina.IDN = "30942394" //error IDN is a private field
		tina.nickName = "tt";
		tina.publicField = "U2";
	//	tina.privateField = "Sting"; error
		tina.packageField = "Ed";
		tina.protectedField = "Beatles";
		tina.print();
		
		 
	}

}
