package GUI;
/*
 * GUI(Graphic User Interface)
 * 
 * AWT(Abstract Windowing Toolkit)
 *  - system 중심
 *  - 시스템 gui의 영향을 받으므로 화면출력에 일관성이 없다
 *  - 중량 component(import java.awt.*;)
 *  \
 * SWING 
 *  - JVM 중심
 *  - 화면출력에 일관성이 있다 
 *  - 경량 component(j가 접두사, import javax.swing.*;)
 *  \
 * JavaFX
 *  - 임베디드까지 고려(자바, fxm1)
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteGUI {
	public static void main(String[] args) throws IOException {
		/*
		 * main()을 호출한 JVM에게 예외를 던짐, JVM이 처리함
		 */
		int tmp = 0; // 'a' ==> 문자 상수 (문자 A이면서 동시에 ASCII 65) // tmp = 임시방
		FileInputStream fis1 = null;//읽기
		FileOutputStream fos1 = null;//쓰기

		if (args.length >= 2) {
//			fis1 = new FileInputStream(args[0]);// open
//			fos1 = new FileOutputStream(args[1], false);// open
			fis1 = new FileInputStream("src/GUI/aa.jpg");// read
			fos1 = new FileOutputStream("src/GUI/bb.jpg", false);// write
			// 명령행인자 aa.jpg bb.jpg
		}

		while ((tmp = fis1.read()) != -1) {
			// read() 괄호안이 비어있으면 한 바이트 단위로 처리
			fos1.write(tmp);
			System.out.println(tmp + "나 지금 복사중인데~");
		}
		fis1.close();
		fos1.close();
	}
}