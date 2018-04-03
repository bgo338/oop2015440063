import java.util.Scanner;

public class HW2_13 {

	private static Scanner input;

	public static void main(String[] args) {
		//month와 day를 입력 받아, 1월 1일부터의 총 day수를 출력하는 프로그램을 작성하시오. (switch문 사용) //1월 20일은 20일 출력, 2월 5일은 36일 출력. 단 2월은 28일로 계산.
		
		int month, day, total_day = 0;
		System.out.print("Month를 입력하세요. : ");
		input = new Scanner(System.in);
		month = input.nextInt();
		
		System.out.print("Day를 입력하세요. : ");
		input = new Scanner(System.in);
		day = input.nextInt();
		
		int jan=31, feb=jan+28, mar=feb+31, apr=mar+30, may=apr+31, jun=may+30, jul=jun+31, aug=jul+31, sep=aug+30, oct=sep+31, nov=oct+30; //전달의 총 일수에 이번달 일수을 더함.
		switch(month) { //전달까지의 총 일수에 day를 더함.
			case 1 : 
				total_day = day;
				break;
			case 2 : 
				total_day = day + jan;
				break;
			case 3 : 
				total_day = day + feb;
				break;
			case 4 : 
				total_day = day + mar;
				break;
			case 5 : 
				total_day = day + apr;
				break;
			case 6 : 
				total_day = day + may;
				break;
			case 7 : 
				total_day = day + jun;
				break;
			case 8 : 
				total_day = day + jul;
				break;
			case 9 : 
				total_day = day + aug;
				break;
			case 10 : 
				total_day = day + sep;
				break;
			case 11 : 
				total_day = day + oct;
				break;
			case 12 : 
				total_day = day + nov;
				break;
			default : System.out.println("잘못 입력했습니다.");
		
		}
		
		System.out.println("총 Day수는 " + total_day + " 일 입니다."); //총 day 출력
		System.out.println("============== 프로그램 종료 ==============");
		
	
	}
	
	
}


/*// for문(while)의 무한 반복과 break 문을 이용하여 0이 입력될 때까지 입력 받은 정수 중 가장 큰 정수를 출력하는 프로그램을 작성하시오.

int num, num_pre = 0;
int output = 0;
while(true) {
	System.out.print("정수를 입력하세요. : ");
	input = new Scanner(System.in);
	num = input.nextInt();
	
	if(num == 0) break; //0이 되면 탈출
	if(num >= num_pre) output = num; //이전 값보다 크면 output에 저장
	num_pre = num; //이전 값으로 설정해준다.
}
System.out.println("가장 큰 정수는 "+output+" 입니다."); //가장 큰 정수 출력
System.out.println("========== 프로그램 종료 ==============");*/