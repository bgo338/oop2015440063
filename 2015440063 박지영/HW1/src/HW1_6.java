import java.util.Scanner;

public class HW1_6 {

	private static Scanner input;

	public static void main(String[] args) {
		/* � �� �ڸ� ���� �ڸ����� ������ ���� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
		����� �Է� : �� ���� �� �ڸ� ����
		��� : �ڸ����� ������ �ݴ�� �� ���� */
		int num;
		System.out.print("�� �ڸ� ������ �Է��Ͻÿ�. : ");
		input = new Scanner(System.in);
		num = input.nextInt(); 
		
		int a = num/10;
		int b = num%10;
		int newnum = b*10+a;
		System.out.println(newnum);
		
		System.out.println("========== ���α׷� ���� ==============");
		

	}

}
