import java.util.Scanner;

public class HW2_9 {

	private static Scanner input;

	public static void main(String[] args) {
		//���� �������� 1���� 9���� �̿��� ���ڸ� ����ڰ� �߸� �Է��� ���� ������, �� ��쿡 �߸��� ���ڶ�� ���� �˷��ִ� ���� �޽����� ����ϰ� �ٽ� ���ڸ� �Է� �޵��� ó���Ͻÿ�.(�Է��� ��ȿ�� �˻�)
		
		int num = 0;
		int i;
		System.out.print("1~9������ ������ �Է��ϼ���. : ");
		input = new Scanner(System.in);
		num = input.nextInt(); 
		while(num < 1 || num>9) { //1���� �۰ų� 9���� ũ�� �����޼��� ���, �� �Է��� ������ �ݺ�
			System.out.print("1~9������ ������ �ƴմϴ�. �ٽ� �Է��ϼ���. : "); 
			input = new Scanner(System.in);
			num = input.nextInt(); 
		}
		System.out.println(num + "�� �Դϴ�."); //while Ż���ϸ� �� �Էµ� ������ ���� �Էµ� ���� ���
		for (i = 1; i < 10; i++) { //1���� 9���� �����ش�.
			System.out.println(
					num + " X " + i +" = " + num*i	//������ ����ϱ�					
				);
		}
		System.out.println("============== ���α׷� ���� ==============");

	}

}
