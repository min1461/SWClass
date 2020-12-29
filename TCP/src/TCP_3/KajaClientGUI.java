package TCP_3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KajaClientGUI extends JFrame implements Runnable, ActionListener {
	// console 모드에서 넘어오는 3개 인자를 받아 저장할 준비필드
	DataOutputStream outputStream;
	DataInputStream inputStream;
	String nickname;

	JLabel jlabel1 = new JLabel("우리반 채팅~~~");
	JTextArea jtarea1 = new JTextArea();
	JTextField jtfield1 = new JTextField();
	JScrollPane jScrollPane = new JScrollPane(jtarea1);

//	클라이언트의
//	new KajaClientGUI(outputstream,inputstream,args[2])
//	{에서 여기로 찾아옴
//	GUI의 생성자 처리 
	public KajaClientGUI(DataOutputStream outputStream, DataInputStream inputStream, String nickname) {
		this.outputStream = outputStream;
		this.inputStream = inputStream;
		this.nickname = nickname;

		setLayout(new BorderLayout());
		// NORTH, SOUTH, WEST, EAST, CENTER

		jlabel1.setFont(new Font("굴림", Font.BOLD, 22));
		add("North", jlabel1);// "우리반 채팅"

		// chat문자열이 출력되는 곳
		jtarea1.setBackground(Color.yellow);
		jtarea1.setForeground(Color.blue);
		jtarea1.setFont(new Font("굴림", Font.BOLD, 22));
		// new Font(글씨체, 스타일, 크기)

		jtarea1.setEditable(false);
		add("Center", jScrollPane);

		// chat 입력
		jtfield1.setBackground(Color.white);
		jtfield1.setForeground(Color.BLACK);
		jtfield1.setFont(new Font("굴림", Font.BOLD, 25));
		add("South", jtfield1);
		jtfield1.addActionListener(this);// 이벤트등록

		setTitle(nickname+"의 채팅방");
		setSize(800, 800);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
//				이걸 해주어야 퇴장f
				setVisible(false);
			}
		});

		// 서버로 부터 받아 textarea에 뿌려주는 쓰레드
		Thread th1 = new Thread(this);
		th1.start(); // ? 자기자신참조
	}// 생성자 -end

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jtfield1) {
			try {
				outputStream.writeUTF(nickname + "---->" + jtfield1.getText());
				// 서버 //nickname과 client의 chat을 서버로
			} catch (IOException ee) {
			}
			jtfield1.setText("");// (서버로 보내고난후 ) 해당 칸을 클리어
		}
	} // actionPerformed-end

	// chat 올때마다 beep음 울리게
	Toolkit tk1 = Toolkit.getDefaultToolkit();

	public void run() { // for 받는 thread
		try {
			while (true) {
				String strServer1 = inputStream.readUTF(); // 서버로부터
				if (strServer1 == null) {
					jtarea1.append("\n" + "종료");
					return;
				}
				jtarea1.append("\n" + strServer1); // 서버에서 온것을 textarea에 추가

				// 이것을 해야 스크롤 바가 생긴후 맨 마지막 내용이 잘보임
				int kkeut = jtarea1.getText().length();
				jtarea1.setCaretPosition(kkeut);// 커서를 맨뒤로
				// jtarea1.setCaretPosition(0);//커서를 맨처음으로
				tk1.beep(); // chat이 올때마다 beep음
			}
		} catch (Exception eee) {
			jtarea1.append("\n" + eee);
		}
	}// run-end
}// class-end