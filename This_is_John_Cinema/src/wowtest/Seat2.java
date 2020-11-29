package wowtest;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Seat2 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seat2 frame = new Seat2();
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
	public Seat2() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btn_A01 = new JButton("A1");
		buttonGroup.add(btn_A01);
		btn_A01.setBounds(151, 188, 60, 60);
		btn_A01.setBackground(Color.ORANGE);
		contentPane.add(btn_A01);

		JButton btn_A02 = new JButton("A02");
		buttonGroup.add(btn_A02);
		btn_A02.setBounds(211, 188, 60, 60);
		btn_A02.setBackground(Color.ORANGE);
		contentPane.add(btn_A02);

		JButton btn_A03 = new JButton("A03");
		buttonGroup.add(btn_A03);
		btn_A03.setBounds(271, 188, 60, 60);
		btn_A03.setBackground(Color.ORANGE);
		contentPane.add(btn_A03);

		JButton btn_A04 = new JButton("A04");
		buttonGroup.add(btn_A04);
		btn_A04.setBounds(331, 188, 60, 60);
		btn_A04.setBackground(Color.ORANGE);
		contentPane.add(btn_A04);

		JButton btn_A05 = new JButton("A05");
		buttonGroup.add(btn_A05);
		btn_A05.setBounds(391, 188, 60, 60);
		btn_A05.setBackground(Color.ORANGE);
		contentPane.add(btn_A05);

		JButton btn_A06 = new JButton("A06");
		buttonGroup.add(btn_A06);
		btn_A06.setBounds(451, 188, 60, 60);
		btn_A06.setBackground(Color.ORANGE);
		contentPane.add(btn_A06);

		JButton btn_A07 = new JButton("A07");
		buttonGroup.add(btn_A07);
		btn_A07.setBounds(511, 188, 60, 60);
		btn_A07.setBackground(Color.ORANGE);
		contentPane.add(btn_A07);

		JButton btn_A08 = new JButton("A08");
		buttonGroup.add(btn_A08);
		btn_A08.setBounds(613, 188, 60, 60);
		btn_A08.setBackground(Color.ORANGE);
		contentPane.add(btn_A08);

		JButton btn_A09 = new JButton("A09");
		buttonGroup.add(btn_A09);
		btn_A09.setBounds(673, 188, 60, 60);
		btn_A09.setBackground(Color.ORANGE);
		contentPane.add(btn_A09);

		JButton btn_A10 = new JButton("A10");
		buttonGroup.add(btn_A10);
		btn_A10.setBounds(733, 188, 60, 60);
		btn_A10.setBackground(Color.ORANGE);
		contentPane.add(btn_A10);

		JButton btn_A11 = new JButton("A11");
		buttonGroup.add(btn_A11);
		btn_A11.setBounds(793, 188, 60, 60);
		btn_A11.setBackground(Color.ORANGE);
		contentPane.add(btn_A11);

		JButton btn_A12 = new JButton("A12");
		buttonGroup.add(btn_A12);
		btn_A12.setBounds(853, 188, 60, 60);
		btn_A12.setBackground(Color.ORANGE);
		contentPane.add(btn_A12);

		JButton btn_A13 = new JButton("A13");
		buttonGroup.add(btn_A13);
		btn_A13.setBounds(913, 188, 60, 60);
		btn_A13.setBackground(Color.ORANGE);
		contentPane.add(btn_A13);

		JButton btn_A14 = new JButton("A14");
		buttonGroup.add(btn_A14);
		btn_A14.setBounds(973, 188, 60, 60);
		btn_A14.setBackground(Color.ORANGE);
		contentPane.add(btn_A14);

		JButton btn_B01 = new JButton("B01");
		btn_B01.setBounds(151, 274, 60, 60);
		buttonGroup_1.add(btn_B01);
		btn_B01.setBackground(Color.GREEN);
		contentPane.add(btn_B01);

		JButton btn_B02 = new JButton("B02");
		btn_B02.setBounds(211, 274, 60, 60);
		buttonGroup_1.add(btn_B02);
		btn_B02.setBackground(Color.GREEN);
		contentPane.add(btn_B02);

		JButton btn_B03 = new JButton("B03");
		btn_B03.setBounds(271, 274, 60, 60);
		buttonGroup_1.add(btn_B03);
		btn_B03.setBackground(Color.GREEN);
		contentPane.add(btn_B03);

		JButton btn_B04 = new JButton("B04");
		btn_B04.setBounds(331, 274, 60, 60);
		buttonGroup_1.add(btn_B04);
		btn_B04.setBackground(Color.GREEN);
		contentPane.add(btn_B04);

		JButton btn_B05 = new JButton("B05");
		btn_B05.setBounds(391, 274, 60, 60);
		buttonGroup_1.add(btn_B05);
		btn_B05.setBackground(Color.GREEN);
		contentPane.add(btn_B05);

		JButton btn_B06 = new JButton("B06");
		btn_B06.setBounds(451, 274, 60, 60);
		buttonGroup_1.add(btn_B06);
		btn_B06.setBackground(Color.GREEN);
		contentPane.add(btn_B06);

		JButton btn_B07 = new JButton("B07");
		btn_B07.setBounds(511, 274, 60, 60);
		buttonGroup_1.add(btn_B07);
		btn_B07.setBackground(Color.GREEN);
		contentPane.add(btn_B07);

		JButton btn_B08 = new JButton("B08");
		btn_B08.setBounds(613, 274, 60, 60);
		buttonGroup_1.add(btn_B08);
		btn_B08.setBackground(Color.GREEN);
		contentPane.add(btn_B08);

		JButton btn_B09 = new JButton("B09");
		btn_B09.setBounds(673, 274, 60, 60);
		buttonGroup_1.add(btn_B09);
		btn_B09.setBackground(Color.GREEN);
		contentPane.add(btn_B09);

		JButton btn_B10 = new JButton("B10");
		btn_B10.setBounds(733, 274, 60, 60);
		buttonGroup_1.add(btn_B10);
		btn_B10.setBackground(Color.GREEN);
		contentPane.add(btn_B10);

		JButton btn_B11 = new JButton("B11");
		btn_B11.setBounds(793, 274, 60, 60);
		buttonGroup_1.add(btn_B11);
		btn_B11.setBackground(Color.GREEN);
		contentPane.add(btn_B11);

		JButton btn_B12 = new JButton("B12");
		btn_B12.setBounds(853, 274, 60, 60);
		buttonGroup_1.add(btn_B12);
		btn_B12.setBackground(Color.GREEN);
		contentPane.add(btn_B12);

		JButton btn_B13 = new JButton("B13");
		btn_B13.setBounds(913, 274, 60, 60);
		buttonGroup_1.add(btn_B13);
		btn_B13.setBackground(Color.GREEN);
		contentPane.add(btn_B13);

		JButton btn_B14 = new JButton("B14");
		btn_B14.setBounds(973, 274, 60, 60);
		buttonGroup_1.add(btn_B14);
		btn_B14.setBackground(Color.GREEN);
		contentPane.add(btn_B14);

		JButton btn_C01 = new JButton("C01");
		btn_C01.setBounds(151, 360, 60, 60);
		btn_C01.setBackground(Color.GREEN);
		contentPane.add(btn_C01);

		JButton btn_C02 = new JButton("C02");
		btn_C02.setBounds(211, 360, 60, 60);
		btn_C02.setBackground(Color.GREEN);
		contentPane.add(btn_C02);

		JButton btn_C03 = new JButton("C03");
		btn_C03.setBounds(271, 360, 60, 60);
		btn_C03.setBackground(Color.GREEN);
		contentPane.add(btn_C03);

		JButton btn_C04 = new JButton("C04");
		btn_C04.setBounds(331, 360, 60, 60);
		btn_C04.setBackground(Color.GREEN);
		contentPane.add(btn_C04);

		JButton btn_C05 = new JButton("C05");
		btn_C05.setBounds(391, 360, 60, 60);
		btn_C05.setBackground(Color.GREEN);
		contentPane.add(btn_C05);

		JButton btn_C06 = new JButton("C06");
		btn_C06.setBounds(451, 360, 60, 60);
		btn_C06.setBackground(Color.GREEN);
		contentPane.add(btn_C06);

		JButton btn_C07 = new JButton("C07");
		btn_C07.setBounds(511, 360, 60, 60);
		btn_C07.setBackground(Color.GREEN);
		contentPane.add(btn_C07);

		JButton btn_C08 = new JButton("C08");
		btn_C08.setBounds(613, 360, 60, 60);
		btn_C08.setBackground(Color.GREEN);
		contentPane.add(btn_C08);

		JButton btn_C09 = new JButton("C09");
		btn_C09.setBounds(673, 360, 60, 60);
		btn_C09.setBackground(Color.GREEN);
		contentPane.add(btn_C09);

		JButton btn_C10 = new JButton("C10");
		btn_C10.setBounds(733, 360, 60, 60);
		btn_C10.setBackground(Color.GREEN);
		contentPane.add(btn_C10);

		JButton btn_C11 = new JButton("C11");
		btn_C11.setBounds(793, 360, 60, 60);
		btn_C11.setBackground(Color.GREEN);
		contentPane.add(btn_C11);

		JButton btn_C12 = new JButton("C12");
		btn_C12.setBounds(853, 360, 60, 60);
		btn_C12.setBackground(Color.GREEN);
		contentPane.add(btn_C12);

		JButton btn_C13 = new JButton("C13");
		btn_C13.setBounds(913, 360, 60, 60);
		btn_C13.setBackground(Color.GREEN);
		contentPane.add(btn_C13);

		JButton btn_C14 = new JButton("C14");
		btn_C14.setBounds(973, 360, 60, 60);
		btn_C14.setBackground(Color.GREEN);
		contentPane.add(btn_C14);

		JButton btn_D01 = new JButton("D01");
		btn_D01.setBounds(151, 446, 60, 60);
		btn_D01.setBackground(Color.RED);
		contentPane.add(btn_D01);

		JButton btn_D02 = new JButton("D02");
		btn_D02.setBounds(211, 446, 60, 60);
		btn_D02.setBackground(Color.RED);
		contentPane.add(btn_D02);

		JButton btn_D03 = new JButton("D03");
		btn_D03.setBounds(271, 446, 60, 60);
		btn_D03.setBackground(Color.RED);
		contentPane.add(btn_D03);

		JButton btn_D04 = new JButton("D04");
		btn_D04.setBounds(331, 446, 60, 60);
		btn_D04.setBackground(Color.RED);
		contentPane.add(btn_D04);

		JButton btn_D05 = new JButton("D05");
		btn_D05.setBounds(391, 446, 60, 60);
		btn_D05.setBackground(Color.RED);
		contentPane.add(btn_D05);

		JButton btn_D06 = new JButton("D06");
		btn_D06.setBounds(451, 446, 60, 60);
		btn_D06.setBackground(Color.RED);
		contentPane.add(btn_D06);

		JButton btn_D07 = new JButton("D07");
		btn_D07.setBounds(511, 446, 60, 60);
		btn_D07.setBackground(Color.RED);
		contentPane.add(btn_D07);

		JButton btn_D08 = new JButton("D08");
		btn_D08.setBounds(613, 446, 60, 60);
		btn_D08.setBackground(Color.RED);
		contentPane.add(btn_D08);

		JButton btn_D09 = new JButton("D09");
		btn_D09.setBounds(673, 446, 60, 60);
		btn_D09.setBackground(Color.RED);
		contentPane.add(btn_D09);

		JButton btn_D10 = new JButton("D10");
		btn_D10.setBounds(733, 446, 60, 60);
		btn_D10.setBackground(Color.RED);
		contentPane.add(btn_D10);

		JButton btn_D11 = new JButton("D11");
		btn_D11.setBounds(793, 446, 60, 60);
		btn_D11.setBackground(Color.RED);
		contentPane.add(btn_D11);

		JButton btn_D12 = new JButton("D12");
		btn_D12.setBounds(853, 446, 60, 60);
		btn_D12.setBackground(Color.RED);
		contentPane.add(btn_D12);

		JButton btn_D13 = new JButton("D13");
		btn_D13.setBounds(913, 446, 60, 60);
		btn_D13.setBackground(Color.RED);
		contentPane.add(btn_D13);

		JButton btn_D14 = new JButton("D14");
		btn_D14.setBounds(973, 446, 60, 60);
		btn_D14.setBackground(Color.RED);
		contentPane.add(btn_D14);

		JButton btn_E01 = new JButton("E01");
		btn_E01.setBounds(151, 532, 80, 60);
		btn_E01.setBackground(new Color(255, 153, 255));
		contentPane.add(btn_E01);

		JButton btn_E02 = new JButton("E02");
		btn_E02.setBounds(231, 532, 80, 60);
		btn_E02.setBackground(new Color(255, 153, 255));
		contentPane.add(btn_E02);

		JButton btn_E03 = new JButton("E03");
		btn_E03.setBounds(331, 532, 80, 60);
		btn_E03.setBackground(new Color(255, 153, 255));
		contentPane.add(btn_E03);

		JButton btn_E04 = new JButton("E04");
		btn_E04.setBounds(411, 532, 80, 60);
		btn_E04.setBackground(new Color(255, 153, 255));
		contentPane.add(btn_E04);

		JButton btn_E05 = new JButton("E05");
		btn_E05.setBounds(511, 532, 80, 60);
		btn_E05.setBackground(new Color(255, 153, 255));
		contentPane.add(btn_E05);

		JButton btn_E06 = new JButton("E06");
		btn_E06.setBounds(591, 532, 80, 60);
		btn_E06.setBackground(new Color(255, 153, 255));
		contentPane.add(btn_E06);

		JButton btn_E07 = new JButton("E07");
		btn_E07.setBounds(693, 532, 80, 60);
		btn_E07.setBackground(new Color(255, 153, 255));
		contentPane.add(btn_E07);

		JButton btn_E08 = new JButton("E08");
		btn_E08.setBounds(773, 532, 80, 60);
		btn_E08.setBackground(new Color(255, 153, 255));
		contentPane.add(btn_E08);

		JButton btn_E09 = new JButton("E09");
		btn_E09.setBounds(873, 532, 80, 60);
		btn_E09.setBackground(new Color(255, 153, 255));
		contentPane.add(btn_E09);

		JButton btn_E10 = new JButton("E10");
		btn_E10.setBounds(953, 532, 80, 60);
		btn_E10.setBackground(new Color(255, 153, 255));
		contentPane.add(btn_E10);

		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBounds(151, 0, 882, 20);
		panel.setBackground(Color.GRAY);
		contentPane.add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 12, 15, 150);
		panel_1.setBackground(Color.GRAY);
		contentPane.add(panel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(69, 706, 150, 15);
		panel_2.setBackground(Color.GRAY);
		contentPane.add(panel_2);
	}
}