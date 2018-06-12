import java.util.*;

public class TestList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();  //upcasting 사용 : 객체의 타입은 ArrayList, 참조변수 타입은 List
													  //List에 있는 메소드만 호출가능하고 ArrayList 메소드의 내용을 가져다 쓴다.
													  //upcasting이란 부모타입의 참조변수로 자식타입의 객체를 참조하는것
													  //upcasting은 인터페이스 사용 및 다형성을 위해 필요한 기능이다.
		//LinkedList<String> list = new ArrayList<String>();   를 써도됨
		
		list.add(0, "zero"); //0번째에 zero넣음
		list.add("one");
		list.add("two");
		list.add(1,"돌");
		
		System.out.println(list);
	}

}
