import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalFrame extends JFrame implements ActionListener{

	JButton btn[] = new JButton[13]; //버튼 총 13개 
	JTextField tf;
	String btn_val[] = {"1","2","3","4","5","6","7","8","9","+","0","C","="}; //버튼에 쓰여질 이름
	JPanel p1= new JPanel(),p2 = new JPanel(); 
	JTextField t = new JTextField(30);
	
	int result = 0;
	int end_flag = 0;
	int temp_num1 = 0, temp_num2 = 0;
	String txt = "";
	String temp = "";	
	
	CalFrame(){
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JY Calculator");
		p1.add(t); //textfield를 panel1에 추가
		
		for(int i=0; i<13; i++) { //13개의 버튼에 이름추가 
			btn[i] = new JButton(btn_val[i]);
			p2.add(btn[i]); //버튼을 panel2에 추가
			btn[i].addActionListener(this); //actionlistener에 추가
		}
		p2.setLayout(new GridLayout(6,6,6,6));  //panel2 레이아웃
		
		this.add(p1, BorderLayout.NORTH); 
		this.add(p2, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("+")) {
			temp_num1 = Integer.parseInt(txt);  //string을 int로 변환, 첫 번째 정수를 temp_num1에 저장 
			txt += " + "; 
			temp = txt; //첫 번째 정수와 +기호를 temp에 저장
			txt = ""; //txt를 초기화
		}
		else if(e.getActionCommand().equals("=")) {
			temp_num2 = Integer.parseInt(txt);
			result = temp_num1 + temp_num2; //두 개의 정수를 더하여 reseult에 저장
			txt += " = " + String.valueOf(result);  //result값을 string으로 변환하여 txt에 저장
			end_flag = 1; //종료 플래그 올림	
		}
		else if(e.getActionCommand().equals("C")) {
			init();	//초기화		 
		}
		else if(e.getActionCommand().equals("0")){
			if(txt == "") txt = "";  //정수가 아직 입력 안됐을 때는 입력을 하지 않는다.				
			else txt += "0"; 
		}
		else {
			if(end_flag == 1) init();  //계산이 끝난후에 값을 입력했을때 초기화 해준다.				
			txt += e.getActionCommand(); //숫자버튼을 누르면 그 숫자 입력
		}
		t.setText(temp + txt); //temp:"temp_num1 + " txt:"temp_num2
	}

	//////////초기화 함수////////////
	public void init() {
		txt = "";
		temp_num1 = 0;
		temp_num2 = 0;
		temp = "";
		end_flag = 0;
	}
}