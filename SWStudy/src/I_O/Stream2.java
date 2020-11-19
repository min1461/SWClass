package I_O;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
 * OutputStreamWriter는 반대형태의 중간역할
 * 
 * input, output -> byte 단위
 * reader,writer -> 문자 단위
 */
public class Stream2 {
	public static void main(String[] args) throws IOException {

		// 키보드 입력을 위해
//		InputStreamReader isr1 = new InputStreamReader(System.in);
//		BufferedReader br1 = new BufferedReader(isr1);
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));	// write하기전에 리더를 생성
//		FileWriter fw = new FileWriter("C://workspace_SW/SWStudy/cc.txt",false);	//	주소값에 해당하는 내용을 write하기위함
		// false를 써서 기존에 저장되어 있는 내용을 지우기 <-> true는 기존 내용을 보존함
//		BufferedWriter bw = new BufferedWriter(fw);		// 임시방을 만들어 쓰는 writer
//		PrintWriter pw = new PrintWriter(bw);	// 줄바꿈이 가능한 writer
//		PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("C://workspace_SW/SWStudy/cc.txt",false)));// Line 24~26 한줄로 생성 가능
		
		System.out.println("저장할 데이터를 입력해주세요(입력끝은 ctrl+z)");
		String s = null;
		while((s = br1.readLine()) !=null){
			pw.println(s);
		}
		pw.flush();
		br1.close();
		pw.close();
	}
}
