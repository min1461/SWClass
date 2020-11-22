	package NameSearch;

/*
 * 자바 <------>DB
 * 드라이버프로그램(ojdbc6.jar) jdk 
 */
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class NameSearch extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NameSearch frame = new NameSearch();
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
	public NameSearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("검색할 이름");
		label.setBounds(14, 12, 130, 47);
		contentPane.add(label);

		textField = new JTextField();
		textField.setBackground(Color.GRAY);
		textField.setBounds(112, 23, 116, 24);
		contentPane.add(textField);
		textField.setColumns(10);

		btnNewButton = new JButton("검색");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton) {
					try {
						kaja();
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}

			private void kaja() throws ClassNotFoundException, SQLException {
				textArea.setText("");
				textField_1.setText("");
				Connection con = null;

				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
				textField_1.setText("db에 접속되었습니다.");

				String sql = "select first_name, last_name,phone_number" + "from emplyees" + "where first_name?";

				PreparedStatement st = con.prepareStatement(sql);

				st.setString(1, textField.getText());
				ResultSet rs = st.executeQuery();// String str1 = ";

				String str1 = String.format("%20s\t%2ts\n\n", "[이 름]", "전화번호");
				if (rs.next()) {
					do {
						String fname = rs.getString(1);// firstname
						String lname = rs.getString(2);// lastname
						String phone = rs.getString(3);// phone number
						// str1 += fname+ " " + lname + "\t" +phone+"\n";
						str1 += String.format("%-20s%-20s%-20s\n", fname, lname, phone);
					} while (rs.next()); /////
					textArea.setText(str1);
				} else {
					textArea.setText("그런 이름은 없습니다");
					// tf2.setText("db접속해제");
					con.close();
				}
			}
		});

		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(355, 22, 145, 24);
		contentPane.add(btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 65, 484, 361);
		contentPane.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setBackground(Color.LIGHT_GRAY);

		textField_1 = new JTextField();
		textField_1.setBackground(Color.GREEN);
		textField_1.setBounds(24, 463, 484, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
