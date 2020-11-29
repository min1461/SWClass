package Customer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		setBounds(100, 100, 700, 768);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		comboBox.setBackground(SystemColor.control);
		comboBox.setForeground(Color.BLACK);

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
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox.setBounds(100, 241, 190, 37);
		contentPane.add(comboBox);
		comboBox_1.setBackground(SystemColor.control);

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
		comboBox_1.setBounds(390, 241, 188, 37);
		contentPane.add(comboBox_1);

		JButton btnNewButton = new JButton();
		btnNewButton.setBounds(422, 570, 90, 72);
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
		}});
		contentPane.setLayout(null);
		btnNewButton.setIcon(new ImageIcon(P2_Dialog.class.getResource("/images/iconmonstr-arrow-67-72.png")));
		btnNewButton.setBorderPainted(false);	// 외곽선지우기
		btnNewButton.setContentAreaFilled(false); // 채우기안함
		btnNewButton.setFocusPainted(false);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setBounds(166, 570, 90, 72);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new Page3().setVisible(true);
			}
		});
		contentPane.setLayout(null);
		btnNewButton_1.setIcon(new ImageIcon(P2_Dialog.class.getResource("/images/iconmonstr-arrow-68-72.png")));
		btnNewButton_1.setBorderPainted(false);	// 외곽선지우기
		btnNewButton_1.setContentAreaFilled(false); // 채우기안함
		btnNewButton_1.setFocusPainted(false);
		contentPane.add(btnNewButton_1);
		textArea.setBackground(SystemColor.control);


		textArea.setFont(new Font("HY헤드라인M", Font.BOLD, 30));
		textArea.setBounds(99, 399, 479, 84);
		contentPane.add(textArea);
		
		lblNewLabel = new JLabel("성인");
		lblNewLabel.setBackground(SystemColor.control);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("HY헤드라인M", Font.BOLD, 30));
		lblNewLabel.setBounds(99, 83, 190, 75);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("청소년");
		lblNewLabel_1.setBackground(SystemColor.control);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("HY헤드라인M", Font.BOLD, 30));
		lblNewLabel_1.setBounds(388, 83, 190, 75);
		contentPane.add(lblNewLabel_1);
		
//		JPanel panel = new JPanel() {
//			Image background = new ImageIcon(MainHome.class.getResource("/images/hand-308374_1280.png")).getImage();
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
