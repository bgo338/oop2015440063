
public class TestPoint {

	public static void main(String[] args) {
		
		Point pnt1 = new Point(); //Point��� class�� pnt��� ��ü�� �����Ǹ鼭 �� ��ü�� �ʵ�, �޼ҵ� ���� ������ ����
		pnt1.setX(1.0); //�Ű����� x�� 1.0�̶�� ���� ���� this.x(�ʵ� x)�� �����
		pnt1.setY(1.0);
		
		Point pnt2 = new Point();
		pnt2.setX(2.0);
		pnt2.setY(2.0);
		
	
		pnt1.Print(); //System.out.println("(" + pnt.getX() + " " + pnt.getY() + ")");
		pnt2.Print();
		
		System.out.println(pnt1.toString());
		System.out.println(pnt1); //toString()�޼ҵ带 ã�Ƽ� ��Ʈ������ �˾Ƽ� ��µȴ�.
		System.out.println(pnt2.distance());
		System.out.println(pnt2.distance(pnt1));
		
		
		
	}

}
