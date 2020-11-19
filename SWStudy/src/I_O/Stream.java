package I_O;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * file
 * Stream : byte Stream / 문자 Stream
 * 				input / output Stream
 * input output Stream이 들어가 있으면 바이트 없으면 문자
 * 
 * file을 처리하는 로직(text viewer 의 경우)
 * open (owner)
 * read(write)
 * 화면출력
 * close(free)
 */
public class Stream {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C://workspace_SW/SWStudy/aa.txt"); // -> Open
		/*
		 * (참고)
		 * input, output Stream이 보이면 바이트Stream
		 * reader, writer 가 보이면 문자 Stream
		 */
		BufferedReader br = new BufferedReader(fr);
		/*
		 * 임시방에 버퍼링 한 후 한줄 처리(효과적인 파일 저장을 위한 방법)
		 * read는 파일에서 읽어서 to 기억창고(변수)
		 * write는 키보드 등으로 입력하여 to 파일에
		 */
		
		//BufferedReader br = new BufferedReader(new FileReader("C://workspace_SW/SWStudy/aa.txt"));
		
		String s = null;
		//file read - 화면출력(write) //byte readInt
		while((s=br.readLine())!= null) {
			System.out.println((s));
		}
		br.close();
		fr.close();

	}
}
