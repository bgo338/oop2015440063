import java.util.Scanner;

public class HW2_9 {

	private static Scanner input;

	public static void main(String[] args) {
		//위의 문제에서 1부터 9사이 이외의 숫자를 사용자가 잘못 입력할 수도 있으니, 이 경우에 잘못된 숫자라는 것을 알려주는 에러 메시지를 출력하고 다시 숫자를 입력 받도록 처리하시오.(입력의 유효성 검사)
		
		int num = 0;
		int i;
		System.out.print("1~9사이의 정수를 입력하세요. : ");
		input = new Scanner(System.in);
		num = input.nextInt(); 
		while(num < 1 || num>9) { //1보다 작거나 9보다 크면 에러메세지 출력, 잘 입력할 때까지 반봅
			System.out.print("1~9사이의 정수가 아닙니다. 다시 입력하세요. : "); 
			input = new Scanner(System.in);
			num = input.nextInt(); 
		}
		System.out.println(num + "단 입니다."); //while 탈출하면 잘 입력된 것으로 보고 입력된 숫자 출력
		for (i = 1; i < 10; i++) { //1부터 9까지 곱해준다.
			System.out.println(
					num + " X " + i +" = " + num*i	//구구단 출력하기					
				);
		}
		System.out.println("============== 프로그램 종료 ==============");

	}

}
