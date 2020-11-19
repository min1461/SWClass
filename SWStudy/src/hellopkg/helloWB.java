package hellopkg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class helloWB extends JFrame {

	private JPanel contentPane;
	JLabel lblNewlabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					helloWB frame = new helloWB();
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
	public helloWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnKeyDown = new JButton("눌러봐");
		btnKeyDown.setForeground(Color.PINK);
		btnKeyDown.setBackground(Color.YELLOW);
		btnKeyDown.addActionListener(new ActionListener() {// 누르면 액션가동
			public void actionPerformed(ActionEvent e) {// 이벤트 액션섹터
				lblNewlabel.setText("Hello WB");
			}
		});
		btnKeyDown.setBounds(189, 122, 147, 71);
		contentPane.add(btnKeyDown);

		lblNewlabel = new JLabel("");
		lblNewlabel.setBackground(Color.PINK);
		lblNewlabel.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewlabel.setBounds(27, 25, 133, 52);
		contentPane.add(lblNewlabel);
	}
}
