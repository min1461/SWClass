package TCP_4;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s1 = new Socket("127.0.0.1", 37782);
		DataInputStream dis1 = new DataInputStream(s1.getInputStream());

		// ----------------------------------------------------------------------------
		int len1 = dis1.readInt();
		byte[] byteArr2 = new byte[len1];
		dis1.readFully(byteArr2);
		
		FileOutputStream fos1 = new FileOutputStream("C:/workspace_SW/TCP/src/winter_copy.jpg");
		fos1.write(byteArr2);
		
		System.out.println("끄읕~~~~~");
	}
}
