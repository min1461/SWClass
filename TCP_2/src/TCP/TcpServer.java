package TCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.out.println("사용법은 JAVA 파일명 포트번호");
			System.exit(1);
		}
		// listen
		ServerSocket ss1 = new ServerSocket(Integer.parseInt(args[0]));
		System.out.println("서버 잘 준비됨");

		while (true) {
			System.out.println("미팅 대화 기다리는중");
			Socket s1 = ss1.accept();// connect를 받자

			// 아래는 원래 receive / send가 오는 자리
			// 여기에 thread를 사용
			// 이제는 무전기 방식이 아님
			ThreadSend tsendSer1 = new ThreadSend(s1);// 초기치 // 주거니
			ThreadRcv trcvSer1 = new ThreadRcv(s1);// 받거니를 위해/
			tsendSer1.start();
			trcvSer1.start();
		}
	}
}