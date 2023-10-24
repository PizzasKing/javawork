package actionevent;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlusCalcEvent {

	public static void main(String[] args) {
		// 프레임 > 패널1, 패널2(FlowLayout) > 버튼, 텍스트상자
		JFrame frame = new JFrame("덧셈 프로그램");
		frame.setSize(250, 120);
		frame.setLocation(200, 100);

		// 패널1, 패널2 생성
		JPanel pane1 = new JPanel();
		JPanel pane2 = new JPanel();

		// 패널 배치 - BorderLayout
		frame.add(pane1, BorderLayout.NORTH);
		frame.add(pane2, BorderLayout.CENTER);

		// 패널에서 버튼, 텍스트 상자 배치 - FlowLayout
		pane1.setLayout(new FlowLayout());
		JTextField text1 = new JTextField(5);
		JTextField text2 = new JTextField(5);
		JTextField text3 = new JTextField(5);
		
		pane2.setLayout(new FlowLayout());
		JButton calcBtn = new JButton("계산");
		JButton resetBtn = new JButton("취소");
		

		pane1.add(text1);
		pane1.add(new JLabel("+"));
		pane1.add(text2);
		pane1.add(new JLabel("="));
		pane1.add(text3);
		
		pane2.add(calcBtn);
		pane2.add(resetBtn);
		
		//버튼 이벤트 - 익명 객체 구현
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(text1.getText());
				int num2 = Integer.parseInt(text2.getText());
				int sum = num1 + num2;
				text3.setText(String.valueOf(sum));
			}
		};
		calcBtn.addActionListener(listener); // 계산 실행
		
		// 취소 버튼 구현
		ActionListener listener2 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text1.setText("");
				text2.setText("");
				text3.setText("");
			}
		};
		resetBtn.addActionListener(listener2);

		// 디스플레이
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

