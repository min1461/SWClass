package KKO_Source;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {//이프로그램을 베이스로 채팅만들기하는거

   public static void main(String[] args) throws UnknownHostException, IOException {
      // TODO Auto-generated method stub
                             //ip address, port no
      Socket s1 = new Socket("127.0.0.1", 8899);//서버는 아이피주소가없어, 클라이언트만 알고있음 클라이언트한텐 이게 컨넥트
                             //여기아이피주소가 나자신(일단 1인2역)
      /////////////////////////////////////////////////////////
      DataInputStream dis1
      = new DataInputStream(s1.getInputStream());
      System.out.println("네 말대로"+ dis1.readUTF());
      /////////////////////////////////////////////////////////      
      dis1.close();
      s1.close();
      System.out.println("전화끊어짐");

   }

}