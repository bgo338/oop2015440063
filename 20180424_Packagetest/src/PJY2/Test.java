package PJY2;

import PJY1.*;

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
	//	aBasil.age = 2; //age is a private field 

		//타 패키지의 클라스를 사용하려면
		//1. 패키지명.클라스명
		//PJY1.Dog aDog = new PJY1.Dog();
		//2. import 패키지명.*;
		Dog aDog = new Dog();
		aDog.name = "happy";
		//error aDog.nickName = "kk"; nickName은 패키지 접근지정
	}

}
