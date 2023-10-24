package components;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrame1 {

	public static void main(String[] args) {
		// 프레임 - 윈도우 전체
		JFrame frame = new JFrame();
		// 제목 표시줄 - 내용
		frame.setTitle("처음 만드는 윈도우");
		frame.setSize(300, 200);  // 300px-너비, 200px-높이
		frame.setLocation(200, 100);  // x좌표 - 200, y좌표 - 100
		frame.setLayout(null);
		
		// 레이블(글자 출력)
		JLabel label = new JLabel("안녕~ Java");
		label.setSize(80, 30);
		label.setLocation(100, 40);
		frame.add(label);
		// label.setText("안녕~ Java");
		
		//레이블 정렬(alignment: 왼쪽 가운데 오른쪽)
		label.setHorizontalAlignment(JLabel.CENTER);
		// BoarderLayout - 프레임을 동, 서, 남, 북, 중앙으로 배치
		frame.add(label, BorderLayout.CENTER);
		
		// 버튼 생성
		JButton button = new JButton("확인");
		button.setSize(70, 30);
		button.setLocation(100, 80);
		frame.add(button);
		
		
		// 윈도우 종료
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 윈도우 디스플레이
		frame.setVisible(true);
	}

}
