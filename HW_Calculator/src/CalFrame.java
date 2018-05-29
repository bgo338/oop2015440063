import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalFrame extends JFrame implements ActionListener{

	JButton btn[] = new JButton[13]; //��ư �� 13�� 
	JTextField tf;
	String btn_val[] = {"1","2","3","4","5","6","7","8","9","+","0","C","="}; //��ư�� ������ �̸�
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
		p1.add(t); //textfield�� panel1�� �߰�
		
		for(int i=0; i<13; i++) { //13���� ��ư�� �̸��߰� 
			btn[i] = new JButton(btn_val[i]);
			p2.add(btn[i]); //��ư�� panel2�� �߰�
			btn[i].addActionListener(this); //actionlistener�� �߰�
		}
		p2.setLayout(new GridLayout(6,6,6,6));  //panel2 ���̾ƿ�
		
		this.add(p1, BorderLayout.NORTH); 
		this.add(p2, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("+")) {
			temp_num1 = Integer.parseInt(txt);  //string�� int�� ��ȯ, ù ��° ������ temp_num1�� ���� 
			txt += " + "; 
			temp = txt; //ù ��° ������ +��ȣ�� temp�� ����
			txt = ""; //txt�� �ʱ�ȭ
		}
		else if(e.getActionCommand().equals("=")) {
			temp_num2 = Integer.parseInt(txt);
			result = temp_num1 + temp_num2; //�� ���� ������ ���Ͽ� reseult�� ����
			txt += " = " + String.valueOf(result);  //result���� string���� ��ȯ�Ͽ� txt�� ����
			end_flag = 1; //���� �÷��� �ø�	
		}
		else if(e.getActionCommand().equals("C")) {
			init();	//�ʱ�ȭ		 
		}
		else if(e.getActionCommand().equals("0")){
			if(txt == "") txt = "";  //������ ���� �Է� �ȵ��� ���� �Է��� ���� �ʴ´�.				
			else txt += "0"; 
		}
		else {
			if(end_flag == 1) init();  //����� �����Ŀ� ���� �Է������� �ʱ�ȭ ���ش�.				
			txt += e.getActionCommand(); //���ڹ�ư�� ������ �� ���� �Է�
		}
		t.setText(temp + txt); //temp:"temp_num1 + " txt:"temp_num2
	}

	//////////�ʱ�ȭ �Լ�////////////
	public void init() {
		txt = "";
		temp_num1 = 0;
		temp_num2 = 0;
		temp = "";
		end_flag = 0;
	}
}