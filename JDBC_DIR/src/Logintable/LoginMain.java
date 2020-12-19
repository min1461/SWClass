package Logintable;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import TelinfoDTO.TelinfoDAO;
import TelinfoDTO.TelinfoDTO;

public class LoginMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int sel = 0;
		LoginDAO LiDAO = new LoginDAO();
		do {
			System.out.println("비상연락망 관리!!\n\n\n");
			System.out.println("-----------------------------");
			System.out.println("1 : 회원가입");
			System.out.println("2 : 로그인");
			System.out.println("3 : ");
			System.out.println("4 : ");
			System.out.println("5 : 종료");

			System.out.println("-----------------------------");
			System.out.print("이용할 메뉴를 선택하세요 : ");

			Scanner sc = new Scanner(System.in);
			sel = sc.nextInt();

			switch (sel) {
			case 1:
				Scanner sc1 = new Scanner(System.in);
				System.out.print("id=");
				String id = sc1.next();
				System.out.print("password=");
				String password = sc1.next();
				System.out.print("name=");
				String name = sc1.next();
				System.out.print("tel=");
				String tel = sc1.next();

				boolean b1 = LiDAO.signDAO(id, password, name, tel);// 객체.메소드()원리에 의해 4가지 데이터를 입력받음.
				if (b1) {
					System.out.println("회원가입 완료");
				} else {
					System.out.println("회원가입 오류");
				}
				break;

			case 2:
				Scanner sc2 = new Scanner(System.in);
				System.out.print("id=");
				String id2 = sc2.next();
				System.out.print("password=");
				String password2 = sc2.next();

				boolean b2 = LiDAO.LoginDAO(id2, password2);// 객체.메소드()원리에 의해 4가지 데이터를 입력받음.
				if (b2) {
					System.out.println("로그인 완료");
				} else {
					System.out.println("로그인 오류");
				}
				break;

			case 3:
				break;

			case 4:
				break;

			case 5:
				System.out.println("종료합니다");
				LiDAO.ps1Close();
				LiDAO.getAllInfoClose();
				break;

			default:
				System.out.println("해당 메뉴를 확인하고 선택해주세요.");
				break;

			}
		} while (sel != 5);
	}
}
