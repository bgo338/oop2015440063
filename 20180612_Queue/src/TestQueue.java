import java.util.*;

public class TestQueue {

	public static void main(String[] args) {
		Queue<String> strs = new LinkedList<>(); 
		//Queue<String> strs = new PriorityQueue<>();  //���ĺ� ������ ����� 
		
		
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		
		while(!strs.isEmpty()) { //strs�� ���Ұ� ������� Ȯ��
			String str2;
			str2 = strs.remove(); //remove ȣ���� ������ ���� ���� ���Ұ� ����ȴ�.(�� ���� ����)
			System.out.println(str2); 
		}
	}

}
