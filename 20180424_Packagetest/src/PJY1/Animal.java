package PJY1;

public class Animal {
	public String publicField; //Ÿ ��Ű������ �� �� ����
	private String privateField; //Ÿ ��Ű���� ���� ��Ű������ ��� ����, Ŭ�� �������� ��
	String packageField; //���� ��Ű�� �ȿ����� ����
	protected String protectedField; //Ÿ ��Ű������ ����(private), ���� ��Ű�� ���̰ų� ��ӵ� Ŭ��(Ÿ ��Ű�������� ����)���� �� �� ����(public)
	
	public Animal(){
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedField = "protected";
		
	}
}
