import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		//사전과 같은 자료 구조, 키(key)에 값(value)이 매핑된다. 
		//추가 : .put(key,value) //value찾기 : value = .get(key)
		
		map.put("재인", "청와대");
		map.put("트럼프", "백악관");
		map.put("정은", "평양");
		
		System.out.println(map.get("재인"));
		
		//방법1
		Set<String> set = map.keySet(); //key만 뽑아서 set만든다.
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) { 
			String key = itr.next(); 
			System.out.println(String.format("키 : %s, 값 : %s", key,map.get(key)) );
		}
		//방법2
		for (String key:map.keySet()) { 
 			System.out.println(String.format("키 : %s, 값 : %s", key,map.get(key)) );
		}
		//방법3
		for (Map.Entry<String, String> elem : map.entrySet()) { //시험안나옴
 			System.out.println(String.format("키 : %s, 값 : %s", elem.getKey(), elem.getValue()) );
		}

	}

}
