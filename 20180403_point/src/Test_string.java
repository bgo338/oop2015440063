
public class Test_string {

	public static void main(String[] args) {
		String str1 = new String("Hello"); //str1에는 주소값이 들어감(참조형 변수이므로)
		String str2 = new String("Hello");
		
		System.out.println(str1.equals(str2)); //문자열을 비교하여 True가 출력됨
		System.out.println(str1 == str2);  //str1과 str2의 주소값을 비교하는 것이기 때문에 False가 출력됨
		
		//매개 변수로 쓰일때는 참조값이 복사된다.
	}

}
