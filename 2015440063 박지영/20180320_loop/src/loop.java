
public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10 정수를 화면에 출력
		int i; //루프 변수
		
		i = 1; //루프 변수 초기화
		while(i<=10) { //루프 조건식
			System.out.println(i); //루프문
			i++; //루프변수 변화
		}
	//	System.out.println("========== 프로그램 종료 ==============");
		
		for (i = 0;  i <+ 10; ++i) {  //while을 for문으로
			System.out.println(i);
		}
		
		int sum = 0;
		i = 1;
		while(i<=10) { //루프 조건식
			sum += i; //루프문
			i++; //루프변수 변화
		}
		System.out.println("Sum = " + sum);
		
		//문장에서 l의 갯수 구하기
		String str = "hello darkness my old friend"; 
		int count = 0;
		for (i= 0; i < str.length(); i++) {
			if(str.charAt(i) != 'l')
				continue;
			count++;
		}
		System.out.println("문장에서 발견한 l의 갯수 = " + count);
		System.out.println("========== 프로그램 종료 ==============");
	}

}
