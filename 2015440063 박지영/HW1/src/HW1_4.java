import java.util.Scanner;

public class HW1_4 {

	private static Scanner input;

	public static void main(String[] args) {
		//점수(정수)를 입력 받아서 등급(A, B, C, D, E)을 출력하는 프로그램을 작성하시오. (A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)

		int score;
		
		System.out.print("성적을 입력하세요 : ");
		input = new Scanner(System.in);
		score = input.nextInt(); 
		
		if (score > 100) {
			System.out.println("성적을 잘못 입력했습니다.");
		}
		else if(score >= 80) { 
			System.out.println("성적은 A입니다.");
		}               
		else if(score >= 60){ 
			System.out.println("성적은 B입니다.");
		}
		else if(score >= 40){ 
			System.out.println("성적은 C입니다.");
		}
		else if(score >= 20){ 
			System.out.println("성적은 D입니다.");
		}
		else System.out.println("성적은 E입니다.");
		
		System.out.println("========== 프로그램 종료 ==============");
	}

}
