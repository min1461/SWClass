package Customer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Data.Movie_1;
import Data.Movie_2;
import Data.Movie_3;
import Data.Movie_4;
import Data.Movie_5;
import java.awt.Font;
import javax.swing.JLabel;

public class Page3 extends JFrame {

	private JPanel contentPane;
	JPanel timepanel = new JPanel();
	int count1 = 0;
	int count2 = 0;
	int count3 = 0;
	int count4 = 0;
	int count5 = 0;
	int count6 = 0;
	int count7 = 0;
	public static String Title_Name;
	public static int timeCheck;
	public static int dateCheck;
	public static int MovieCheck = Page2.MovieCheck;
	public static String here = String.valueOf(MovieCheck);

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page3 frame = new Page3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Page3() {
		if (Page2.MovieCheck == 1) {
			Title_Name = Data.Movie_1.movie_name;
		} else if (Page2.MovieCheck == 2) {
			Title_Name = Data.Movie_2.movie_name;
		} else if (Page2.MovieCheck == 3) {
			Title_Name = Data.Movie_3.movie_name;
		} else if (Page2.MovieCheck == 4) {
			Title_Name = Data.Movie_4.movie_name;
		} else {
			Title_Name = Data.Movie_5.movie_name;
		}
		setTitle(Title_Name + "예약페이지입니다.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Date date = new Date();
		Date date1 = new Date();
		date1.setDate(date1.getDate() + 1);
		Date date2 = new Date();
		date2.setDate(date2.getDate() + 2);
		Date date3 = new Date();
		date3.setDate(date3.getDate() + 3);
		Date date4 = new Date();
		date4.setDate(date4.getDate() + 4);
		Date date5 = new Date();
		date5.setDate(date5.getDate() + 5);
		Date date6 = new Date();
		date6.setDate(date6.getDate() + 6);

		JButton todayButton = new JButton(date.getDate() + "");// 날짜기준
		todayButton.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		todayButton.setBounds(82, 68, 105, 73);
		todayButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dateCheck = Integer.parseInt((date.getMonth() + 1 + "" + String.format("%02d", date.getDate())));// 1128
				System.out.println(dateCheck);
				count1++;// 날짜기준
				if (count1 % 2 == 0) {
					count1 = 0;
					timepanel.setVisible(false);
				} else {
					count2 = 0;
					count3 = 0;
					count4 = 0;
					count5 = 0;
					count6 = 0;
					count7 = 0;
					timepanel.setVisible(true);
				}
			}
		});

		todayButton.setBorderPainted(false); // 외곽선지우기
		todayButton.setContentAreaFilled(false); // 채우기안함
		todayButton.setFocusPainted(false);
		contentPane.add(todayButton);
		timepanel.setVisible(false);
		timepanel.setBackground(new Color(255, 0, 0, 0));

		JButton secondbutton = new JButton(date1.getDate() + "");
		secondbutton.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		secondbutton.setBounds(264, 68, 105, 73);
		secondbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dateCheck = Integer.parseInt((date1.getMonth() + 1 + "" + String.format("%02d", date1.getDate())));// 1128
				count2++;
				if (count2 % 2 == 0) {
					count2 = 0;
					timepanel.setVisible(false);
				} else {
					count1 = 0;
					count3 = 0;
					count4 = 0;
					count5 = 0;
					count6 = 0;
					count7 = 0;
					timepanel.setVisible(true);
				}
			}
		});
		secondbutton.setBorderPainted(false); // 외곽선지우기
		secondbutton.setContentAreaFilled(false); // 채우기안함
		secondbutton.setFocusPainted(false);
		contentPane.add(secondbutton);

		JButton thirdbutton = new JButton(date2.getDate() + "");
		thirdbutton.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		thirdbutton.setBounds(446, 68, 105, 73);
		thirdbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dateCheck = Integer.parseInt((date2.getMonth() + 1 + "" +  String.format("%02d", date2.getDate())));// 1128
				count3++;
				if (count3 % 2 == 0) {
					count3 = 0;
					timepanel.setVisible(false);
				} else {
					count2 = 0;
					count1 = 0;
					count4 = 0;
					count5 = 0;
					count6 = 0;
					count7 = 0;

					timepanel.setVisible(true);
				}
			}
		});
		thirdbutton.setBorderPainted(false); // 외곽선지우기
		thirdbutton.setContentAreaFilled(false); // 채우기안함
		thirdbutton.setFocusPainted(false);
		contentPane.add(thirdbutton);

		JButton fourthbutton = new JButton(date3.getDate() + "");
		fourthbutton.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		fourthbutton.setBounds(628, 68, 105, 73);
		fourthbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dateCheck = Integer.parseInt((date3.getMonth() + 1 + "0" + String.format("%02d",  date3.getDate())));// 1128
				count4++;
				if (count4 % 2 == 0) {
					count4 = 0;
					timepanel.setVisible(false);
				} else {
					count2 = 0;
					count3 = 0;
					count1 = 0;
					count5 = 0;
					count6 = 0;
					count7 = 0;

					timepanel.setVisible(true);
				}
			}
		});
		fourthbutton.setBorderPainted(false); // 외곽선지우기
		fourthbutton.setContentAreaFilled(false); // 채우기안함
		fourthbutton.setFocusPainted(false);
		contentPane.add(fourthbutton);

		JButton fifthbutton = new JButton(date4.getDate() + "");
		fifthbutton.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		fifthbutton.setBounds(810, 68, 105, 73);
		fifthbutton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				dateCheck = Integer.parseInt((date4.getMonth() + 1 + "0" + String.format("%02d",  date4.getDate())));// 1128
				count5++;
				if (count5 % 2 == 0) {
					count5 = 0;
					timepanel.setVisible(false);
				} else {
					count2 = 0;
					count3 = 0;
					count4 = 0;
					count1 = 0;
					count6 = 0;
					count7 = 0;

					timepanel.setVisible(true);
				}

			}
		});
		fifthbutton.setBorderPainted(false); // 외곽선지우기
		fifthbutton.setContentAreaFilled(false); // 채우기안함
		fifthbutton.setFocusPainted(false);
		contentPane.add(fifthbutton);

		JButton sixthbutton = new JButton(date5.getDate() + "");
		sixthbutton.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		sixthbutton.setBounds(992, 68, 105, 73);
		sixthbutton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				dateCheck = Integer.parseInt((date5.getMonth() + 1 + "0" + String.format("%02d",  date5.getDate())));// 1128
				count6++;
				if (count6 % 2 == 0) {
					count6 = 0;
					timepanel.setVisible(false);
				} else {
					count2 = 0;
					count3 = 0;
					count4 = 0;
					count5 = 0;
					count1 = 0;
					count7 = 0;

					timepanel.setVisible(true);
				}

			}
		});
		sixthbutton.setBorderPainted(false); // 외곽선지우기
		sixthbutton.setContentAreaFilled(false); // 채우기안함
		sixthbutton.setFocusPainted(false);
		contentPane.add(sixthbutton);

		JButton seventhbutton = new JButton(date6.getDate() + "");
		seventhbutton.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		seventhbutton.setBounds(1174, 68, 105, 73);
		seventhbutton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				dateCheck = Integer.parseInt((date6.getMonth() + 1 + "0" +  String.format("%02d", date6.getDate())));// 1128
				count7++;
				System.out.println(count7);
				if (count7 % 2 == 0) {
					count7 = 0;
					timepanel.setVisible(false);
				} else {
					count2 = 0;
					count3 = 0;
					count4 = 0;
					count5 = 0;
					count6 = 0;
					count1 = 0;

					timepanel.setVisible(true);
				}

			}
		});
		seventhbutton.setBorderPainted(false); // 외곽선지우기
		seventhbutton.setContentAreaFilled(false); // 채우기안함
		seventhbutton.setFocusPainted(false);
		contentPane.add(seventhbutton);
		timepanel.setSize(1366, 768);
		contentPane.add(timepanel);

		JLabel todaylabel = new JLabel("");
		todaylabel.setIcon(new ImageIcon(Page3.class.getResource("/images/daybutton.png")));
		todaylabel.setBounds(82, 68, 105, 73);
		contentPane.add(todaylabel);

		JLabel secondlabel = new JLabel("");
		secondlabel.setIcon(new ImageIcon(Page3.class.getResource("/images/daybutton.png")));
		secondlabel.setBounds(264, 68, 105, 73);
		contentPane.add(secondlabel);

		JLabel thirdlabel = new JLabel("");
		thirdlabel.setIcon(new ImageIcon(Page3.class.getResource("/images/daybutton.png")));
		thirdlabel.setBounds(446, 68, 105, 73);
		contentPane.add(thirdlabel);

		JLabel fourthlabel = new JLabel("");
		fourthlabel.setIcon(new ImageIcon(Page3.class.getResource("/images/daybutton.png")));
		fourthlabel.setBounds(628, 68, 105, 73);
		contentPane.add(fourthlabel);

		JLabel fifthlabel = new JLabel("");
		fifthlabel.setIcon(new ImageIcon(Page3.class.getResource("/images/daybutton.png")));
		fifthlabel.setBounds(810, 68, 105, 73);
		contentPane.add(fifthlabel);

		JLabel sixthlabel = new JLabel("");
		sixthlabel.setIcon(new ImageIcon(Page3.class.getResource("/images/daybutton.png")));
		sixthlabel.setBounds(992, 68, 105, 73);
		contentPane.add(sixthlabel);

		JLabel seventhlabel = new JLabel("");
		seventhlabel.setIcon(new ImageIcon(Page3.class.getResource("/images/daybutton.png")));
		seventhlabel.setBounds(1174, 68, 105, 73);
		contentPane.add(seventhlabel);

		// =======================================Timecheck
		JButton firsttime = new JButton("1회차");
		firsttime.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		firsttime.setBackground(Color.RED);
		firsttime.setBounds(384, 268, 200, 120);
		firsttime.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				timeCheck = 1;
				dispose();
				setVisible(false);
				new Page4().setVisible(true);
			}
		});
		timepanel.setLayout(null);
		timepanel.add(firsttime);

		JButton secondtime = new JButton("2회차");
		secondtime.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		secondtime.setBackground(Color.ORANGE);
		secondtime.setBounds(782, 268, 200, 120);
		secondtime.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				timeCheck = 2;
				dispose();
				setVisible(false);
				new Page4().setVisible(true);
			}
		});
		timepanel.add(secondtime);

		JButton thirdtime = new JButton("3회차");
		thirdtime.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		thirdtime.setBackground(Color.YELLOW);
		thirdtime.setBounds(253, 420, 200, 120);
		thirdtime.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				timeCheck = 3;
				dispose();
				setVisible(false);
				new Page4().setVisible(true);
			}
		});
		timepanel.add(thirdtime);

		JButton fourthtime = new JButton("4회차");
		fourthtime.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		fourthtime.setBackground(Color.GREEN);
		fourthtime.setBounds(582, 420, 200, 120);
		fourthtime.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				timeCheck = 4;
				dispose();
				setVisible(false);
				new Page4().setVisible(true);
			}
		});
		timepanel.add(fourthtime);

		JButton fifthtime = new JButton("5회차");
		fifthtime.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		fifthtime.setBackground(Color.CYAN);
		fifthtime.setBounds(911, 420, 200, 120);
		fifthtime.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				timeCheck = 5;
				dispose();
				setVisible(false);
				new Page4().setVisible(true);
			}
		});

		timepanel.add(fifthtime);

		JButton btn_home = new JButton();
		btn_home.setBounds(1220, 620, 116, 101);
		btn_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new Page1().setVisible(true);
			}
		});

		btn_home.setIcon(new ImageIcon(Page3.class.getResource("/images/iconmonstr-home-6-64.png")));
		btn_home.setBorderPainted(false); // 외곽선지우기
		btn_home.setContentAreaFilled(false); // 채우기안함
		btn_home.setFocusPainted(false);
		contentPane.add(btn_home);

		JPanel Background_Panel = new JPanel() {
			Image background = new ImageIcon(Page3.class.getResource("/images/Page3.jpg")).getImage();

			public void paint(Graphics g) {// 그리는 함수
				g.drawImage(background, 0, 0, null);// background를 그려줌
			}
		};
		Background_Panel.setBounds(0, 0, 1366, 768);
		contentPane.add(Background_Panel);
		Background_Panel.setLayout(null);
	}
}
