import java.util.Scanner;

public class HW2_7 {

	private static Scanner input;

	public static void main(String[] args) {
		//0이 입력될 때까지 계속 정수를 입력 받고, 입력된 모든 숫자들의 총합을 출력하시오
		
		int num ;
		int sum = 0;
		System.out.print("정수를 입력하세요. : ");
		input = new Scanner(System.in);
		num = input.nextInt(); 
		while(num >0){ //0이 될때까지 계속 반복
			sum += num; //수를 계속해서 더해준다.
			System.out.print("정수를 입력하세요. : ");
			input = new Scanner(System.in);
			num = input.nextInt(); 
			
			if(num == 0) break;
		}
		
		System.out.println("총합 = " + sum);
		
		System.out.println("============== 프로그램 종료 ==============");

	}

}
