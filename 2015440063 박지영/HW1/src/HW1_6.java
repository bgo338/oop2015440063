import java.util.Scanner;

public class HW1_6 {

	private static Scanner input;

	public static void main(String[] args) {
		/* 어떤 두 자리 수의 자릿수의 순서를 서로 바꾸는 프로그램을 작성하시오.
		사용자 입력 : 한 개의 두 자리 정수
		출력 : 자릿수의 순서가 반대로 된 정수 */
		int num;
		System.out.print("두 자리 정수를 입력하시오. : ");
		input = new Scanner(System.in);
		num = input.nextInt(); 
		
		int a = num/10;
		int b = num%10;
		int newnum = b*10+a;
		System.out.println(newnum);
		
		System.out.println("========== 프로그램 종료 ==============");
		

	}

}
