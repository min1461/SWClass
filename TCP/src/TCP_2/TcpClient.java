package TCP_2;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		if (args.length != 2) {
			System.out.println("사용법은 java 파일명 ip주소 포트번호");
			System.exit(1);
		}

		Socket s1 = new Socket(args[0], Integer.parseInt(args[1]));
							// adress , port no.

		// recv, send => 무전기가 안되려면 thread로 작성해야함
		// 미리 작성해두었으므로 객체로 생성하여 불러오기만 하면 된다.

		ThreadSend tsendcli1 = new ThreadSend(s1);

		ThreadRcv trcvcli1 = new ThreadRcv(s1);
		tsendcli1.start();
		trcvcli1.start();
	}
}