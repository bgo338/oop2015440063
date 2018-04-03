
public class Point {

	//public : 이 필드는 모든 클래스로부터 접근가능하다.
	
	public double x; //필드(클래스 안에서 선언되는 멤버 변수, 인스턴스 변수라고도 한다.) 필드의 scope(유효범위)은 클라스 내부이다.
	public double y;
	
	public void setX(double xx) {  //설정자, 필드의 값을 설정하는 메소드
		this.x = xx;
		xx = 100;
	}
	
	public void setY(double yy) {
		this.y = yy;
	}
	public double getX() { //접근자, 필드의 값을 반환하는 메소드
		return x;
	}
	public double getY() {
		return y;
	}
	
	public double distance() {
		
		double result; //지역변수
		
		//거리 계산
		result = Math.sqrt(x*x+y*y);
		
		//거리 반환
		return result;
		
	}

	public Point move(Point p) {  //매개변수 p의 유효범위는 메소드 내부
		
		//temp변수 선언 (지역변수)
		double a;
		double b;
		
		//포인트 p만큼 이동
		a = this.x + p.x; //필드x라는것을 강조 ->this.
		b = this.y + p.y;
		
		//새로운 포인트 생성
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		//새로운 포인트 반환
		return pnt;
		
	}
	
}
