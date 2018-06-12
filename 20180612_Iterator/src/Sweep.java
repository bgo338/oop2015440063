import java.util.*;

public class Sweep {

	public static void main(String[] args) {
		Set<String> strs = new HashSet<>(); //집합(Set)은 원소의 중복을 허용하지 않는다
		//기본적 메소드 add(), remove(), sweep...
		
		/* TreeSet<>(); : 알파벳 순으로 정렬된다.
		 * LinkedHashSet<>(); : 입력순으로 정렬된다.
		 */
		
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		
		//첫번째 훑는 방법 : iterator사용
		Iterator<String> e = strs.iterator();  //string을 빼낸다.
		while(e.hasNext()) { //끝까지 훑는다.
			String str = e.next(); //하나씩 빼낸다.
			System.out.println(str);
		}  //순서는 Hash함수의 index순대로
		
		//두번째 훑는 방법 : for() 반복문 사용
		for (String str1:strs) { //for(요소타입 참조변수:콜렉션변수 )
 			System.out.println(str1);
		}
		
		
	}

}
