import java.util.Scanner;

public class HW2_21 {
	
	private static Scanner input;

	public static void main(String[] args) {
		// ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���� ������ �Ҽ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		System.out.print("������ �Է��ϼ���. : ");
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
		System.out.println("�Ҽ����� ���� " + sum + " �Դϴ�.");
	
		System.out.println("============== ���α׷� ���� ==============");
	}
}
