import java.util.Scanner;

public class HW2_13 {

	private static Scanner input;

	public static void main(String[] args) {
		//month�� day�� �Է� �޾�, 1�� 1�Ϻ����� �� day���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (switch�� ���) //1�� 20���� 20�� ���, 2�� 5���� 36�� ���. �� 2���� 28�Ϸ� ���.
		
		int month, day, total_day = 0;
		System.out.print("Month�� �Է��ϼ���. : ");
		input = new Scanner(System.in);
		month = input.nextInt();
		
		System.out.print("Day�� �Է��ϼ���. : ");
		input = new Scanner(System.in);
		day = input.nextInt();
		
		int jan=31, feb=jan+28, mar=feb+31, apr=mar+30, may=apr+31, jun=may+30, jul=jun+31, aug=jul+31, sep=aug+30, oct=sep+31, nov=oct+30; //������ �� �ϼ��� �̹��� �ϼ��� ����.
		switch(month) { //���ޱ����� �� �ϼ��� day�� ����.
			case 1 : 
				total_day = day;
				break;
			case 2 : 
				total_day = day + jan;
				break;
			case 3 : 
				total_day = day + feb;
				break;
			case 4 : 
				total_day = day + mar;
				break;
			case 5 : 
				total_day = day + apr;
				break;
			case 6 : 
				total_day = day + may;
				break;
			case 7 : 
				total_day = day + jun;
				break;
			case 8 : 
				total_day = day + jul;
				break;
			case 9 : 
				total_day = day + aug;
				break;
			case 10 : 
				total_day = day + sep;
				break;
			case 11 : 
				total_day = day + oct;
				break;
			case 12 : 
				total_day = day + nov;
				break;
			default : System.out.println("�߸� �Է��߽��ϴ�.");
		
		}
		
		System.out.println("�� Day���� " + total_day + " �� �Դϴ�."); //�� day ���
		System.out.println("============== ���α׷� ���� ==============");
		
	
	}
	
	
}


/*// for��(while)�� ���� �ݺ��� break ���� �̿��Ͽ� 0�� �Էµ� ������ �Է� ���� ���� �� ���� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

int num, num_pre = 0;
int output = 0;
while(true) {
	System.out.print("������ �Է��ϼ���. : ");
	input = new Scanner(System.in);
	num = input.nextInt();
	
	if(num == 0) break; //0�� �Ǹ� Ż��
	if(num >= num_pre) output = num; //���� ������ ũ�� output�� ����
	num_pre = num; //���� ������ �������ش�.
}
System.out.println("���� ū ������ "+output+" �Դϴ�."); //���� ū ���� ���
System.out.println("========== ���α׷� ���� ==============");*/