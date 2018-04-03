import java.util.Scanner;

public class HW1_5 {

	private static Scanner input;

	public static void main(String[] args) {
		/*메뉴를 출력하고, 사용자로부터 입력을 받아 선택된 메뉴를 출력하는 프로그램을 작성하시오.
		choose one of the following.
		apple
		orange
		banana
		peach

		enter your choice here : (사용자 입력)orange

		--------------
		Your choice is “orange”.*/
		String menu = null, choice;
		System.out.print("choose one of the following.\n" + 
							"apple\n" + 
							"orange\n" + 
							"banana\n" + 
							"peach");
		
		System.out.print("enter your choice here : ");
		input = new Scanner(System.in);
		choice = input.nextLine(); 
		
		if(choice.equals("apple")) menu = choice; //apple문자열과 비교
		else if(choice.equals("orange")) menu = choice; //orange문자열과 비교
		else if(choice.equals("banana")) menu = choice; //banana문자열과 비교
		else if(choice.equals("peach")) menu = choice; //peach문자열과 비교
		else System.out.println("메뉴를 잘못 입력했습니다."); //메뉴와 다른 문자를 입력 했을 때
		
		System.out.println("Your choice is " + menu); 
		
		System.out.println("========== 프로그램 종료 ==============");
	}

}
