package Customer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Page4 extends JFrame {

	private JPanel contentPane;
	JComboBox comboBox = new JComboBox();
	JComboBox comboBox_1 = new JComboBox();
	JTextArea textArea = new JTextArea();

	public static String adult;
	public static String child;
	public static int totalperson;
	public static int dateCheck = Page3.dateCheck;
	public static int timeCheck = Page3.timeCheck;
	public static int MovieCheck = Page2.MovieCheck;
	public static String here = String.valueOf(MovieCheck);
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	private JLabel textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page4 frame = new Page4();
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
	public Page4() {
		setTitle("인원을 선택하세요");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 768);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		contentPane.setLayout(null);
		contentPane.setLayout(null);

		textField = new JLabel();
		textField.setBounds(149, 87, 117, 20);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("HY견고딕", Font.PLAIN, 16));
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.BLACK);
		contentPane.add(textField);

		lblNewLabel = new JLabel("성인");
		lblNewLabel.setBounds(32, 147, 160, 48);
		contentPane.add(lblNewLabel);
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setBackground(SystemColor.control);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("HY헤드라인M", Font.BOLD, 30));

		lblNewLabel_1 = new JLabel("청소년");
		lblNewLabel_1.setBounds(224, 147, 160, 48);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setBackground(SystemColor.control);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("HY헤드라인M", Font.BOLD, 30));
		comboBox.setBounds(32, 226, 160, 37);
		contentPane.add(comboBox);
		comboBox.setBackground(Color.BLACK);
		comboBox.setForeground(Color.ORANGE);

		comboBox.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox_1.getSelectedItem().equals("0")) {
					textArea.setText("성인의 인원수는 " + comboBox.getSelectedItem() + "명 입니다.");
					totalperson = Integer.parseInt((String) comboBox.getSelectedItem());
					adult = (String) comboBox.getSelectedItem();
					child = "0";
				} else if (comboBox.getSelectedItem().equals("0")) {
					textArea.setText("청소년의 인원수는 " + comboBox_1.getSelectedItem() + "명 입니다.");
					totalperson = Integer.parseInt((String) comboBox_1.getSelectedItem());
					child = (String) comboBox_1.getSelectedItem();
					adult = "0";
				} else {
					textArea.setText("성인의 인원수는 " + comboBox.getSelectedItem() + "명 입니다." + "\n" + "청소년의 인원수는 "
							+ comboBox_1.getSelectedItem() + "명 입니다.");
					totalperson = Integer.parseInt((String) comboBox.getSelectedItem())
							+ Integer.parseInt((String) comboBox_1.getSelectedItem());
					adult = (String) comboBox.getSelectedItem();
					child = (String) comboBox_1.getSelectedItem();
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));
		comboBox_1.setBounds(224, 226, 160, 37);
		contentPane.add(comboBox_1);
		comboBox_1.setForeground(Color.ORANGE);
		comboBox_1.setBackground(Color.BLACK);

		comboBox_1.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		comboBox_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (comboBox_1.getSelectedItem().equals("0")) {
					textArea.setText("성인의 인원수는 " + comboBox.getSelectedItem() + "명 입니다.");
					totalperson = Integer.parseInt((String) comboBox.getSelectedItem());
					adult = (String) comboBox.getSelectedItem();
					child = "0";
				} else if (comboBox.getSelectedItem().equals("0")) {
					textArea.setText("청소년의 인원수는 " + comboBox_1.getSelectedItem() + "명 입니다.");
					totalperson = Integer.parseInt((String) comboBox_1.getSelectedItem());
					child = (String) comboBox_1.getSelectedItem();
					adult = "0";
				} else {
					textArea.setText("성인의 인원수는 " + comboBox.getSelectedItem() + "명 입니다." + "\n" + "청소년의 인원수는 "
							+ comboBox_1.getSelectedItem() + "명 입니다.");
					totalperson = Integer.parseInt((String) comboBox.getSelectedItem())
							+ Integer.parseInt((String) comboBox_1.getSelectedItem());
					adult = (String) comboBox.getSelectedItem();
					child = (String) comboBox_1.getSelectedItem();
				}
			}
		});

		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));
		textArea.setBounds(32, 410, 352, 84);
		contentPane.add(textArea);
		textArea.setForeground(Color.ORANGE);
		textArea.setBackground(Color.BLACK);

		textArea.setFont(new Font("HY헤드라인M", Font.BOLD, 24));

		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setBounds(70, 655, 60, 60);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new Page3().setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Page2_Dialog.class.getResource("/images/iconmonstr-arrow-68-72.png")));
		btnNewButton_1.setBorderPainted(false); // 외곽선지우기
		btnNewButton_1.setContentAreaFilled(false); // 채우기안함
		btnNewButton_1.setFocusPainted(false);

		JButton btnNewButton = new JButton();
		btnNewButton.setBounds(285, 655, 60, 60);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (totalperson == 0) {
					JOptionPane.showMessageDialog(null, "인원을 선택하세요.");
				} else {
					dispose();
					setVisible(false);
					new Page5(totalperson).setVisible(true);
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(Page2_Dialog.class.getResource("/images/iconmonstr-arrow-67-72.png")));
		btnNewButton.setBorderPainted(false); // 외곽선지우기
		btnNewButton.setContentAreaFilled(false); // 채우기안함
		btnNewButton.setFocusPainted(false);

		JPanel panel = new JPanel() {
			Image background = new ImageIcon(Page4.class.getResource("/images/itest__.png")).getImage();

			public void paint(Graphics g) {// 그리는 함수
				g.drawImage(background, 0, 0, null);// background를 그려줌
			}
		};
		panel.setBounds(0, 0, 418, 728);
		contentPane.add(panel);
		panel.setLayout(null);

//		JPanel panel = new JPanel() {
//			Image background = new ImageIcon(Page4.class.getResource("/images/hand-308374_1280.png")).getImage();
//
//			public void paint(Graphics g) {// 그리는 함수
//				g.drawImage(background, 0, 0, null);// background를 그려줌
//			}
//		};
//		panel.setBounds(400, 0, 400, 600);// 패널의 위치와 크기.
//		getContentPane().add(panel);// 프레임에 패널을 추가.
//		panel.setBounds(0, 0, 678, 712);
//		contentPane.add(panel);
//		panel.setLayout(null);

	}
}
