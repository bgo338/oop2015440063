import java.util.Scanner;


public class conditionalstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		
		System.out.print("������ �Է��ϼ��� : ");
		Scanner input = new Scanner(System.in);
		score = input.nextInt(); // Ű���忡�� ���� �Է�
		
		System.out.println("������ " + score + " �� �Դϴ�." );
		
		//������ 60�� �̻��̸� "�հ��Դϴ�.", 60�� �̸��̸� "���հ��Դϴ�"�� ���
		//�� >= : ���迬����
		//if(���ǽ�){���� ��� ����} else{������ ��� ����}
		if(score >= 60) { 
			System.out.println("�հ��Դϴ�.");
		//	good++;
		} //���չ�(compound Statement) : ���� ������ �߰�ȣ{}�� ���� �ϳ��� �������� ó��
		else { 
			System.out.println("���հ��Դϴ�.");
		//	bad++;
		}
		
		if(score >= 80) { 
			System.out.println("������ A�Դϴ�.");
			
		}               
		else if(score >= 60){ 
			System.out.println("������ B�Դϴ�.");
			
		}
		else System.out.println("������ F�Դϴ�.");
		
		//0 ->"����" , 1 -> "�ϳ�" , 3 -> "��" , 0/1/2 �� �ƴϸ� "����"�� ���
		switch (score) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("�ϳ�");
			break;
		case 2:
			System.out.println("��");
			break;

		default:
			System.out.println("����");			
			break;
		}
		System.out.println("========== ���α׷� ���� ==============");

	}

}
