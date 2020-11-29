package Customer;

import java.awt.Color;
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

	public Page3() {
		if (MovieCheck == 1) {
			Title_Name = Movie_1.movie_name;
		} else if (MovieCheck == 2) {
			Title_Name = Movie_2.movie_name;
		} else if (MovieCheck == 3) {
			Title_Name = Movie_3.movie_name;
		} else if (MovieCheck == 4) {
			Title_Name = Movie_4.movie_name;
		} else {
			Title_Name = Movie_5.movie_name;
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
		todayButton.setBounds(82, 68, 100, 50);
		todayButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dateCheck = Integer.parseInt((date.getMonth() + 1 + "" + date.getDate()));// 1128
				count1++;// 날짜기준
				if (count1 % 2 == 0) {
					timepanel.setVisible(false);
				} else {
					timepanel.setVisible(true);
				}
			}
		});

		contentPane.add(todayButton);
		timepanel.setVisible(false);
		timepanel.setBackground(new Color(255, 0, 0, 0));
		JButton secondbutton = new JButton(date1.getDate() + "");
		secondbutton.setBounds(264, 68, 100, 50);
		secondbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dateCheck = Integer.parseInt((date1.getMonth() + 1 + "" + date1.getDate()));// 1128
				count2++;
				if (count2 % 2 == 0) {
					timepanel.setVisible(false);
				} else {
					timepanel.setVisible(true);
				}
			}
		});
		contentPane.add(secondbutton);

		JButton thirdbutton = new JButton(date2.getDate() + "");
		thirdbutton.setBounds(446, 68, 100, 50);
		thirdbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dateCheck = Integer.parseInt((date2.getMonth() + 1 + "" + date2.getDate()));// 1128
				count3++;
				if (count3 % 2 == 0) {
					timepanel.setVisible(false);
				} else {
					timepanel.setVisible(true);
				}
			}
		});
		contentPane.add(thirdbutton);

		JButton fourthbutton = new JButton(date3.getDate() + "");
		fourthbutton.setBounds(628, 68, 100, 50);
		fourthbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dateCheck = Integer.parseInt((date3.getMonth() + 1 + "0" + date3.getDate()));// 1128
				count4++;
				if (count4 % 2 == 0) {
					timepanel.setVisible(false);
				} else {
					timepanel.setVisible(true);
				}
			}
		});
		contentPane.add(fourthbutton);

		JButton fifthbutton = new JButton(date4.getDate() + "");
		fifthbutton.setBounds(810, 68, 100, 50);
		fifthbutton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				dateCheck = Integer.parseInt((date4.getMonth() + 1 + "0" + date4.getDate()));// 1128
				count7++;
				if (count7 % 2 == 0) {
					timepanel.setVisible(false);
				} else {
					timepanel.setVisible(true);
				}
				;
			}
		});
		contentPane.add(fifthbutton);

		JButton sixthbutton = new JButton(date5.getDate() + "");
		sixthbutton.setBounds(992, 68, 100, 50);
		sixthbutton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				dateCheck = Integer.parseInt((date5.getMonth() + 1 + "0" + date5.getDate()));// 1128
				count7++;
				if (count7 % 2 == 0) {
					timepanel.setVisible(false);
				} else {
					timepanel.setVisible(true);
				}
				;
			}
		});
		contentPane.add(sixthbutton);

		JButton seventhbutton = new JButton(date6.getDate() + "");
		seventhbutton.setBounds(1174, 68, 100, 50);
		seventhbutton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				dateCheck = Integer.parseInt((date6.getMonth() + 1 + "0" + date6.getDate()));// 1128
				count7++;
				System.out.println(count7);
				if (count7 % 2 == 0) {
					timepanel.setVisible(false);
				} else {
					timepanel.setVisible(true);
				}
				;
			}
		});
		contentPane.add(seventhbutton);
		timepanel.setSize(1366, 768);
		contentPane.add(timepanel);

		// =======================================Timecheck
		JButton firsttime = new JButton("1회차");
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

		JPanel Background_Panel = new JPanel() {
			Image background = new ImageIcon(Page7.class.getResource("/images/Page3.jpg")).getImage();

			public void paint(Graphics g) {// 그리는 함수
				g.drawImage(background, 0, 0, null);// background를 그려줌
			}
		};
		Background_Panel.setBounds(0, 0, 1366, 768);
		contentPane.add(Background_Panel);
		Background_Panel.setLayout(null);
	}
}
