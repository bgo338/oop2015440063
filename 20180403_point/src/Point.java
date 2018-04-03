
public class Point {

	//public : �� �ʵ�� ��� Ŭ�����κ��� ���ٰ����ϴ�.
	
	public double x; //�ʵ�(Ŭ���� �ȿ��� ����Ǵ� ��� ����, �ν��Ͻ� ������� �Ѵ�.) �ʵ��� scope(��ȿ����)�� Ŭ�� �����̴�.
	public double y;
	
	public void setX(double xx) {  //������, �ʵ��� ���� �����ϴ� �޼ҵ�
		this.x = xx;
		xx = 100;
	}
	
	public void setY(double yy) {
		this.y = yy;
	}
	public double getX() { //������, �ʵ��� ���� ��ȯ�ϴ� �޼ҵ�
		return x;
	}
	public double getY() {
		return y;
	}
	
	public double distance() {
		
		double result; //��������
		
		//�Ÿ� ���
		result = Math.sqrt(x*x+y*y);
		
		//�Ÿ� ��ȯ
		return result;
		
	}

	public Point move(Point p) {  //�Ű����� p�� ��ȿ������ �޼ҵ� ����
		
		//temp���� ���� (��������)
		double a;
		double b;
		
		//����Ʈ p��ŭ �̵�
		a = this.x + p.x; //�ʵ�x��°��� ���� ->this.
		b = this.y + p.y;
		
		//���ο� ����Ʈ ����
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		//���ο� ����Ʈ ��ȯ
		return pnt;
		
	}
	
}
