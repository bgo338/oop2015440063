import java.util.Scanner;

public class HW1_4 {

	private static Scanner input;

	public static void main(String[] args) {
		//����(����)�� �Է� �޾Ƽ� ���(A, B, C, D, E)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)

		int score;
		
		System.out.print("������ �Է��ϼ��� : ");
		input = new Scanner(System.in);
		score = input.nextInt(); 
		
		if (score > 100) {
			System.out.println("������ �߸� �Է��߽��ϴ�.");
		}
		else if(score >= 80) { 
			System.out.println("������ A�Դϴ�.");
		}               
		else if(score >= 60){ 
			System.out.println("������ B�Դϴ�.");
		}
		else if(score >= 40){ 
			System.out.println("������ C�Դϴ�.");
		}
		else if(score >= 20){ 
			System.out.println("������ D�Դϴ�.");
		}
		else System.out.println("������ E�Դϴ�.");
		
		System.out.println("========== ���α׷� ���� ==============");
	}

}
