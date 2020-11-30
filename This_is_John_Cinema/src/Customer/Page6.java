package Customer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Data.Movie_1;
import Data.Movie_2;
import Data.Movie_3;
import Data.Movie_4;
import Data.Movie_5;
import java.awt.Label;
import java.awt.Panel;

public class Page6 extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	////
	public int totalperson = Page4.totalperson;
	public static int count;
	public static String adult = Page4.adult;
	public static String child = Page4.child;
	public static int dateCheck = Page3.dateCheck;
	public static int timeCheck = Page3.timeCheck;
	public static int MovieCheck = Page2.MovieCheck;
	public static String here = String.valueOf(MovieCheck) + String.valueOf(timeCheck) + String.valueOf(dateCheck)
			+ adult + child;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	String MN;
	String MG;
	int RT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page6 frame = new Page6();
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
	public Page6() {
		setResizable(false);
		adult = Page4.adult;
		child = Page4.child;
		dateCheck = Page3.dateCheck;
		timeCheck = Page3.timeCheck;
		MovieCheck = Page2.MovieCheck;
		Movie_1 m1 = new Movie_1();
		Movie_2 m2 = new Movie_2();
		Movie_3 m3 = new Movie_3();
		Movie_4 m4 = new Movie_4();
		Movie_5 m5 = new Movie_5();
		setTitle("예매 완료");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1291, 688);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		///////////////////////////////////////////////////////////////////////////////
		// 바코드
		JButton btn_bar = new JButton();
		btn_bar.setIcon(new ImageIcon(Page6.class.getResource("/images/barcode.png")));
		btn_bar.setBounds(1048, 150, 99, 332);
		btn_bar.setFocusPainted(false);
		btn_bar.setBorderPainted(false); // 외곽선지우기
		btn_bar.setContentAreaFilled(false); // 채우기안함
		contentPane.add(btn_bar);

		label = new JLabel();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("HY헤드라인M", Font.BOLD, 30));
		label.setText("\uC601\uD654 \uC608\uB9E4\uAC00 \uC644\uB8CC\uB418\uC5C8\uC2B5\uB2C8\uB2E4");
		label.setBounds(432, 28, 408, 56);
		contentPane.add(label);

		JButton btn_home = new JButton();
		btn_home.setIcon(new ImageIcon(Page6.class.getResource("/images/iconmonstr-home-6-64.png")));
		btn_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				totalperson = 0;
				count = 0;
				adult = "0";
				child = "0";
				dateCheck = 0;
				timeCheck = 0;
				MovieCheck = 0;
				String here = "";
				dispose();
				setVisible(false);
				new Page1().setVisible(true);
			}
		});
		btn_home.setBounds(1104, 557, 82, 72);
		btn_home.setBorderPainted(false);
		btn_home.setContentAreaFilled(false);
		btn_home.setFocusPainted(false);
		contentPane.add(btn_home);

//		Panel panel_1 = new Panel();
////		panel_1.setBackground(new Color(0, 0, 0, 0));
//		panel_1.setBounds(346, 104, 624, 444);
//		contentPane.add(panel_1);
//		panel_1.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("영화 입장권");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(346, 128, 624, 46);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("HY헤드라인M",Font.BOLD,30));
		
		if (MovieCheck == 1) {
			MN = m1.movie_name;
			RT = m1.runtime;
			MG = m1.movie_grade;
		} else if (MovieCheck == 2) {
			MN = m2.movie_name;
			RT = m2.runtime;
			MG = m2.movie_grade;
		} else if (MovieCheck == 3) {
			MN = m3.movie_name;
			RT = m3.runtime;
			MG = m3.movie_grade;
		} else if (MovieCheck == 4) {
			MN = m4.movie_name;
			RT = m4.runtime;
			MG = m4.movie_grade;
		} else {
			MN = m5.movie_name;
			RT = m5.runtime;
			MG = m5.movie_grade;
		}
		
		JLabel lblNewLabel_4 = new JLabel("영화제목 : " + MN + " | " + RT + "분");
		lblNewLabel_4.setBounds(346, 228, 624, 46);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("HY헤드라인M",Font.BOLD,25));

		JLabel lblNewLabel_5 = new JLabel(MG);
		lblNewLabel_5.setBounds(346, 303, 624, 46);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("HY헤드라인M",Font.BOLD,25));

		JLabel lblNewLabel_6 = new JLabel("날짜 : 2020" + dateCheck);
		lblNewLabel_6.setBounds(646, 303, 624, 46);
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("HY헤드라인M",Font.BOLD,25));

		JLabel lblNewLabel_9 = new JLabel("총인원 : " + totalperson + "명");
		lblNewLabel_9.setBounds(346, 378, 624, 46);
		contentPane.add(lblNewLabel_9);
		lblNewLabel_9.setFont(new Font("HY헤드라인M",Font.BOLD,25));

		JLabel lblNewLabel_10 = new JLabel("즐거운 관람되세요~");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(346, 478, 624, 46);
		contentPane.add(lblNewLabel_10);
		lblNewLabel_10.setFont(new Font("HY헤드라인M",Font.BOLD,30));
		
		JPanel panel_2 = new JPanel(){
			Image background = new ImageIcon(Page6.class.getResource("/images/bill.jpg")).getImage();

			public void paint(Graphics g) {// 그리는 함수
				g.drawImage(background, 0, 0, null);// background를 그려줌
			}
		};
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 1273, 641);
		contentPane.add(panel_2);


	}
}
