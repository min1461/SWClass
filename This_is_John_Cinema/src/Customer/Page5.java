package Customer;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Data.TestMouse;
import wowtest.OracleTest;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Page5 extends JFrame {
	public static int[][] arr = new int[5][14];
	public static int i = 0;
	public static int j = 0;
	public static List<List<Integer>> list;

	/**
	 * List<Integer> = { 1,2} List<List<Interger>> = { {1,4} {1,3} {1,2} {1,14}
	 * {1,1} }
	 */
	private JPanel contentPane;
	public int totalperson = Page4.totalperson;
	public static int count;
	public static String adult = Page4.adult;
	public static String child = Page4.child;
	public static int dateCheck = Page3.dateCheck;
	public static int timeCheck = Page3.timeCheck;
	public static int MovieCheck = Page2.MovieCheck;
	public static String here = String.valueOf(MovieCheck) + String.valueOf(timeCheck) + String.valueOf(dateCheck)
			+ adult + child;

	public static int movieSeq;

	/**
	 * Launch the application.
	 */
	public Page5(int totalperson) {
		super();
		test();
		this.totalperson = totalperson;

	}

	/**
	 * Create the frame.
	 */
	public Page5() {
		super();
		test();
	}

	public void test() {
		setTitle("좌석을 선택하세요.");
		adult = Page4.adult;
		child = Page4.child;
		dateCheck = Page3.dateCheck;
		timeCheck = Page3.timeCheck;
		MovieCheck = Page2.MovieCheck;
		this.list = new ArrayList<>();
		OracleTest ot = new OracleTest();
		movieSeq = ot.getMovieSeq(MovieCheck, timeCheck, dateCheck);
		List<List<Integer>> seatList = ot.getSeatByMovieSeq(movieSeq);
		for (List<Integer> tempList : seatList) {
			arr[tempList.get(0)][tempList.get(1)] = 2;
		}
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		int aa = 0;
		for (j = 0; j < 5; j++) {
			String str = "";
			if (j == 0) {
				str = "A";
			} else if (j == 1) {
				str = "B";
			} else if (j == 2) {
				str = "C";
			} else if (j == 3) {
				str = "D";
			} else {
				str = "E";
			}
			for (i = 0; i <= 13; i++) {
				JButton a = new JButton(str + i+1);
				a.addMouseListener(new TestMouse(j, i) {
					@Override
					public void mouseClicked(MouseEvent e) {
						if (arr[x][y] == 0 && count < totalperson) {
							arr[x][y] = 1;
							a.setBackground(Color.gray);
							a.setEnabled(false);
							List<Integer> tempList = new ArrayList<>();
							tempList.add(x);
							tempList.add(y);
							list.add(tempList);
							count++;
						} else if (count == totalperson && arr[x][y] == 1) {
							JOptionPane.showMessageDialog(null, "예약인원을 초과하였습니다.\r\n예매완료를 눌러주세요.");
						} else if (count == totalperson) {
							JOptionPane.showMessageDialog(null, "예약인원을 초과하였습니다.\r\n예매완료를 눌러주세요.");
						} else if (arr[x][y] == 1) {
							JOptionPane.showMessageDialog(null,
									"이미 선택한 좌석입니다.\r\n" + (totalperson - count) + "개의 좌석을 더 선택해주세요");
						} else if (arr[x][y] == 2) {
							JOptionPane.showMessageDialog(null, "이미 예약이 완료된 좌석입니다.");
						}
					}
				});
				int empty = 0;
				if (i > 6) {
					empty = 102;
				}
				a.setBounds(empty + 151 + 60 * i, 188 + j * 86, 60, 60);
				if (arr[j][i] == 2) {
					aa++;
					a.setBackground(Color.BLACK);
				} else if (j == 0) {
					a.setBackground(Color.ORANGE);
				} else if (j == 1 || j == 2) {
					a.setBackground(Color.GREEN);
				} else if (j == 3) {
					a.setBackground(Color.RED);
				} else {
					a.setBackground(Color.MAGENTA);
				}

				contentPane.add(a);
			}
		}
		JButton btnNewButton = new JButton("예매완료");
		btnNewButton.setBounds(1111, 446, 150, 60);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (totalperson > count) {
					JOptionPane.showMessageDialog(null, "총 예약인원은" + totalperson + "명입니다.\r\n좌석을 더 선택해주세요.");
				} else {
					OracleTest ot = new OracleTest();
					for (int i = 0; i < arr.length; i++) {
						for (int j = 0; j < arr[i].length; j++) {
							arr[i][j] = 0;
						}
					}
					count = 0;
					try {
						this.finalize();
					} catch (Throwable e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					ot.insertSeat(movieSeq, list);
					dispose();
					setVisible(false);
					new Page6().setVisible(true);
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uC120\uD0DD\uCDE8\uC18C");
		btnNewButton_1.setBounds(1111, 535, 150, 60);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						if (arr[i][j] == 1) {
							arr[i][j] = 0;
						}
					}
				}
				count = 0;
				setVisible(false);
				new Page5().setVisible(true);
			}
		});
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(263, 0, 715, 35);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblScreen = new JLabel("S C R E E N");
		lblScreen.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		lblScreen.setHorizontalAlignment(SwingConstants.CENTER);
		lblScreen.setBounds(245, 0, 225, 35);
		panel.add(lblScreen);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(1313, 57, 35, 200);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(46, 686, 200, 35);
		contentPane.add(panel_2);

		this.setVisible(true);
	}

	public void finalize() {
		try {
			super.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}