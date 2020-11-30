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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Page1 extends JFrame implements Runnable {

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
					Page1 frame = new Page1();
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
	public Page1() {
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
		textField.setFont(new Font("휴먼편지체", Font.BOLD | Font.ITALIC, 40));
		contentPane.add(textField);

		lblThisIsJohn = new JLabel("This is John Cinema");
		lblThisIsJohn.setBounds(345, 164, 657, 121);
		lblThisIsJohn.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisIsJohn.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 60));
		contentPane.add(lblThisIsJohn);

		JButton btnNewButton = new JButton("\uC601\uD654 \uC608\uB9E4");
		btnNewButton.setBounds(800, 410, 228, 63);
		contentPane.add(btnNewButton);
		btnNewButton.setFont(new Font("휴먼편지체", Font.BOLD | Font.ITALIC, 40));
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
			Image background = new ImageIcon(Page1.class.getResource("/images/MainHome.jpg")).getImage();

			public void paint(Graphics g) {// 그리는 함수
				g.drawImage(background, 0, 0, null);// background를 그려줌
			}
		};
		panel.setBounds(400, 0, 400, 600);// 패널의 위치와 크기.
		getContentPane().add(panel);// 프레임에 패널을 추가.
		panel.setBounds(0, 0, 1348, 721);
		contentPane.add(panel);
		panel.setLayout(null);

	}

	@Override
	public void run() {
		while (true) {
			Calendar cal = Calendar.getInstance();
			String now = String.format("%04d", cal.get(Calendar.YEAR)) + "년 " 
					+ String.format("%02d", (cal.get(Calendar.MONTH) + 1)) + "월 "
					+ String.format("%02d", cal.get(Calendar.DATE)) + "일 "
					+ String.format("%02d", cal.get(Calendar.HOUR)) + "시 "
					+ String.format("%02d", cal.get(Calendar.MINUTE)) + "분 "
					+ String.format("%02d", cal.get(Calendar.SECOND)) + "초";
			textField.setText(now);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}