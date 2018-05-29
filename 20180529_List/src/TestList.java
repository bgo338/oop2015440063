import java.util.*;

public class TestList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//LinkedList<String> list = new ArrayList<String>();   를 써도됨

		list.add(0, "zero"); //0번째에 zero넣음
		list.add("one");
		list.add("two");
		list.add(1,"돌");
		
		System.out.println(list);
	}

}
