package Customer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MainHome extends JFrame implements Runnable {

	private JPanel contentPane;
	private JLabel textField;
	private Thread thread;
	private JLabel lblThisIsJohn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainHome frame = new MainHome();
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
	public MainHome() {
		setTitle("3조 영화 예매 키오스크");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);

		if (thread == null) {
			thread = new Thread(this);
			thread.start();
		}

		textField = new JLabel();
		textField.setBounds(293, 275, 762, 133);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("휴먼편지체", Font.BOLD, 40));
		contentPane.add(textField);

		lblThisIsJohn = new JLabel("This is John Cinema");
		lblThisIsJohn.setBounds(345, 164, 657, 121);
		lblThisIsJohn.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisIsJohn.setFont(new Font("Ink Free", Font.BOLD, 60));
		contentPane.add(lblThisIsJohn);

		JButton btnNewButton = new JButton("\uC601\uD654 \uC608\uB9E4");
		btnNewButton.setBounds(800, 410, 228, 63);
		contentPane.add(btnNewButton);
		btnNewButton.setFont(new Font("휴먼편지체", Font.BOLD, 40));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFocusPainted(true);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				setVisible(false);
				new Page2().setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.white);

		JPanel panel = new JPanel() {
			Image background = new ImageIcon(MainHome.class.getResource("/images/MainHome.jpg")).getImage();

			public void paint(Graphics g) {// 그리는 함수
				g.drawImage(background, 0, 0, null);// background를 그려줌
			}
		};
		panel.setBounds(400, 0, 400, 600);// 패널의 위치와 크기.
		getContentPane().add(panel);// 프레임에 패널을 추가.
		panel.setBounds(0, 0, 1348, 721);
		contentPane.add(panel);
		panel.setLayout(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		/* 생성자 중간에 끼워넣어야 하는 코드. */
	}

	@Override
	public void run() {
		while (true) {
			Calendar cal = Calendar.getInstance();
			String now = cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 " + cal.get(Calendar.DATE)
					+ "일 " + cal.get(Calendar.HOUR) + "시 " + cal.get(Calendar.MINUTE) + "분 " + cal.get(Calendar.SECOND)
					+ "초";
			textField.setText(now);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
