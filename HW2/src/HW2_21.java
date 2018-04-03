import java.util.Scanner;

public class HW2_21 {
	
	private static Scanner input;

	public static void main(String[] args) {
		// 사용자로부터 한 숫자를 입력받아, 입력받은 숫자 이하의 소수들의 합을 구하는 프로그램을 작성하시오.
		
		System.out.print("정수를 입력하세요. : ");
		input = new Scanner(System.in);
		int num = input.nextInt();
		int i, j, cnt=0, sum=0;
		
		for(i = 1; i <= num; i++) {
			cnt = 0;
			for(j = 1; j <= i; j++) {
				if(i%j == 0) cnt++;
			}
			if (cnt == 2) sum += i;
		}
		System.out.println("소수들의 합은 " + sum + " 입니다.");
	
		System.out.println("============== 프로그램 종료 ==============");
	}
}
