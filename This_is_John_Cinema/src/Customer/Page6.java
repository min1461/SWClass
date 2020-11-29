package Customer;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Data.Movie_1;
import Data.Movie_2;
import Data.Movie_3;
import Data.Movie_4;
import Data.Movie_5;

public class Page6 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public int totalperson = Page4.totalperson;
	public static int count;
	public static String adult = Page4.adult;
	public static String child = Page4.child;
	public static int dateCheck = Page3.dateCheck;
	public static int timeCheck = Page3.timeCheck;
	public static int MovieCheck = Page2.MovieCheck;
	public static String here = String.valueOf(MovieCheck) + String.valueOf(timeCheck) + String.valueOf(dateCheck)
			+ adult + child;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Page6() {
		adult = Page4.adult;
		child = Page4.child;
		dateCheck = Page3.dateCheck;
		timeCheck = Page3.timeCheck;
		MovieCheck = Page2.MovieCheck;
		Movie_1 m1 = new Movie_1();
		Movie_2 m2 = new Movie_2();
		Movie_3 m3 = new Movie_3();
		Movie_4 m4 = new Movie_4();
		Movie_5 m5 = new Movie_5();
		setTitle("예매 완료");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("굴림", Font.BOLD, 25));
		textField.setText("\uC601\uD654 \uC608\uB9E4\uAC00 \uC644\uB8CC\uB418\uC5C8\uC2B5\uB2C8\uB2E4");
		textField.setBounds(271, 27, 772, 66);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		if (MovieCheck == 1) {			
			textArea.setText("\t\t\t\t영화입장권" + "\r\n\r\n\r\n\r\n영화제목: " + m1.movie_name + "\r\n" + m1.movie_grade + "\r\n날짜 : 2020"
					+ dateCheck + " \r\n상영시간 : " + m1.runtime + "분" + "\r\n" + MovieCheck + "관" 
					+ "\r\n" + "총인원 : " + totalperson + "명" + "\r\n\r\n\r\n\r\n\r\n\t\t\t즐거운 관람되세요~");
		} else if (MovieCheck == 2) {
			textArea.setText("\t\t\t\t영화입장권" + "\r\n\r\n\r\n\r\n영화제목: " + m2.movie_name + "\r\n" + m2.movie_grade + "\r\n날짜 : 2020"
					+ dateCheck + " \r\n상영시간 : " + m2.runtime + "분" + "\r\n" + MovieCheck + "관" 
					+ "\r\n" + "총인원 : " + totalperson + "명" + "\r\n\r\n\r\n\r\n\r\n\t\t\t즐거운 관람되세요~");			
		} else if (MovieCheck == 3) {			
			textArea.setText("\t\t\t\t영화입장권" + "\r\n\r\n\r\n\r\n영화제목: " + m3.movie_name + "\r\n" + m3.movie_grade + "\r\n날짜 : 2020"
					+ dateCheck + " \r\n상영시간 : " + m3.runtime + "분" + "\r\n" + MovieCheck + "관" 
					+ "\r\n" + "총인원 : " + totalperson + "명" + "\r\n\r\n\r\n\r\n\r\n\t\t\t즐거운 관람되세요~");
		} else if (MovieCheck == 4) {
			textArea.setText("\t\t\t\t영화입장권" + "\r\n\r\n\r\n\r\n영화제목: " + m4.movie_name + "\r\n" + m4.movie_grade + "\r\n날짜 : 2020"
					+ dateCheck + " \r\n상영시간 : " + m4.runtime + "분" + "\r\n" + MovieCheck + "관" 
					+ "\r\n" + "총인원 : " + totalperson + "명" + "\r\n\r\n\r\n\r\n\r\n\t\t\t즐거운 관람되세요~");			
		} else {
			textArea.setText("\t\t\t\t영화입장권" + "\r\n\r\n\r\n\r\n영화제목: " + m5.movie_name + "\r\n" + m5.movie_grade + "\r\n날짜 : 2020"
					+ dateCheck + " \r\n상영시간 : " + m5.runtime + "분" + "\r\n" + MovieCheck + "관" 
					+ "\r\n" + "총인원 : " + totalperson + "명" + "\r\n\r\n\r\n\r\n\r\n\t\t\t즐거운 관람되세요~");
			
		}
		textArea.setBounds(271, 122, 772, 557);
		contentPane.add(textArea);

		JButton btn_home = new JButton("");
		btn_home.setIcon(new ImageIcon(Page6.class.getResource("/images/iconmonstr-home-6-64.png")));
		btn_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				totalperson =0;
				count=0;
				adult = "0";
				child = "0";
				dateCheck = 0;
				timeCheck = 0;
				MovieCheck = Page2.MovieCheck;
				String here = "";
				dispose();
				setVisible(false);
				new MainHome().setVisible(true);
			}
		});
		btn_home.setBounds(1210, 629, 82, 72);
		btn_home.setBorderPainted(false);
		btn_home.setContentAreaFilled(false);
		btn_home.setFocusPainted(false);
		contentPane.add(btn_home);
	}
}
