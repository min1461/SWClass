
package Customer;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Page2 extends JFrame {

	public static int MovieCheck;
	private JFrame frame;
	private JTextField txt_title1;
	private JTextField txt_title2;
	private JTextField txt_title3;
	private JTextField txt_title4;
	private JTextField txt_title5;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public Page2() {
		setTitle("영화를 선택하세요");
		setBounds(100, 100, 1366, 768);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel panel_poster = new JPanel();
		panel_poster.setBounds(0, 0, 1366, 768);
		getContentPane().add(panel_poster);
		panel_poster.setLayout(null);

		JButton btnposter1 = new JButton();
		btnposter1.setBounds(27, 205, 231, 331);
		btnposter1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MovieCheck = 1;
				dispose();
				setVisible(false);
				new Page2_Dialog().setVisible(true);
			}
		});
		btnposter1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JLabel Label = new JLabel("영화를 선택하세요");
		Label.setForeground(Color.WHITE);
		Label.setBounds(338, 51, 689, 81);
		Label.setHorizontalAlignment(SwingConstants.CENTER);
		Label.setFont(new Font("HY헤드라인M", Font.BOLD, 60));
		panel_poster.add(Label);
		btnposter1.setIcon(new ImageIcon(".\\src\\images\\Avengers.jpg"));
		panel_poster.add(btnposter1);

		JButton btnposter2 = new JButton();
		btnposter2.setBounds(293, 205, 231, 331);
		btnposter2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MovieCheck = 2;
				dispose();
				setVisible(false);
				new Page2_Dialog().setVisible(true);
			}
		});
		btnposter2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnposter2.setIcon(new ImageIcon(".\\src\\images\\Extrem Job.jpg"));
		panel_poster.add(btnposter2);

		JButton btnposter3 = new JButton();
		btnposter3.setBounds(559, 205, 231, 331);
		btnposter3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MovieCheck = 3;
				dispose();
				setVisible(false);
				new Page2_Dialog().setVisible(true);
			}
		});
		btnposter3.setIcon(new ImageIcon(".\\src\\images\\Hobbs N Shaw.jpg"));
		panel_poster.add(btnposter3);

		JButton btnposter4 = new JButton();
		btnposter4.setBounds(825, 205, 231, 331);
		btnposter4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MovieCheck = 4;
				dispose();
				setVisible(false);
				new Page2_Dialog().setVisible(true);
			}
		});
		btnposter4.setIcon(new ImageIcon(".\\src\\images\\The Lion King.jpg"));
		panel_poster.add(btnposter4);

		JButton btnposter5 = new JButton();
		btnposter5.setBounds(1091, 205, 231, 331);
		btnposter5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MovieCheck = 5;
				dispose();
				setVisible(false);
				new Page2_Dialog().setVisible(true);
			}
		});
		btnposter5.setIcon(new ImageIcon(".\\src\\images\\Titanic.jpg"));
		panel_poster.add(btnposter5);

		JButton btn_home = new JButton();
		btn_home.setBounds(1220, 620, 116, 101);
		btn_home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new Page1().setVisible(true);
			}
		});
		btn_home.setIcon(new ImageIcon(".\\src\\images\\iconmonstr-home-6-64.png"));
		btn_home.setBorderPainted(false); // 외곽선지우기
		btn_home.setContentAreaFilled(false); // 채우기안함
		btn_home.setFocusPainted(false);
		panel_poster.add(btn_home);

		txt_title1 = new JTextField();
		txt_title1.setBounds(33, 557, 233, 31);
		txt_title1.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		txt_title1.setHorizontalAlignment(SwingConstants.CENTER);
		txt_title1.setText("어벤져스 앤드게임");
		panel_poster.add(txt_title1);
		txt_title1.setColumns(10);

		txt_title2 = new JTextField();
		txt_title2.setBounds(299, 557, 233, 31);
		txt_title2.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		txt_title2.setHorizontalAlignment(SwingConstants.CENTER);
		txt_title2.setText("극한직업");
		txt_title2.setColumns(10);
		panel_poster.add(txt_title2);

		txt_title3 = new JTextField();
		txt_title3.setBounds(565, 557, 233, 31);
		txt_title3.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		txt_title3.setHorizontalAlignment(SwingConstants.CENTER);
		txt_title3.setText("분노의 질주 홉스&쇼");
		txt_title3.setColumns(10);
		panel_poster.add(txt_title3);

		txt_title4 = new JTextField();
		txt_title4.setBounds(831, 557, 233, 31);
		txt_title4.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		txt_title4.setHorizontalAlignment(SwingConstants.CENTER);
		txt_title4.setText("라이온킹");
		txt_title4.setColumns(10);
		panel_poster.add(txt_title4);

		txt_title5 = new JTextField();
		txt_title5.setBounds(1097, 557, 233, 31);
		txt_title5.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		txt_title5.setHorizontalAlignment(SwingConstants.CENTER);
		txt_title5.setText("타이타닉");
		txt_title5.setColumns(10);
		panel_poster.add(txt_title5);

		JPanel panel = new JPanel() {
			Image background = new ImageIcon(Page2.class.getResource("/images/Page2.jpg")).getImage();

			public void paint(Graphics g) {// 그리는 함수
				g.drawImage(background, 0, 0, null);// background를 그려줌
			}
		};
		panel.setBounds(0, 0, 1348, 721);
		panel_poster.add(panel);

	}
}