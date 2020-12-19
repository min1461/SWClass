package TelinfoDTO;

import java.sql.SQLException;
import java.util.ArrayList;
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
			System.out.println("3 : 한명수정");
			System.out.println("4 : 한명삭제");
			System.out.println("5 : 종료");

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

			case 2: // 전체 출력 // 객체단위로 취급, 개개의 필드로 취급할거냐?
					// db=====> 객체=====> 컬렉션에 저장 (컴을 off하지 않는 한 메모리에 남아있다)
				ArrayList<TelinfoDTO> tiaArray2 = tiDAO.getAllInfo();

				for (TelinfoDTO imsi : tiaArray2) {
					System.out.println(imsi.getId());
					System.out.println(imsi.getName());
					System.out.println(imsi.getTel());
					System.out.println(imsi.getD());
					// 날짜 : 자바날짜면 util, db 날짜면 sql
				}
				break;

			case 3:
				Scanner sc2 = new Scanner(System.in);
				System.out.print("수정할 id=");
				int id1 = sc2.nextInt();
				System.out.print("수정될 name=");
				String name1 = sc2.next();
				System.out.print("수정될 tel=");
				String tel1 = sc2.next();
				System.out.print("수정될 telDate=");
				String sDate1 = sc2.next();

				boolean b2 = tiDAO.update_nametel(id1, name1, tel1, sDate1);// 객체.메소드()원리에 의해 4가지 데이터를 입력받음.
				if (b2) {
					System.out.println("update ok");
				} else {
					System.out.println("update error");
				}
				break;

			case 4:
				Scanner sc3 = new Scanner(System.in);
				System.out.print("삭제할 id=");
				int id2 = sc3.nextInt();

				boolean b3 = tiDAO.delete_row(id2);// 객체.메소드()원리에 의해 4가지 데이터를 입력받음.
				if (b3) {
					System.out.println("delete ok");
				} else {
					System.out.println("delete error");
				}
				break;

			case 5:
				System.out.println("종료합니다");
				tiDAO.ps1Close();
				tiDAO.getAllInfoClose();
				break;
				
			default:
				System.out.println("해당 메뉴를 확인하고 선택해주세요.");
				break;

			}
		} while (sel != 5);
	}
}