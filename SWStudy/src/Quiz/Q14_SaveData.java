package Quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Q14_SaveData {
//  카피하기
//  1. 오픈 2개(aa, cofy)
//  2. aa를 읽고 copy에 넣는다.
	public static void main(String[] args) throws IOException {
		System.out.println("카피중");
		String s = null;

		// String tmp = a;
		BufferedReader br3 = new BufferedReader(new FileReader("C://workspace_SW/SWStudy/aa.txt"));
		PrintWriter pw3 = new PrintWriter(new FileWriter("C://workspace_SW/SWStudy/tmp.txt", false));
		while ((s = br3.readLine()) != null) {
			pw3.println(s);
		}
//		pw.flush();
		br3.close();
		pw3.close();

		// String a = b;
		BufferedReader br1 = new BufferedReader(new FileReader("C://workspace_SW/SWStudy/bb.txt"));
		PrintWriter pw1 = new PrintWriter(new FileWriter("C://workspace_SW/SWStudy/aa.txt", false));
		while ((s = br1.readLine()) != null) {
			pw1.println(s);
		}
		br1.close(); 
		pw1.close();

		// String b = tmp;
		BufferedReader br2 = new BufferedReader(new FileReader("C://workspace_SW/SWStudy/tmp.txt"));
		PrintWriter pw2 = new PrintWriter(new BufferedWriter(new FileWriter("C://workspace_SW/SWStudy/bb.txt", false/* attend */)));
		while ((s = br2.readLine()) != null) {
			pw2.println(s);
		}
		br2.close();
		pw2.close();

	}
}