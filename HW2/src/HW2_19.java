import java.util.Scanner;

public class HW2_19 {

	private static Scanner input;

	public static void main(String[] args) {
		// ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���ڰ� �Ҽ����� �ƴ����� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		System.out.print("������ �Է��ϼ���. : ");
		input = new Scanner(System.in);
		int num = input.nextInt();
		int i, cnt=0;
		
		for(i = 1; i <= num; i++) {
			if(num%i == 0) cnt++;
			
		}
		if(cnt == 2) 
			System.out.print("�Ҽ��Դϴ�.");
		else
			System.out.print("�Ҽ��� �ƴմϴ�.");
		
		System.out.println("============== ���α׷� ���� ==============");

	}

}
