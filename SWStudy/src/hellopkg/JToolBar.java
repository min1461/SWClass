package hellopkg;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JToolBar extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	private JLabel lblILoveYou = new JLabel("I love you");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JToolBar frame = new JToolBar();
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
	public JToolBar() {
		setTitle("Blue player");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblILoveYou.setForeground(Color.RED);
			}
		});
		btnNewButton.setIcon(new ImageIcon(JToolBar.class.getResource("/Image/되감기.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(30, 25, 99, 99);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblILoveYou.setFont(lblILoveYou.getFont().deriveFont(25.0f));
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(JToolBar.class.getResource("/Image/일시정지.png")));
		btnNewButton_1.setBounds(417, 25, 99, 99);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblILoveYou.setFont(lblILoveYou.getFont().deriveFont(50.0f));
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(JToolBar.class.getResource("/Image/재생.png")));
		btnNewButton_2.setBounds(288, 25, 99, 99);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblILoveYou.setForeground(Color.GREEN);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(JToolBar.class.getResource("/Image/빨리감기.png")));
		btnNewButton_3.setBounds(159, 25, 99, 99);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(JToolBar.class.getResource("/Image/온오프.png")));
		btnNewButton_4.setBounds(546, 25, 99, 99);
		contentPane.add(btnNewButton_4);
		
		lblILoveYou = new JLabel("I love you");
		lblILoveYou.setFont(new Font("굴림", Font.PLAIN, 25));
		lblILoveYou.setBounds(101, 178, 500, 80);
		contentPane.add(lblILoveYou);
	}
}
