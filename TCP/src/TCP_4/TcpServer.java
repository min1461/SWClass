package TCP_4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss1 = new ServerSocket(37782);
		System.out.println("서버 준비되어 있음");

		while (true) {
			System.out.println("기다리는 중");

			Socket s1 = ss1.accept();
			System.out.println(s1.getInetAddress() + "에서 접속");

			// 지금 하려는 것은 파일을 전송하는 socketting
			// 그림파일 및 음악파일, docx파일등은 바이트 단위 전송을 해야 제대로 감
			// ==> DataInput,DataOutput

			File file1 = new File("C:/workspace_SW/TCP/src/winter.jpg");
			FileInputStream fis1 = new FileInputStream(file1);
			DataInputStream dis1 = new DataInputStream(fis1);
//			DataInputStream L1 = new DataInputStream(new DataInputStream(new FileInputStream(new File("C:/workspace_SW/TCP/src/winter.jpg"))));

			DataOutputStream dos1 = new DataOutputStream(s1.getOutputStream());
			// 즉 winter.jpg를 입력받아 Network로 전송

			// ----------------------------------------------------------------------------
			byte[] byteArr = new byte[(int) file1.length()];
			// 파일의 길이만큼 바이트 배열을 잡음
			System.out.println("file-->byte중....");
			dis1.readFully(byteArr); // 파일내용 --> 바이트배열

			// 길이를 먼저 전송, 내용을 전송
			dos1.writeInt(byteArr.length);// 길이만먼저 전송
			dos1.write(byteArr);// 진짜 배열을 보냄
			System.out.println("전송했당~~");
		}
	}
}
