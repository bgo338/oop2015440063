import java.util.Scanner;

public class HW1_5 {

	private static Scanner input;

	public static void main(String[] args) {
		/*�޴��� ����ϰ�, ����ڷκ��� �Է��� �޾� ���õ� �޴��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		choose one of the following.
		apple
		orange
		banana
		peach

		enter your choice here : (����� �Է�)orange

		--------------
		Your choice is ��orange��.*/
		String menu = null, choice;
		System.out.print("choose one of the following.\n" + 
							"apple\n" + 
							"orange\n" + 
							"banana\n" + 
							"peach");
		
		System.out.print("enter your choice here : ");
		input = new Scanner(System.in);
		choice = input.nextLine(); 
		
		if(choice.equals("apple")) menu = choice; //apple���ڿ��� ��
		else if(choice.equals("orange")) menu = choice; //orange���ڿ��� ��
		else if(choice.equals("banana")) menu = choice; //banana���ڿ��� ��
		else if(choice.equals("peach")) menu = choice; //peach���ڿ��� ��
		else System.out.println("�޴��� �߸� �Է��߽��ϴ�."); //�޴��� �ٸ� ���ڸ� �Է� ���� ��
		
		System.out.println("Your choice is " + menu); 
		
		System.out.println("========== ���α׷� ���� ==============");
	}

}
