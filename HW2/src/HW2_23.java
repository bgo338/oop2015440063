
public class HW2_23 {

	public static void main(String[] args) {
		/* 
		 ***** *
		 *** ***
		 * *****

		를 출력하시오(반복문 써서!)*/
		
		int i, j;
		
		for (i = 0; i < 3 ; i++) {
			for (j = 0; j < 5 - i*2 ; j++) { //5,3,1 순으로 별 채우기
				System.out.print("*");
			}
			System.out.print(" "); 
			for (j = 0; j < 1+i*2 ; j++) { //나머지 별로 채우기 7-(5-i*2)-1
				System.out.print("*");  
			}
			System.out.println(" ");  //줄바꿈
		}
		
		System.out.println("============== 프로그램 종료 ==============");


	}

}
