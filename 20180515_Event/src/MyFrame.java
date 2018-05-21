import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

	JButton button, btn;
	JTextField tf;
	
	MyFrame() {  //생성자
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //괄호안에 있는것 : static variable
		setTitle("JY frame");
		
		
	
		//새로운 컴포넌트를 프레임에 추가
		setLayout(new FlowLayout()); //플로우 배치 매니저 사용
		
		button = new JButton("button1");//버튼 객체 생성
		this.add(button);//버튼 객체를 프레임에 추가
	//	MyListener listener = new MyListener();
		button.setActionCommand("button1");	
		button.addActionListener(this); //이벤트 리스너 객체 등록 (this : MyFrame, listener : MyListener)
		
	
		btn = new JButton("button2");
		this.add(btn);
		btn.setActionCommand("button2");
		btn.addActionListener(this);
	
		tf = new JTextField(20);
		this.add(tf);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { //MyListener클라스가 필요없어진다.
		//액션이벤트 객체에서 눌려진 버튼 객체를 (버튼객체의 래퍼런스값)가져온다.
	//	JButton button = (JButton)e.getSource(); 필드를 지정해줬기 때문에 필요없다.
		if((e.getActionCommand()).equals("button1")) {
			this.tf.setText("첫번째 버튼");
		}
		else 
			this.tf.setText("두번째 버튼");
		
	//	this.button.setText("버튼이 눌러졌어요~~");
	//	this.tf.setText("텍스트필드에 글자를 넣었어요");
		
	}
}
