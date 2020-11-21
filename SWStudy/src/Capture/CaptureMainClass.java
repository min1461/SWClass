package Capture;

import java.awt.AWTException;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

class CaptureClass extends JFrame {
	// GUI
	private Button b1 = new Button("전체화면 캡쳐");
	Robot robot1;
	// 자바가 os의 키보드 마우스 제어권한을 얻어보자
	Dimension totWin1;
	// 컴포넌트의 너비,높이를 저장하는 종이박스
	// java.awt.Diension
	Rectangle rect1;
	BufferedImage bImage1;

	public CaptureClass() throws IOException, AWTException {// 생성자
		add(b1);
		b1.setVisible(true);
		//
		robot1 = new Robot();
		totWin1 = Toolkit.getDefaultToolkit().getScreenSize();
		rect1 = new Rectangle((int) totWin1.getWidth(), (int) totWin1.getHeight());

		// 캡쳐하는
		bImage1 = robot1.createScreenCapture(rect1);
		ImageIO.write(bImage1, "jpg", new File("C:\\workspace_SW\\SWStudy\\aa.jpg"));
		setSize(200, 200);
		setVisible(true);
	}// 생성자-end
}// class-end

public class CaptureMainClass {// CaptureMainClass.java
	public static void main(String[] args) throws IOException, AWTException {
		new CaptureClass();
	}
}