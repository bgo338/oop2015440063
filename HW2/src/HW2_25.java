
public class HW2_25 {

	public static void main(String[] args) {
		/*다음과 같은 출력이 나오도록 프로그램을 작성하시오.
		*********** 54321012345
		********* 432101234
		******* 3210123
		***** 21012
		*** 101
		* 0
		*** 101 
		***** 21012 
		******* 3210123 
		********* 432101234 
		*********** 54321012345 */
		
		int i, j;
		
		for (i = 0; i < 6 ; i++) {
			for (j = 0; j < 11 - i*2 ; j++) { //6줄을 11부터 2씩 감소하는 별 채우기
				System.out.print("*");
			}
			System.out.print(" "); 
			for (j = 5 - i; j >= 0 ; j--) { //5에서 시작해서 한 줄씩 내려갈 때마다 하나씩 감소한 수부터 시작하고 0까지의 수를 나열한다.
				System.out.print(j);  
			}
			for (j = 1; j <= 5 - i ; j++) { //1부터 5-i까지 다시 출력
				System.out.print(j);  
			}
			
			System.out.println(" ");  //줄바꿈
		}
		for (i = 0; i < 5 ; i++) {
			for (j =  0; j < 3 + i*2 ; j++) { //5줄을 3부터 2씩 증가하는 별 채우기
				System.out.print("*");
			}
			System.out.print(" "); 
			for (j = i + 1; j >= 0 ; j--) { //1에서 시작해서 한 줄씩 내려갈 때마다 하나씩 증가한 수부터 시작하고 0까지의 수를 나열한다.
				System.out.print(j);  //
			}
			for (j = 1; j <= i + 1; j++) { //1부터 i+1까지 다시 출력
				System.out.print(j);  
			}
			System.out.println(" "); //줄바꿈
		}
		
		System.out.println("============== 프로그램 종료 ==============");

	}

}
