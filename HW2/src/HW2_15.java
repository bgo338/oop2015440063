
import java.util.Scanner;

public class HW2_15 {

	private static Scanner input;

	public static void main(String[] args) {
		/*1~100 사이의 숫자 하나를 정한 뒤(랜덤으로 생성해도 됨), 10번 이내로 그 숫자를 맞추는 게임을 작성하시오.(10번 이내로 못 맞추었을 경우는 약간 머리가 딸리는 사람이므로 Game Over 처리를 신랄하게 해 주기 바람)

		예) 답이 49일 경우:

		숫자를 입력하시오: 36
		입력하신 숫자보다 큽니다.
		
		숫자를 입력하시오: 51
		입력하신 숫자보다 작습니다.
		
		숫자를 입력하시오: 49
		정답입니다!*/
		
		double random = Math.random();
		int ran_int = (int)(random*100) + 1;  //random의 값은 0.0<=value<1.0이므로 100을 곱하고 int형으로 변환해주면 0~99까지의 숫자로 만들 수 있다. 거기에 1을 더하여 1~100의 숫자로 만든다.
		int i = 0;
		
		
		while(true) {
			System.out.print("숫자을 입력하시오. : ");
			input = new Scanner(System.in);
			int num = input.nextInt();
			if(num < ran_int) 
				System.out.println("입력하신 숫자보다 큽니다."); 
			else if(num > ran_int) 
				System.out.println("입력하신 숫자보다 작습니다.");
			else {
				System.out.println("정답입니다!");
				break; //정답이면 탈출
			}
			
			i++; //입력한 횟 수를 세어준다.
			if(i == 10) { //10번 못맞추면 탈출
				System.out.println("Game Over");
				break;
			}
		}
		
		System.out.println("============== 프로그램 종료 ==============");

	}

}
