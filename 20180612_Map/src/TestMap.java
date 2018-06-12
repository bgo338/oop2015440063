import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		//������ ���� �ڷ� ����, Ű(key)�� ��(value)�� ���εȴ�. 
		//�߰� : .put(key,value) //valueã�� : value = .get(key)
		
		map.put("����", "û�ʹ�");
		map.put("Ʈ����", "��ǰ�");
		map.put("����", "���");
		
		System.out.println(map.get("����"));
		
		//���1
		Set<String> set = map.keySet(); //key�� �̾Ƽ� set�����.
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) { 
			String key = itr.next(); 
			System.out.println(String.format("Ű : %s, �� : %s", key,map.get(key)) );
		}
		//���2
		for (String key:map.keySet()) { 
 			System.out.println(String.format("Ű : %s, �� : %s", key,map.get(key)) );
		}
		//���3
		for (Map.Entry<String, String> elem : map.entrySet()) { //����ȳ���
 			System.out.println(String.format("Ű : %s, �� : %s", elem.getKey(), elem.getValue()) );
		}

	}

}
