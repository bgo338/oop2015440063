import java.util.Scanner;

public class HW2_7 {

	private static Scanner input;

	public static void main(String[] args) {
		//0�� �Էµ� ������ ��� ������ �Է� �ް�, �Էµ� ��� ���ڵ��� ������ ����Ͻÿ�
		
		int num ;
		int sum = 0;
		System.out.print("������ �Է��ϼ���. : ");
		input = new Scanner(System.in);
		num = input.nextInt(); 
		while(num >0){ //0�� �ɶ����� ��� �ݺ�
			sum += num; //���� ����ؼ� �����ش�.
			System.out.print("������ �Է��ϼ���. : ");
			input = new Scanner(System.in);
			num = input.nextInt(); 
			
			if(num == 0) break;
		}
		
		System.out.println("���� = " + sum);
		
		System.out.println("============== ���α׷� ���� ==============");

	}

}
