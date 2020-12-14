package Test20201203;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class RightClass extends JFrame implements ActionListener {

	private JPanel contentPane;

	JTextPane ListPane = new JTextPane();

	JButton jb1 = new JButton("예");
	JButton jb2 = new JButton("아니오");

	public RightClass() {
		setTitle("확인하세요");

		setLayout(new GridLayout(0, 3, 30, 30));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(ListPane);
		contentPane.add(jb1);
		contentPane.add(jb2);
		
		ListPane.setText(GoodBurger.MSG);
		
		jb1.addActionListener(this);
		getContentPane().add(jb1);
		jb2.addActionListener(this);
		getContentPane().add(jb2);

		ListPane.setBounds(35,20, 300, 160);
		jb1.setBounds(50, 200, 60, 30);
		jb2.setBounds(250, 200, 60, 30);

		setSize(400, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb1) {
			dispose();
			setVisible(false);
			GoodBurger.List = "";
			GoodBurger.Price = 0;
			GoodBurger.Count = 0;

		}
		if (e.getSource() == jb2) {
			JOptionPane.showMessageDialog(jb2, "취소되었습니다.");
			dispose();
			setVisible(false);
			GoodBurger.List = "";
			GoodBurger.Price = 0;
			GoodBurger.Count = 0;
		}
	}
}
