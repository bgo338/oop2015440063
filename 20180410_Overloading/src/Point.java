
public class Point {
	//Fields
	private double x;
	private double y;
	
	//Methods
	
	
	public String toString() {
		return "(" + this.getX() + " " + this.getY() + ")";	
	}
	
	public double distance() {
		
		double result; //지역변수
		
		//거리 계산
		result = Math.sqrt(x*x + y*y);
		
		//거리 반환
		return result;
		
	}
	public double distance(Point p) {
		return Math.sqrt((this.x-p.getX())*(this.x-p.getX()) + (this.y-p.getY())*(this.y-p.getY()));
	}

	public void Print() {
		System.out.println("(" + this.getX() + " " + this.getY() + ")");
//		System.out.println("(" + this.x() + " " + this.y() + ")"); 이렇게 해도 되고 this를 빼도 된다.
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
