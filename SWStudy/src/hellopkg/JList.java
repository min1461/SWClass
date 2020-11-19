package hellopkg;
import java.awt.EventQueue;

import javax.swing.AbstractListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JList extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JList frame = new JList();
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
	public JList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 12, 200, 200);
		contentPane.add(scrollPane);
		
		javax.swing.JList list = new javax.swing.JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				int size1 = list.getModel().getSize(); // 전체 index
				int index1 = list.getSelectedIndex();// 선택된 index
				String indexElement1 = (String) list.getModel().getElementAt(index1);
				
				JOptionPane.showMessageDialog(list, "전체갯수는 " + String.valueOf(size1) + "   // 선택 element는 " + indexElement1);
			}
		});
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"축구", "야구", "농구", "배구", "당구"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
	}
}
