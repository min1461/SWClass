package GUI_Practice;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class GridLayoutMainClass extends Frame { // 원하는 위치에 넣어주기
	public GridLayoutMainClass()// 생성자
	{// 자동주문 기계에서 화면구성하기 //Grid : 격자
		this.setLayout(new GridLayout(2, 3));// ->간격없음
		// this.setLayout(new GridLayout(2,3,10,10)); -> 사이의 간격이 10
		// GridLayout(2,3,30,30) 2행 3열이면서 (좌우,상하) -> 간격 30
		// setLayout(null) 은 개발자 임의대로 (absolute layout);
		this.add(new Button("1"));
		this.add(new Button("2"));
		this.add(new Button("3"));
		this.add(new Button("4"));
		this.add(new Button("5"));
		this.add(new Button("6"));
//		this.add(new Button("눌러봐"));
		this.setSize(300, 300);
		this.setVisible(true);
		addWindowListener(new WindowAdapter() {
			//windowadapter는 다 적을필요없다는 뜻이다(Swing에선 필요없음)
			public void windowClosing(WindowEvent e1) {
			//add WindowListener에서 이 메서드가 없으면 ctrl + shift + esc를 통해 강제종료 해주어야함.
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		// GridLayoutMainClass flc1 = new GridLayoutMainClass();
		new GridLayoutMainClass();// 생성자 (인자가없는 디폴트 생성자)

	}
}