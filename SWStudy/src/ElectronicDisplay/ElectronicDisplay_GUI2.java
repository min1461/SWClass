package ElectronicDisplay;

import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

class EDisplay extends Frame implements ActionListener {
	static int sw = 0;
	static String s1 = "                           i love you";
	Timer t1 = new Timer();// back ground thread
	private Button b1 = new Button("시~~작~~");
	private Button b2 = new Button("끄~~읕~~");
	private TextField tf1 = new TextField();// 글상자
	/*
	 * Time sharing System shooting game 시간을 나누어 저장
	 */

	public EDisplay() {
		this.setLayout(null);// **absolute layout

		b1.setSize(200, 70);// 버튼크기
		b1.setForeground(new Color(0, 0, 255));
		b1.setBackground(new Color(255, 180, 100));
		b1.setFont(new Font("돋움", Font.BOLD, 20));
		this.add(b1);
		b1.addActionListener(this);

		b2.setSize(200, 70);// 버튼 크기
		b2.setForeground(new Color(0, 0, 255));
		b2.setBackground(new Color(255, 180, 100));
		b2.setFont(new Font("돋움", Font.BOLD, 20));
		b2.setLocation(150, 300); // 버튼 내부위치
		this.add(b2);// 버튼 추가
		b2.addActionListener(this); /// 버튼 이벤트를 위하여 이벤트등록

		tf1.setSize(400, 50);
		tf1.setForeground(new Color(0, 0, 255));
		tf1.setBackground(new Color(255, 255, 0));
		tf1.setFont(new Font("굴림", Font.BOLD, 35));
		tf1.setLocation(30, 70);// 텍스트 내부위치
		this.add(tf1);

		this.setBackground(new Color(0, 200, 0));
		this.setTitle("자바는 FUN FUN FUN !!!!!!");
		this.setSize(460, 400); // 프레임 크기
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
		if (e1.getSource() == b1 && sw == 0) {//시작버튼이 눌러져있으면 (이벤트)
			b1.setEnabled(false);	//아이콘을 반투명으로  // 이게 없으면 버튼을 눌러도 무반응
									//b1.setVisible(false);
			//scheduleAtFixedRate(인자1,2,3);
			t1.scheduleAtFixedRate(new TimerTask() {
				public void run() {//시그널방식 - thread가 있으면 run을 찾아감 (?)
					s1 = s1.substring(1, s1.length()) + s1.substring(0, 1);
					tf1.setText(s1);//화면 출력
				}//run end
			}, 0, 250);//0초후 디스플레이 가동 schedule - end
		}//if end							//t1.schedule도 둘다
		sw = 1;//시작버튼이 한번만 작동되게함
		if (e1.getSource() == b2) {	// 끝 버튼이 눌려졌으면(이벤트)
			t1.cancel();//타이머 끝
		}
	}//actionPerformed 끝
}//EDisplay 끝

public class ElectronicDisplay_GUI2 {
	public static void main(String[] args) {
		new EDisplay();
	}
}