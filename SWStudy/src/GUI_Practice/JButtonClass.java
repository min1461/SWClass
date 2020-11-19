package GUI_Practice;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonClass extends JFrame{
	// 창문은 기본으로 닫힘
	// int aa;
	// JButton jb1; // 속성,필드 선언
	JButton jb1 = new JButton("사과");
	JButton jb2 = new JButton("배");
	JButton jb3 = new JButton("감");
	JButton jb4 = new JButton("귤");
	JButton jb5 = new JButton("포도");
	JButton jb6 = new JButton("자두");
	
	public JButtonClass() {
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(new FlowLayout());//가운데 중앙정렬
		getContentPane().add(jb1);
		getContentPane().add(jb2);
		getContentPane().add(jb3);
		getContentPane().add(jb4);
		getContentPane().add(jb5);
		getContentPane().add(jb6);
	}
	
	public static void main(String[] args) {
		JButtonClass jbc1 = new JButtonClass();

		jbc1.setTitle("버튼이야");// 제목
		jbc1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 이거 안하면 x버튼으로 창문을 닫아도 프레임은 종료되지만 실행프로그램은 아직 종료 전임
		// 이걸 써주면 프레임+실행프로그램 종료

		jbc1.setSize(300, 200); // 최초 창크기
		jbc1.setVisible(true);
	}
}
