import java.util.Scanner;

public class Two {

	private static Scanner input;

	public static void main(String[] args) {
		// �ϳ��� ������ �Է� �޾� �� ���� ¦��(even number)���� Ȧ��(odd number)������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
		int a, b;
		input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		a = input.nextInt();
		b = a % 2;
		if(b == 0) System.out.print("¦���Դϴ�.");
		else System.out.print("Ȧ���Դϴ�.");
		System.out.println("========== ���α׷� ���� ==============");

	}

}
