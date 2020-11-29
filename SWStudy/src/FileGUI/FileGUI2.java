package FileGUI;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileGUI2 extends Frame implements ActionListener {
	static String s1 = "";
	private Button b1 = new Button("불러오기");
	private Button b2 = new Button("저장하기");
	private TextArea tf1 = new TextArea();// 글상자
	/*
	 * Time sharing System shooting game 시간을 나누어 저장
	 */

	public FileGUI2() {
		this.setLayout(null);// **absolute layout

		b1.setSize(70, 70);// 버튼크기
		b1.setForeground(new Color(0, 0, 255));
		b1.setBackground(new Color(255, 180, 100));
		b1.setFont(new Font("돋움", Font.BOLD, 20));
		b1.setLocation(450, 220); // 버튼 내부위치
		this.add(b1);
		b1.addActionListener(this);

		b2.setSize(70, 70);// 버튼 크기
		b2.setForeground(new Color(0, 0, 255));
		b2.setBackground(new Color(255, 180, 100));
		b2.setFont(new Font("돋움", Font.BOLD, 20));
		b2.setLocation(450, 300); // 버튼 내부위치
		this.add(b2);// 버튼 추가
		b2.addActionListener(this); /// 버튼 이벤트를 위하여 이벤트등록

		tf1.setSize(400, 300);
		tf1.setForeground(new Color(0, 0, 255));
		tf1.setBackground(new Color(255, 255, 0));
		tf1.setFont(new Font("굴림", Font.BOLD, 35));
		tf1.setLocation(30, 70);// 텍스트 내부위치
		this.add(tf1);

		this.setBackground(new Color(0, 200, 0));
		this.setTitle("자바는 FUN FUN FUN !!!!!!");
		this.setSize(350, 400); // 프레임 크기
		this.setVisible(true);

		addWindowListener(new WindowAdapter() { //////////////////
			public void windowClosing(WindowEvent e1) {
				dispose();
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e1) {
		if (e1.getSource() == b1) {//시작버튼이 눌러져있으면 (이벤트)
			b1.setEnabled(false);	//아이콘을 반투명으로  // 이게 없으면 버튼을 눌러도 무반응
									//b1.setVisible(false);
			try {
				FileReader fr = new FileReader("C://workspace_SW/SWStudy/텍스트.txt");
				//file read - 화면출력(write) //byte readInt
				String s = null;
				while((s=fr.read())!= null) {
					System.out.println((s));
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//if end
	}//actionPerformed 끝
}//EDisplay 끝