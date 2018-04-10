
public class TestPoint {

	public static void main(String[] args) {
		
		Point pnt1 = new Point(); //Point라는 class에 pnt라는 객체가 생성되면서 그 객체의 필드, 메소드 등의 공간도 생성
		pnt1.setX(1.0); //매개변수 x에 1.0이라는 값이 들어가고 this.x(필드 x)에 복사됨
		pnt1.setY(1.0);
		
		Point pnt2 = new Point();
		pnt2.setX(2.0);
		pnt2.setY(2.0);
		
	
		pnt1.Print(); //System.out.println("(" + pnt.getX() + " " + pnt.getY() + ")");
		pnt2.Print();
		
		System.out.println(pnt1.toString());
		System.out.println(pnt1); //toString()메소드를 찾아서 스트링으로 알아서 출력된다.
		System.out.println(pnt2.distance());
		System.out.println(pnt2.distance(pnt1));
		
		
		
	}

}
