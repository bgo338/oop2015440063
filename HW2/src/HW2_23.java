
public class HW2_23 {

	public static void main(String[] args) {
		/* 
		 ***** *
		 *** ***
		 * *****

		�� ����Ͻÿ�(�ݺ��� �Ἥ!)*/
		
		int i, j;
		
		for (i = 0; i < 3 ; i++) {
			for (j = 0; j < 5 - i*2 ; j++) { //5,3,1 ������ �� ä���
				System.out.print("*");
			}
			System.out.print(" "); 
			for (j = 0; j < 1+i*2 ; j++) { //������ ���� ä��� 7-(5-i*2)-1
				System.out.print("*");  
			}
			System.out.println(" ");  //�ٹٲ�
		}
		
		System.out.println("============== ���α׷� ���� ==============");


	}

}
