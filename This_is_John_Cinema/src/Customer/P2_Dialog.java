package Customer;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Data.Movie_1;
import Data.Movie_2;
import Data.Movie_3;
import Data.Movie_4;
import Data.Movie_5;

public class P2_Dialog extends JFrame {

	private final JPanel contentPanel = new JPanel();
	JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public P2_Dialog() {
		textArea.setBounds(17, 15, 494, 373);
		textArea.setFont(new Font("HY헤드라인M", Font.BOLD, 18));
		setTitle(Data.Movie_1.movie_name);
		setBounds(400, 200, 550, 550);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		JButton btnNewButton = new JButton();
		btnNewButton.setBounds(317, 415, 105, 72);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new Page3().setVisible(true);
			}
		});
		contentPanel.setLayout(null);
		btnNewButton.setIcon(new ImageIcon(P2_Dialog.class.getResource("/images/iconmonstr-arrow-67-72.png")));
		btnNewButton.setBorderPainted(false);	// 외곽선지우기
		btnNewButton.setContentAreaFilled(false); // 채우기안함
		btnNewButton.setFocusPainted(false);
		contentPanel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setBounds(106, 415, 105, 72);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new Page2().setVisible(true);
			}
		});
		contentPanel.setLayout(null);
		btnNewButton_1.setIcon(new ImageIcon(P2_Dialog.class.getResource("/images/iconmonstr-arrow-68-72.png")));
		btnNewButton_1.setBorderPainted(false);	// 외곽선지우기
		btnNewButton_1.setContentAreaFilled(false); // 채우기안함
		btnNewButton_1.setFocusPainted(false);
		contentPanel.add(btnNewButton_1);

		textArea.addMouseListener(new MouseAdapter() {
		});
		if (Page2.MovieCheck == 1) {
			textArea.setText("영화 제목 : " + Movie_1.movie_name + "\r\n상영시간 : " + Movie_1.runtime + "분\r\n장르 : "
					+ Movie_1.movie_genre + "\r\n이용관람가 : " + Movie_1.movie_grade + "\r\n감독 : " + Movie_1.movie_PD
					+ "\r\n출연진 \r\n" + Movie_1.moive_actor);
		} else if (Page2.MovieCheck == 2) {
			textArea.setText("영화 제목 : " + Movie_2.movie_name + "\r\n상영시간 : " + Movie_2.runtime + "분\r\n장르 : "
					+ Movie_2.movie_genre + "\r\n이용관람가 : " + Movie_2.movie_grade + "\r\n감독 : " + Movie_2.movie_PD
					+ "\r\n출연진 \r\n" + Movie_2.moive_actor);
		} else if (Page2.MovieCheck == 3) {
			textArea.setText("영화 제목 : " + Movie_3.movie_name + "\r\n상영시간 : " + Movie_3.runtime + "분\r\n장르 : "
					+ Movie_3.movie_genre + "\r\n이용관람가 : " + Movie_3.movie_grade + "\r\n감독 : " + Movie_3.movie_PD
					+ "\r\n출연진 \r\n" + Movie_3.moive_actor);
		} else if (Page2.MovieCheck == 4) {
			textArea.setText("영화 제목 : " + Movie_4.movie_name + "\r\n상영시간 : " + Movie_4.runtime + "분\r\n장르 : "
					+ Movie_4.movie_genre + "\r\n이용관람가 : " + Movie_4.movie_grade + "\r\n감독 : " + Movie_4.movie_PD
					+ "\r\n출연진 \r\n" + Movie_4.moive_actor);
		} else if (Page2.MovieCheck == 5) {
			textArea.setText("영화 제목 : " + Movie_5.movie_name + "\r\n상영시간 : " + Movie_5.runtime + "분\r\n장르 : "
					+ Movie_5.movie_genre + "\r\n이용관람가 : " + Movie_5.movie_grade + "\r\n감독 : " + Movie_5.movie_PD
					+ "\r\n출연진 \r\n" + Movie_5.moive_actor);
		}

		contentPanel.add(textArea);

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);

		}
	}
}
