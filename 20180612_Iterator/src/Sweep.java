import java.util.*;

public class Sweep {

	public static void main(String[] args) {
		Set<String> strs = new HashSet<>(); //����(Set)�� ������ �ߺ��� ������� �ʴ´�
		//�⺻�� �޼ҵ� add(), remove(), sweep...
		
		/* TreeSet<>(); : ���ĺ� ������ ���ĵȴ�.
		 * LinkedHashSet<>(); : �Է¼����� ���ĵȴ�.
		 */
		
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		
		//ù��° �ȴ� ��� : iterator���
		Iterator<String> e = strs.iterator();  //string�� ������.
		while(e.hasNext()) { //������ �ȴ´�.
			String str = e.next(); //�ϳ��� ������.
			System.out.println(str);
		}  //������ Hash�Լ��� index�����
		
		//�ι�° �ȴ� ��� : for() �ݺ��� ���
		for (String str1:strs) { //for(���Ÿ�� ��������:�ݷ��Ǻ��� )
 			System.out.println(str1);
		}
		
		
	}

}
