package TCP;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

class ThreadSend extends Thread {
	Socket s1;// from client
	DataOutputStream dos1; // out -> "방가방가"를 보낼것이므로
//	기본데이터 타입 별로 처리하기 (예) writeInt, writeUTF(문자열처리)
	String what1;

	ThreadSend(Socket s1) throws IOException {
		this.s1 = s1; // s1받아서 s1필드(this.s1)에 넣기
		dos1 = new DataOutputStream(s1.getOutputStream()); // send를 위한 i/o 스트림

		what1 = "미팅중==>"; // 대화시 앞에 붙는 단어
	}

	public void run() {
		Scanner sc1 = new Scanner(System.in);
		while (dos1 != null) {
			try {
				dos1.writeUTF(what1 + sc1.nextLine());
//				writeUTF를 쓰게되면 dataoutputstream으로 그림도 같이 보낼수 있기때문에
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
