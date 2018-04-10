
public class Point {
	//Fields
	private double x;
	private double y;
	
	//Methods
	
	
	public String toString() {
		return "(" + this.getX() + " " + this.getY() + ")";	
	}
	
	public double distance() {
		
		double result; //��������
		
		//�Ÿ� ���
		result = Math.sqrt(x*x + y*y);
		
		//�Ÿ� ��ȯ
		return result;
		
	}
	public double distance(Point p) {
		return Math.sqrt((this.x-p.getX())*(this.x-p.getX()) + (this.y-p.getY())*(this.y-p.getY()));
	}

	public void Print() {
		System.out.println("(" + this.getX() + " " + this.getY() + ")");
//		System.out.println("(" + this.x() + " " + this.y() + ")"); �̷��� �ص� �ǰ� this�� ���� �ȴ�.
	}
	
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
}
