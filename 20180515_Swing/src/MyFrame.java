import java.awt.FlowLayout;
import javax.swing.*;

//������ ����� �ι�° ���: JFrame���κ��� ��ӹ��� Ŭ�󽺸� �����.
public class MyFrame extends JFrame{
	MyFrame() {  //������
		setSize(900,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��ȣ�ȿ� �ִ°� : static variable
		setTitle("2nd frame");
	
		//���ο� ������Ʈ�� �����ӿ� �߰�
		setLayout(new FlowLayout());
		
		JLabel label = new JLabel("���ڸ� ������ �Է��ϼ���:");//���̺� ��ü ����
		JTextField tf = new JTextField(20);//�ؽ�Ʈ�ʵ� ��ü ����
		JButton button = new JButton("button");//��ư ��ü ����
		
		button.setText("����");
		tf.setText("�ȳ��ϼ���");
		
		//�г� ����
		JPanel panel = new JPanel();
		panel.add(label); //������Ʈ �߰�
		panel.add(tf); //��Ǫ��Ʈ �߰�
		
		//�����ӿ� �߰��� �� �Է� ������ ���� ��ġ�� �޶�����.
		//this.add(label);//���̺� ��ü�� �����ӿ� �߰�
		//this.add(tf);//�ؽ�Ʈ�ʵ� ��ü�� �����ӿ� �߰�
		//this.add(button);//��ư ��ü�� �����ӿ� �߰�
		this.add(panel); //�г��� �����ӿ� �߰�
		
		//pack();//������Ʈ���� �� ä���� ������ũ�⸦ ����
		
		setVisible(true);
	}

}
