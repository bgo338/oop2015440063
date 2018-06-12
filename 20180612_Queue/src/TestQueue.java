import java.util.*;

public class TestQueue {

	public static void main(String[] args) {
		Queue<String> strs = new LinkedList<>(); 
		//Queue<String> strs = new PriorityQueue<>();  //알파벳 순으로 저장됨 
		
		
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		
		while(!strs.isEmpty()) { //strs의 원소가 비었는지 확인
			String str2;
			str2 = strs.remove(); //remove 호출할 때마다 가장 작은 원소가 추출된다.(맨 앞의 원소)
			System.out.println(str2); 
		}
	}

}
