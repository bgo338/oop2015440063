
public class HW2_3 {

	public static void main(String[] args) {
		// 1���� 100������ ����(����) �߿��� 3�� �����(3,6,9,12,..)���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(while�� ���)
		
		int i = 3; //3���� ����
		int sum = 0;
		
		while(i < 100) {
			sum += i;
			i += 3; //3�� ����θ� ������ش�.
		}
		
		System.out.println("���� = " + sum);
		
		System.out.println("============== ���α׷� ���� ==============");

	}

}
