import java.util.Scanner;

public class Three {

	private static Scanner input;

	public static void main(String[] args) {
		// �� ��(������)�� �Է� �޾� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	int a, b, c;
		
		input = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��Ͻÿ� : ");
		a = input.nextInt();
		System.out.print("�ι�° ������ �Է��Ͻÿ� : ");
		b = input.nextInt();
		System.out.print("����° ������ �Է��Ͻÿ� : ");
		c = input.nextInt();
		
		if(a>=b) {
			if(a>=c) System.out.println("���� ū����"+ a +"�Դϴ�.");
			else System.out.println("���� ū����"+ c +"�Դϴ�.");
		}
		else {
			if(b>=c) System.out.println("���� ū����"+ b +"�Դϴ�.");
			else System.out.println("���� ū����"+ c +"�Դϴ�.");
		}
		System.out.println("========== ���α׷� ���� ==============");

	}

}
