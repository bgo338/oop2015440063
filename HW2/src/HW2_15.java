
import java.util.Scanner;

public class HW2_15 {

	private static Scanner input;

	public static void main(String[] args) {
		/*1~100 ������ ���� �ϳ��� ���� ��(�������� �����ص� ��), 10�� �̳��� �� ���ڸ� ���ߴ� ������ �ۼ��Ͻÿ�.(10�� �̳��� �� ���߾��� ���� �ణ �Ӹ��� ������ ����̹Ƿ� Game Over ó���� �Ŷ��ϰ� �� �ֱ� �ٶ�)

		��) ���� 49�� ���:

		���ڸ� �Է��Ͻÿ�: 36
		�Է��Ͻ� ���ں��� Ů�ϴ�.
		
		���ڸ� �Է��Ͻÿ�: 51
		�Է��Ͻ� ���ں��� �۽��ϴ�.
		
		���ڸ� �Է��Ͻÿ�: 49
		�����Դϴ�!*/
		
		double random = Math.random();
		int ran_int = (int)(random*100) + 1;  //random�� ���� 0.0<=value<1.0�̹Ƿ� 100�� ���ϰ� int������ ��ȯ���ָ� 0~99������ ���ڷ� ���� �� �ִ�. �ű⿡ 1�� ���Ͽ� 1~100�� ���ڷ� �����.
		int i = 0;
		
		
		while(true) {
			System.out.print("������ �Է��Ͻÿ�. : ");
			input = new Scanner(System.in);
			int num = input.nextInt();
			if(num < ran_int) 
				System.out.println("�Է��Ͻ� ���ں��� Ů�ϴ�."); 
			else if(num > ran_int) 
				System.out.println("�Է��Ͻ� ���ں��� �۽��ϴ�.");
			else {
				System.out.println("�����Դϴ�!");
				break; //�����̸� Ż��
			}
			
			i++; //�Է��� Ƚ ���� �����ش�.
			if(i == 10) { //10�� �����߸� Ż��
				System.out.println("Game Over");
				break;
			}
		}
		
		System.out.println("============== ���α׷� ���� ==============");

	}

}
