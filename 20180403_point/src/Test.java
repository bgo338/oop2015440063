
public class Test {

	public static void main(String[] args) {
		
		Point p;
		p = new Point(); //����Ʈ ��ü ���� �� ���۷��� p�� ����
		
		//��ü�� �ʵ� ����
	//	p.x = 1.0;
	//	p.y = 1.0;
		
		double temp = 1.0;
		
		//�����ڸ� ����� �ʵ尪 ����
		p.setX(temp); //���� Ȯ��, �� ����
		System.out.println(temp); //temp = 1.0  ('�Ű������� ���ް� ����Ⱓ' �����ϱ�)
		p.setY(temp);
		
		System.out.println(p.getX()); 
		
		System.out.println(p.distance()); //p ��ü�� distance() ���

	}

}
