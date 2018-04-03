import java.util.Scanner;

public class HW2_19 {

	private static Scanner input;

	public static void main(String[] args) {
		// 사용자로부터 한 숫자를 입력받아, 입력받은 숫자가 소수인지 아닌지를 검사하는 프로그램을 작성하시오.
		
		System.out.print("정수를 입력하세요. : ");
		input = new Scanner(System.in);
		int num = input.nextInt();
		int i, cnt=0;
		
		for(i = 1; i <= num; i++) {
			if(num%i == 0) cnt++;
			
		}
		if(cnt == 2) 
			System.out.print("소수입니다.");
		else
			System.out.print("소수가 아닙니다.");
		
		System.out.println("============== 프로그램 종료 ==============");

	}

}
