import java.util.Scanner;

public class One {

	private static Scanner input;

	public static void main(String[] args) {
		// �� ��(����)�� �Է� �޾�, �� �� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		int a, b;
		
		input = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��Ͻÿ� : ");
		a = input.nextInt();
		System.out.print("�ι�° ������ �Է��Ͻÿ� : ");
		b = input.nextInt();
		
		if (a>b)
			System.out.println("�� ū����"+ a +"�Դϴ�.");
		else 
			System.out.println("�� ū����"+ b +"�Դϴ�.");
	
		System.out.println("========== ���α׷� ���� ==============");
	}
}
