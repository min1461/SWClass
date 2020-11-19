package hellopkg;
/*
 * WindowBuilder(Swing)
 *  - WindoBuilder란? <--> SceneBuilder(JavaFx)(.fxml)
 *  
 *  	#. UI를 관리하게 해주는 TOOL
 *  	#. 디자인을 해주면 자바소스가 자동생성(gui의 swing이 중심)
 *  		필요시 직접 입력 수정가능하다.
 */

/*
 * absolute layout : 내맘대로 레이아웃
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class WindowBuilder extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilder frame = new WindowBuilder();
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
	public WindowBuilder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("페인트 통");
		button.setIcon(new ImageIcon(WindowBuilder.class.getResource("/Image/페인트통.PNG")));
		button.setBounds(48, 39, 243, 120);
		contentPane.add(button);
	}
}
