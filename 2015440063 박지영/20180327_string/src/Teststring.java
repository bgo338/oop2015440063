
public class Teststring {

	public static void main(String[] args) {
		int a = 10;//  int���� ����(���� ����) a ���� + �� 10�� a�� ����
		// string ��ü ���� ���
		String str; // ��Ʈ���� �����ϴ� ���� ����(���۷��� ����) ����, String : Ŭ�� �̸�(�빮�ڷ� ����)
		str = new String("Hello darkness my old friend."); // ��ü����
		
		//String ��ü�� ���� 
		//�޼ҵ� ȣ�� ��� : ��������.�޼ҵ�();
		int len = str.length();
		System.out.println("string length is" + len);
		
		String str1; // ���۷��� ����
		str1 = str.toUpperCase(); //�빮�ڷ� ��ȯ
		System.out.println("str1: " + str1);
		
		

	}

}
