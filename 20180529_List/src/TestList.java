import java.util.*;

public class TestList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();  //upcasting ��� : ��ü�� Ÿ���� ArrayList, �������� Ÿ���� List
													  //List�� �ִ� �޼ҵ常 ȣ�Ⱑ���ϰ� ArrayList �޼ҵ��� ������ ������ ����.
													  //upcasting�̶� �θ�Ÿ���� ���������� �ڽ�Ÿ���� ��ü�� �����ϴ°�
													  //upcasting�� �������̽� ��� �� �������� ���� �ʿ��� ����̴�.
		//LinkedList<String> list = new ArrayList<String>();   �� �ᵵ��
		
		list.add(0, "zero"); //0��°�� zero����
		list.add("one");
		list.add("two");
		list.add(1,"��");
		
		System.out.println(list);
	}

}
