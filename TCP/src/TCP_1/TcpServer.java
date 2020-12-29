package TCP_1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

   public static void main(String[] args) throws IOException {
      // TODO Auto-generated method stub
      
      ServerSocket ss1 = new ServerSocket(8899); //listen, 7779는 포트번호(강사님맘대로한거), port no.(21,80(http))-기본,1024까지는 쓰지말자
      System.out.println("전화는 준비되어있음..."); //그리고 얘는 서버니까 accept해야함
      
      //accept
      while(true) { //기다리고있다가 전화가오면 ss1(객체)가 받는데 accept가 받는거(받는용어,명령 둘다 이거)
         System.out.println("전화기다리는중");
         Socket s1 = ss1.accept(); // 여기서 받음 클라이언트에서 사용하는 건 소켓, s1에는 저쪽에서 요청한 클라이언트의 소켓이있음
         System.out.println(s1.getInetAddress()+"에서 전화왔네"); //아이넷어드레스가 내 정보?같은거
         //------파일문법 = 네트워킹문법
         DataOutputStream dos1 //s1은 client 소켓, 네트워크 스트림(아웃풋은 내보내려는 통로)
         = new DataOutputStream(s1.getOutputStream());//클래스이름에 아웃풋인풋이 들어가면 바이트단위.(데이터
         dos1.writeUTF("야 오랜만이네"); //소켓은 네트워킹인데 네트워킹은 문법을 (문자열을 쓸때는 변환작업필요없음, 게다가 데이터아웃풋인풋은
         //------                                                   음악파일,그림파일 전송이 가능함)
         dos1.close();//전화끊는거 server
         s1.close();//전화끊는거 client
               
      }

   }

}