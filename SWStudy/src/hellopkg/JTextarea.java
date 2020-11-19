package hellopkg;
/*
 * #### JTextarea에 스크롤바 생기게 하기
 * 
 * 1) 먼저 JScrollpane을 올리고
 * 2) 그 위에 JTextarea를 바로 올리면 viewport개념으로 크기가 일치한다
 * (이것이 잘 안되면 먼저 JTextarea를 만들고 왼쪽 Structure 창 JTextarea에 마우스 놓고 - 우클릭 - surround with - scrollpane을 선택하면 조금 편리하다)
 * (소스참고) scrollPane.setViewportView(textArea);
 * 3)실행 시에는 JTextare에 글자를 계속 넣어보고 한줄 길게 넣어보면 스크롤바가 both(가로줄 및 세로줄)로 생긴다
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;

public class JTextarea extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTextarea frame = new JTextarea();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JTextarea() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 12, 372, 244);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("굴림", Font.PLAIN, 20));
		textArea.setText("가\r\n나\r\n다\r\n라\r\n마\r\n바\r\n사\r\n아\r\n자\r\n차\r\n카\r\n타\r\n파\r\n하");
	}
}
