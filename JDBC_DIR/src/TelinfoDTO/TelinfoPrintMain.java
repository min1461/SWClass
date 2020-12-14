package TelinfoDTO;

import java.sql.SQLException;
import java.util.Scanner;

public class TelinfoPrintMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int sel = 0;
		TelinfoDAO tiDAO = new TelinfoDAO();
		do {
			System.out.println("비상연락망 관리!!\n\n\n");
			System.out.println("-----------------------------");
			System.out.println("1 : 한명입력");
			System.out.println("2 : 전체출력");
			System.out.println("3 : 종료");
			System.out.println("-----------------------------");
			System.out.print("이용할 메뉴를 선택하세요 : ");

			Scanner sc = new Scanner(System.in);
			sel = sc.nextInt();

			switch (sel) {
			case 1:
				Scanner sc1 = new Scanner(System.in);
				System.out.print("id=");
				int id = sc1.nextInt();
				System.out.print("name=");
				String name = sc1.next();
				System.out.print("tel=");
				String tel = sc1.next();
				System.out.print("telDate=");
				String sDate = sc1.next();

				boolean b1 = tiDAO.insert_nametel(id, name, tel, sDate);// 객체.메소드()원리에 의해 4가지 데이터를 입력받음.
				if (b1) {
					System.out.println("insert ok");
				} else {
					System.out.println("insert error");
				}
				break;

			case 3:
				System.out.println("종료합니다");
				tiDAO.ps1Close();
				tiDAO.getAllInfoClose();
				break;
			default:
				System.out.println("해당 메뉴를 확인하고 선택해주세요.");
				break;

			}
		} while (sel != 3);
	}
}