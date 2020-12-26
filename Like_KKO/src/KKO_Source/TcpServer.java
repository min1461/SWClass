package KKO_Source;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) throws IOException {
//		port no.(21,80)-1024
		ServerSocket ss1 = new ServerSocket(7779);
		System.out.println("전화는 준비되어 있음....");

		while (true) {
			System.out.println("전화기다리는중....");
			Socket s1 = ss1.accept();// accept-받는것
//			s1이면 상대방 socket이 들어있다.
			System.out.println(s1.getInetAddress() + "에서 전화왔네");
//			------------------------------------------------------
//			파일 문법 = 네트워킹 문법이랑 거의 같은 방식
//			Network Stream ┐
			DataOutputStream dos1 = new DataOutputStream(s1.getOutputStream());
//			Output - 바이트단위(음악,그림파일전송이 가능)
			dos1.writeUTF("야~~ 오랜만이네");
//			------------------------------------------------------
			dos1.close();// close
			s1.close();
		}
	}
}