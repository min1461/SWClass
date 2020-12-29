package TCP_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpMulClient {
//	전에 만든 send용 thread, recv용 thread는 여기서 사용 안함
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("사용법 : 클라이언트 실행은 \'java 패키지명.파일명 ip주소 포트번호 닉네임\' 형식으로 입력");
			System.exit(1);
		}
		try { // ip주소 //포트번호
			Socket s1 = new Socket(args[0], Integer.parseInt(args[1]));
			System.out.println("서버에 연결");// connect

			// GUI를 전담하는 .JAVA 를 하나로 만들어 거기서 처리하도록 준비
			// .JAVA에서 필요로 하는 내용들을 인자(argument)로 받는다
			// i/o network stream : readUTF() writeUTF() 사용을 위해 준비
			DataOutputStream outputStream = new DataOutputStream(s1.getOutputStream());
			DataInputStream inputStream = new DataInputStream(s1.getInputStream());
			outputStream.writeUTF("##" + args[2]);// 닉네임 먼저 보내는 것은 같다

			// 그래서 GUI로 가자
			// kajaclientGUI.java는 GUI 파일(단, main은 x)
			// client Console -> client GUI
			new KajaClientGUI(outputStream, inputStream, args[2]) {
				public void closework() throws IOException {
					outputStream.close();
					inputStream.close();
					System.exit(0);
				}
			};
		} catch (Exception e) {

		}
	}
}