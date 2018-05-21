import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

	JButton button, btn;
	JTextField tf;
	
	MyFrame() {  //������
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��ȣ�ȿ� �ִ°� : static variable
		setTitle("JY frame");
		
		
	
		//���ο� ������Ʈ�� �����ӿ� �߰�
		setLayout(new FlowLayout()); //�÷ο� ��ġ �Ŵ��� ���
		
		button = new JButton("button1");//��ư ��ü ����
		this.add(button);//��ư ��ü�� �����ӿ� �߰�
	//	MyListener listener = new MyListener();
		button.setActionCommand("button1");	
		button.addActionListener(this); //�̺�Ʈ ������ ��ü ��� (this : MyFrame, listener : MyListener)
		
	
		btn = new JButton("button2");
		this.add(btn);
		btn.setActionCommand("button2");
		btn.addActionListener(this);
	
		tf = new JTextField(20);
		this.add(tf);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { //MyListenerŬ�󽺰� �ʿ��������.
		//�׼��̺�Ʈ ��ü���� ������ ��ư ��ü�� (��ư��ü�� ���۷�����)�����´�.
	//	JButton button = (JButton)e.getSource(); �ʵ带 ��������� ������ �ʿ����.
		if((e.getActionCommand()).equals("button1")) {
			this.tf.setText("ù��° ��ư");
		}
		else 
			this.tf.setText("�ι�° ��ư");
		
	//	this.button.setText("��ư�� ���������~~");
	//	this.tf.setText("�ؽ�Ʈ�ʵ忡 ���ڸ� �־����");
		
	}
}
