package PJY2;

import PJY1.*;

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
	//	aBasil.age = 2; //age is a private field 

		//Ÿ ��Ű���� Ŭ�󽺸� ����Ϸ���
		//1. ��Ű����.Ŭ�󽺸�
		//PJY1.Dog aDog = new PJY1.Dog();
		//2. import ��Ű����.*;
		Dog aDog = new Dog();
		aDog.name = "happy";
		//error aDog.nickName = "kk"; nickName�� ��Ű�� ��������
	}

}
