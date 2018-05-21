import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalFrame extends JFrame implements ActionListener{

	JButton btn[] = new JButton[13];
	JTextField tf;
	String btn_val[] = {"1","2","3","4","5","6","7","8","9","+","0","C","="};
	JPanel p1= new JPanel(),p2 = new JPanel();
	JTextField t = new JTextField(30);
	int temp_num1 = 0, temp_num2 = 0;
	String txt = "";
	String temp = "";
	//String temp_plus;
	
	
	CalFrame(){
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JY Calculator");
		p1.add(t);
		for(int i=0; i<13; i++) {
			btn[i] = new JButton(btn_val[i]);
			p2.add(btn[i]);
			btn[i].addActionListener(this);
		}
		
		p2.setLayout(new GridLayout(6,6,6,6));
		
		this.add(p1, BorderLayout.NORTH);
		this.add(p2, BorderLayout.CENTER);
		
		setVisible(true);
	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int result = 0;
		
		
		if(e.getActionCommand().equals("+")) {
			temp_num1 = Integer.parseInt(txt);  //string을 int로 변환
			txt += " + ";
			temp = txt;
			txt = "";
		}
		else if(e.getActionCommand().equals("=")) {
			temp_num2 = Integer.parseInt(txt);
			result = temp_num1 + temp_num2;
			txt += " = " + String.valueOf(result);
			
		}
		else if(e.getActionCommand().equals("C")) {
			txt = "";
			temp_num1 = 0;
			temp_num2 = 0;
			temp = "";
			
		}
		
		else if(e.getActionCommand().equals("0")){
			if(txt == "") {
				txt = "";
				
			}
			else txt += "0";
		}
		else {
			txt += e.getActionCommand();
		}
		
		t.setText(temp+txt);
		
	}
}
