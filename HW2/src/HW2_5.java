
public class HW2_5 {

	public static void main(String[] args) {
		//1부터 100사이의 숫자(정수) 중에서 3의 공배수(3,6,9,12,..)들의 총합을 출력하는 프로그램을 작성하시오.(do-while문 사용)
		int i = 3;
		int sum = 0;
		
		do {
			sum += i;
			i += 3;
		}
		while(i < 100);
		
		System.out.println("총합 = " + sum);
		
		System.out.println("============== 프로그램 종료 ==============");


	}

}
