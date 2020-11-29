package wowtest;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Seat extends JFrame {

	private JPanel contentPane;
	private int[][] arr = new int[5][14];//좌석 전체

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seat frame = new Seat();
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
	public Seat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		JButton btnNewButton2 = new JButton("");
//		btnNewButton2.setBounds(234, 121, 60, 60);
////		시작시간-Date = 음수
//		contentPane.add(btnNewButton2);
//		btnNewButton2.setIcon(new ImageIcon(Seat.class.getResource("/images/3.jpg")));
//		btnNewButton2.setVisible(true);

		JButton btnNewButton = new JButton("");
		String Chair1 = "A05";
		arr[SeatArrayLine(Chair1)][SeatArrayNum(Chair1)] = 1; // 누른거 테스트
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				arr[SeatArrayLine(Chair1)][SeatArrayNum(Chair1)]=1; // 처음 1회 눌렀을때
//				arr[SeatArrayLine(Chair1)][SeatArrayNum(Chair1)]=0; // 다시 눌렀을때
			}
		});
		btnNewButton.setBounds(234, 121, 60, 60);
		contentPane.add(btnNewButton);
		if (arr[SeatArrayLine(Chair1)][SeatArrayNum(Chair1)] == 0) {
			btnNewButton.setIcon(new ImageIcon(Seat.class.getResource("/images/2.jpg")));
		} else {// 1
			btnNewButton.setIcon(new ImageIcon(Seat.class.getResource("/images/4.jpg")));
		}
	}

	/* 좌석별 배열좌표 */
	protected int SeatArrayNum(String chair) {
		int j = Integer.parseInt((chair.substring(1)));
		return j;
	}

	protected int SeatArrayLine(String chair) {
		int i;
		if (chair.charAt(0) == 'A') {
			i = 0;
		} else if (chair.charAt(0) == 'B') {
			i = 1;
		} else if (chair.charAt(0) == 'C') {
			i = 2;
		} else if (chair.charAt(0) == 'D') {
			i = 3;
		} else {
			i = 4;
		}
		return i;
	}
}
