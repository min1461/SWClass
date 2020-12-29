package TCP_2;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

class ThreadRcv extends Thread {
	Socket s1;
	DataInputStream dis1;

	ThreadRcv(Socket s1) throws IOException {
		this.s1 = s1;
		dis1 = new DataInputStream(s1.getInputStream());
	}

	public void run() {
		Scanner sc1 = new Scanner(System.in);
		while (dis1 != null) {
			try {
				System.out.println(dis1.readUTF());
			} catch (IOException e) {
//				e.printStackTrace();
			}
		}
	}
}