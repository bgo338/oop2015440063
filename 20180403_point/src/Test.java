
public class Test {

	public static void main(String[] args) {
		
		Point p;
		p = new Point(); //포인트 객체 생성 및 레퍼런스 p에 저장
		
		//객체의 필드 접근
	//	p.x = 1.0;
	//	p.y = 1.0;
		
		double temp = 1.0;
		
		//접근자를 사용한 필드값 설정
		p.setX(temp); //공간 확보, 값 복사
		System.out.println(temp); //temp = 1.0  ('매개변수의 전달과 존재기간' 공부하기)
		p.setY(temp);
		
		System.out.println(p.getX()); 
		
		System.out.println(p.distance()); //p 객체의 distance() 출력

	}

}
