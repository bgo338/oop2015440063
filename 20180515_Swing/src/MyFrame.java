import java.awt.FlowLayout;
import javax.swing.*;

//프레임 만드는 두번째 방법: JFrame으로부터 상속받은 클라스를 만든다.
public class MyFrame extends JFrame{
	MyFrame() {  //생성자
		setSize(900,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //괄호안에 있는것 : static variable
		setTitle("2nd frame");
	
		//새로운 컴포넌트를 프레임에 추가
		setLayout(new FlowLayout());
		
		JLabel label = new JLabel("네자리 정수를 입력하세요:");//레이블 객체 생성
		JTextField tf = new JTextField(20);//텍스트필드 객체 생성
		JButton button = new JButton("button");//버튼 객체 생성
		
		button.setText("지영");
		tf.setText("안녕하세요");
		
		//패널 생성
		JPanel panel = new JPanel();
		panel.add(label); //컴포넌트 추가
		panel.add(tf); //컴푸넌트 추가
		
		//프레임에 추가할 때 입력 순서에 따라 배치가 달라진다.
		//this.add(label);//레이블 객체를 프레임에 추가
		//this.add(tf);//텍스트필드 객체를 프레임에 추가
		//this.add(button);//버튼 객체를 프레임에 추가
		this.add(panel); //패널을 프레임에 추가
		
		//pack();//컴포넌트들을 꽉 채워서 프레임크기를 정함
		
		setVisible(true);
	}

}
