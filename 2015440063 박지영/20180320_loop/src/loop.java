
public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10 ������ ȭ�鿡 ���
		int i; //���� ����
		
		i = 1; //���� ���� �ʱ�ȭ
		while(i<=10) { //���� ���ǽ�
			System.out.println(i); //������
			i++; //�������� ��ȭ
		}
	//	System.out.println("========== ���α׷� ���� ==============");
		
		for (i = 0;  i <+ 10; ++i) {  //while�� for������
			System.out.println(i);
		}
		
		int sum = 0;
		i = 1;
		while(i<=10) { //���� ���ǽ�
			sum += i; //������
			i++; //�������� ��ȭ
		}
		System.out.println("Sum = " + sum);
		
		//���忡�� l�� ���� ���ϱ�
		String str = "hello darkness my old friend"; 
		int count = 0;
		for (i= 0; i < str.length(); i++) {
			if(str.charAt(i) != 'l')
				continue;
			count++;
		}
		System.out.println("���忡�� �߰��� l�� ���� = " + count);
		System.out.println("========== ���α׷� ���� ==============");
	}

}
