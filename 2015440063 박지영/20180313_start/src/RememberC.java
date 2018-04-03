
public class RememberC {

	public static void main(String[] args) {
		/*
	   	변수 : 메모리 저장공간의 이름
		자료형 : 변수가 가질 수 있는 값의 범위
			     변수를 피연산자로 사용할 경우 사용할 수 있는 연산자를 정한다. 
			     값을 메모리에 저장하기 위해 필요한 정보(저장공간의 수, 저장 포맷)을 정한다. 
		변수 선언문 : 변수를 사용하기 위해 필요한 아래의 정보를 표현한다.
		 			1. 사용할 변수의 이름을 지정한다.
		 			2. 사용할 변수의 자료형을 선언한다.
		 			3. JAVA에서 변수를 사용하기 전에 반드시 변수선언을 해야 한다.
		
		*/
		
		int a, b;  //변수 선언문 : 1. a는 변수의 이름이다. 2. 변수 a의 자료형은  int이다. 
		
		//리터럴(literal) :  소스코드에서 값을 표현하는 방법
		//연산자 : 연산을 위한 기호(우선순위가 있다.) 
		//수식(expression) : 연산자와 피연산자들의 조합, 모든 수식은 값을 반환(리턴)한다.
		//대입연산자(=) : 우변의 값이 좌변의 저장소로 이동한다. 우변의 값을 반환한다.
		//부수효과(Side effect) : 수식이 값을 반환하는 것 이외에 수행하는 모든 작업을 부수효과라 한다.
		a = 0x10;
		a = a * 10 + 20;
		
		//post increment(a++) : 반환값은 a, 부수효과는 a = a+1;
		b = a++;
	
		System.out.println("a = " + a + " b = " + b);  //println 하면 자동으로 줄바꿈, 문자열 뒤에 +(연산자)를 붙여 a(변수)의 값을 출력한다.
	
		//pre increment(++a) : 반환값은 a+1, 부수효과는 a=a+1;
		a = 10;
		b = ++a;
		System.out.println("a = " + a + " b = " + b);
		
		//JAVA는 부울 자료형과 true/false 리터럴을 사용한다.
		boolean bb;
		bb = true || false; //논리연산자(&&, ||, !)의 피연산자는 true,false거나 부울 변수여야 한다. 관계연산자(>,<,<= 등등)는 부울 값을 반환한다.
		bb = 0>1; //값이 false이므로 false
		System.out.println("bb = " + bb);
		
	
		//JAVA에서 상수를 선언하려면 final 키워드를 사용해야 한다.
		final int c = 100;
	//	c = 1000; error
		System.out.println("c = " + c);
		
		System.out.println("Helllllo " + "there");  //문자열끼리 붙임
		
		//소숫점 자료형(float, double)
		float ff;
		double dd;
		ff = 3.14F;
		dd = 3.14; //리터럴 "3.14"의 자료형은 double이다.
		
		//형변환(casting) : 유사한 자료형으로 변환한다.
		int x = 10;
		double y=100.34;
	//	y = x; //implicit casting
		x = (int)y; //explicit casting, y = (double)x 사용해도 됨.
		System.out.println("x = " + x + " y = " +y);
		
	}

}
