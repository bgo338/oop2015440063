import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 눌러졌어요!!");
		//액션이벤트 객체에서 눌려진 버튼 객체를 (버튼객체의 래퍼런스값)가져온다.
		JButton button = (JButton)e.getSource();
		button.setText("버튼이 눌러졌어요!!");
		
	}
}
