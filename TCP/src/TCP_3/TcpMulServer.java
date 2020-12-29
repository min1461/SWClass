package TCP_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

class ServerClass {
	ArrayList<ThreadServerClass> threadList = new ArrayList<ThreadServerClass>();
	Socket socket;
	DataOutputStream DataOutputStream;

	public ServerClass(int portno) throws IOException {
		Socket s1 = null;

//		ServerSocket ss1 = new ServerSocket(6788);
		ServerSocket ss1 = new ServerSocket(portno);
		System.out.println("서버 가동...");

		while (true) {
			s1 = ss1.accept();
			System.out.println("접속주소 : " + s1.getInetAddress() + " , 접속포트 : " + s1.getPort());
			ThreadServerClass tServer1 = new ThreadServerClass(s1);
			tServer1.start();

			threadList.add(tServer1);// 컬렉션에 add
			System.out.println("접속자수 : " + threadList.size() + " 명");
		} // while문의 끝
	}

	// 접속중인 쓰레드에게 chat 내용 보냄
	public void sendChat(String chat) throws IOException {
		for (int i = 0; i < threadList.size(); i++) {
			threadList.get(i).OutputStream.writeUTF(chat);
			// 처음에 nickname이 채팅을하는 모든사람에게 전송(서버가하는일)
		}
	}
	
	class ThreadServerClass extends Thread {
		Socket socket1;
		DataInputStream inputStream;
		DataOutputStream OutputStream;

		public ThreadServerClass(Socket s1) throws IOException {
			socket1 = s1;
			inputStream = new DataInputStream(s1.getInputStream());
			OutputStream = new DataOutputStream(s1.getOutputStream());
		}

		public void run() {
			String nickname = "";
			try {
				if (inputStream != null) {
					nickname = inputStream.readUTF();
					sendChat(nickname + " 님 입장~~");
				}
				while (inputStream != null) {
//				System.out.println(inputStream.readUTF());
					sendChat(inputStream.readUTF());
					// 클라이언트가 보낸 채팅 내용을 접속한 모두에게 보냄
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				// 나간 쓰레드의 인덱스 찾기
				for (int i = 0; i < threadList.size(); i++) {
					if (socket1.equals(threadList.get(i).socket1)) {
						// 소켓의 주인을 찾아서~
						threadList.remove(i);// 소켓의 주인은 ~nickname
						try {
							sendChat(nickname + " 님 퇴장~~~~");
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
				System.out.println("접속자 수 : " + threadList.size() + " 명");
			} // finally-end
		}// run-end
	}// ThreadServerClass-end
}// Server Class-end

public class TcpMulServer {
	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.out.println("사용법 : 서버실행은 \'java 패키지명 .파일 포트번호\' 형식으로 입력");
		}
//		new ServerClass();
		new ServerClass(Integer.parseInt(args[0]));

	}
}
