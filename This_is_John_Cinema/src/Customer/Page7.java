package Customer;

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

public class Page7 extends JFrame {

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

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Page7() {
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
		todayButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dateCheck = Integer.parseInt((date.getMonth() + 1 + "" + date.getDate()));// 1128
				count1++;// 날짜기준
				if (count1 % 2 == 0) {
					timepanel.setVisible(false);
					count1 = 0;
				} else {
					timepanel.setVisible(true);
				}
			}
		});
		todayButton.setBounds(78, 68, 105, 27);
		contentPane.add(todayButton);

		JButton secondbutton = new JButton(date1.getDate() + "");
		secondbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dateCheck = Integer.parseInt((date1.getMonth() + 1 + "" + date1.getDate()));// 1128
				count2++;
				if (count2 % 2 == 0) {
					timepanel.setVisible(false);
					count2 = 0;
				} else {
					timepanel.setVisible(true);
				}
			}
		});
		secondbutton.setBounds(261, 68, 105, 27);
		contentPane.add(secondbutton);

		JButton thirdbutton = new JButton(date2.getDate() + "");
		thirdbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dateCheck = Integer.parseInt((date2.getMonth() + 1 + "" + date2.getDate()));// 1128
				count3++;
				if (count3 % 2 == 0) {
					timepanel.setVisible(false);
					count3 = 0;
				} else {
					timepanel.setVisible(true);
				}
			}
		});
		thirdbutton.setBounds(444, 68, 105, 27);
		contentPane.add(thirdbutton);

		JButton fourthbutton = new JButton(date3.getDate() + "");
		fourthbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dateCheck = Integer.parseInt((date3.getMonth() + 1 + "0" + date3.getDate()));// 1128
				count4++;
				if (count4 % 2 == 0) {
					timepanel.setVisible(false);
					count4 = 0;
				} else {
					timepanel.setVisible(true);
				}
			}
		});
		fourthbutton.setBounds(627, 68, 105, 27);
		contentPane.add(fourthbutton);

		JButton fifthbutton = new JButton(date4.getDate() + "");
		fifthbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dateCheck = Integer.parseInt((date4.getMonth() + 1 + "0" + date4.getDate()));// 1128
				count5++;
				if (count5 % 2 == 0) {
					timepanel.setVisible(false);
					count5 = 0;
				} else {
					timepanel.setVisible(true);
				}
			}
		});
		fifthbutton.setBounds(810, 68, 105, 27);
		contentPane.add(fifthbutton);

		JButton sixthbutton = new JButton(date5.getDate() + "");
		sixthbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dateCheck = Integer.parseInt((date5.getMonth() + 1 + "0" + date5.getDate()));// 1128
				count6++;
				if (count6 % 2 == 0) {
					timepanel.setVisible(false);
					count6 = 0;
				} else {
					timepanel.setVisible(true);
				}
			}
		});
		sixthbutton.setBounds(993, 68, 105, 27);
		contentPane.add(sixthbutton);

		JButton seventhbutton = new JButton(date6.getDate() + "");
		seventhbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dateCheck = Integer.parseInt((date6.getMonth() + 1 + "0" + date6.getDate()));// 1128
				count7++;
				if (count7 % 2 == 0) {
					timepanel.setVisible(false);
					count7 = 0;
				} else {
					timepanel.setVisible(true);
				}
			}
		});
		seventhbutton.setBounds(1176, 68, 105, 27);
		contentPane.add(seventhbutton);
//		=======================================Timecheck
		timepanel.setVisible(false);
		timepanel.setBounds(0, 0, 1203, 450);
		contentPane.add(timepanel);
		timepanel.setLayout(null);

		JButton firsttime = new JButton("1회차");
		firsttime.setBounds(237, 70, 246, 120);
		firsttime.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				timeCheck = 1;
				dispose();
				setVisible(false);
				new Page4().setVisible(true);
			}
		});
		timepanel.add(firsttime);

		JButton secondtime = new JButton("2회차");
		secondtime.setBounds(720, 70, 246, 120);
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
		thirdtime.setBounds(116, 260, 246, 120);
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
		fourthtime.setBounds(478, 260, 246, 120);
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
		fifthtime.setBounds(840, 260, 246, 120);
		fifthtime.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				timeCheck = 5;
				dispose();
				setVisible(false);
				new Page4().setVisible(true);
			}
		});
		timepanel.add(fifthtime);

//		JPanel Background_Panel = new JPanel() {
//			Image background = new ImageIcon(Page7.class.getResource("/images/Page3.png")).getImage();
//
//			public void paint(Graphics g) {// 그리는 함수
//				g.drawImage(background, 0, 0, null);// background를 그려줌
//			}
//		};
//		Background_Panel.setBounds(0, 0, 1348, 721);
//		contentPane.add(Background_Panel);

	}
}
