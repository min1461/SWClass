package Test20201203;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

class GoodBurger extends JFrame implements ActionListener {
	private JPanel contentPane;
	// 조건3
	JLabel itsGB = new JLabel("**굿버거입니다**");
	JLabel WDYWE = new JLabel("드실 메뉴를 선택하세요");

	// 조건4
	JButton jb1 = new JButton("매운 소스 햄버거 : 5000");
	JButton jb2 = new JButton("더블 비프 햄버거 : 7000");
	JButton jb3 = new JButton("야채새우햄버거 : 4500");
	JButton jb4 = new JButton("세겹토마토햄버거 : 5500");
	JButton jb5 = new JButton("주문합니다");
	JButton jb6 = new JButton("취소합니다");
	JComboBox CB = new JComboBox();

	static String MSG = "";
	static String List = "";
	static int Price = 0;
	static int Count = 0;
	static int WC = 0;

	public GoodBurger() {
		// 조건 1
		setTitle("어서오세요 굿버거입니다.");
		// 조건2
		setLayout(new GridLayout(0, 3, 30, 30));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setSize(700, 450);
		setVisible(true);
		setResizable(false);

		// 조건 3-2
		itsGB.setFont(new Font("굴림", Font.BOLD, 25));
		itsGB.setHorizontalAlignment(SwingConstants.CENTER);
		WDYWE.setFont(new Font("굴림", Font.BOLD, 25));
		WDYWE.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(itsGB);
		getContentPane().add(WDYWE);

		// 조건 5
		itsGB.setBounds(0, 0, 325, 40);
		WDYWE.setBounds(375, 0, 325, 40);
		jb1.setBounds(0, 90, 325, 40);
		jb2.setBounds(375, 90, 325, 40);
		jb3.setBounds(0, 190, 325, 40);
		jb4.setBounds(375, 190, 325, 40);
		jb5.setBounds(0, 300, 325, 40);
		jb6.setBounds(375, 300, 325, 40);
		CB.setBounds(0, 350, 325, 40);

		// 액션리스너
		jb1.addActionListener(this);
		getContentPane().add(jb1);

		jb2.addActionListener(this);
		getContentPane().add(jb2);

		jb3.addActionListener(this);
		getContentPane().add(jb3);

		jb4.addActionListener(this);
		getContentPane().add(jb4);

		jb5.addActionListener(this);
		jb5.setBackground(Color.ORANGE);
		getContentPane().add(jb5);

		jb6.addActionListener(this);
		jb6.setBackground(Color.YELLOW);
		getContentPane().add(jb6);

		CB.setModel(new DefaultComboBoxModel(new String[] { "선택안함", "종로", "종로외" }));
		getContentPane().add(CB);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb1) {
			List += "매운 소스 햄버거" + "\n";
			Price += 5000;
			Count++;
		}
		if (e.getSource() == jb2) {
			List += "더블 비프 햄버거" + "\n";
			Price += 7000;
			Count++;
		}
		if (e.getSource() == jb3) {
			List += "야채새우햄버거" + "\n";
			Price += 4500;
			Count++;
		}
		if (e.getSource() == jb4) {
			List += "세겹토마토햄버거" + "\n";
			Price += 5500;
			Count++;
		}
		if (CB.getSelectedItem().equals("종로") || CB.getSelectedItem().equals("종로외")) {
			Price -= 1000;
		}
		if (e.getSource() == jb5) {
			MSG = List + "\n총 금액 : " + Price + "\n총 주문수량 : " + Count;
			new RightClass();
		}
		if (e.getSource() == jb6) {
			List = "취소되었습니다.";
			Price = 0;
			Count = 0;
		}
	}
}

public class GoodBurgerMainClass {
	public static void main(String[] args) {
		new GoodBurger();
	}
}