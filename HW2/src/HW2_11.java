import java.util.Scanner;

public class HW2_11 {

	private static Scanner input;

	public static void main(String[] args) {
		/* 소수(prime-number) 검사와 흡사하게 사용자가 입력한 수의 인수들을 모두 출력하는 프로그램을 작성하시오.
		8 => 2 4 , 12 => 2 3 4 6
		위의 문제를 0을 입력하기 전까지는 계속 수행(인수 출력)하도록 수정하시오.*/
		
		int num;
		int i;
		
		
		while(true) {
			System.out.print("정수를 입력하세요. : ");
			input = new Scanner(System.in);
			num = input.nextInt(); 
			if(num == 0) break; //0이 입력되면 while탈출
			
			for (i = 2; i < num; i++) { //1과 자기 자신 제외
				if(num%i == 0) System.out.print(i + " "); //나머지가 0이면 인수이므로 i 출력
			}
			System.out.println(); //줄바꿈

		}
		System.out.println("============== 프로그램 종료 ==============");
	}

}
