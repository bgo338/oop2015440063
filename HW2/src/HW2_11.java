import java.util.Scanner;

public class HW2_11 {

	private static Scanner input;

	public static void main(String[] args) {
		/* �Ҽ�(prime-number) �˻�� ����ϰ� ����ڰ� �Է��� ���� �μ����� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		8 => 2 4 , 12 => 2 3 4 6
		���� ������ 0�� �Է��ϱ� �������� ��� ����(�μ� ���)�ϵ��� �����Ͻÿ�.*/
		
		int num;
		int i;
		
		
		while(true) {
			System.out.print("������ �Է��ϼ���. : ");
			input = new Scanner(System.in);
			num = input.nextInt(); 
			if(num == 0) break; //0�� �ԷµǸ� whileŻ��
			
			for (i = 2; i < num; i++) { //1�� �ڱ� �ڽ� ����
				if(num%i == 0) System.out.print(i + " "); //�������� 0�̸� �μ��̹Ƿ� i ���
			}
			System.out.println(); //�ٹٲ�

		}
		System.out.println("============== ���α׷� ���� ==============");
	}

}
