package MyRoom;	// 내 방 내 패키지

import java.util.Date;	//	다른 패키지 안에 있는 클래스를 가져오는 역할

public class Hello {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date d1 = new Date();
		int n1 = 1002;
		double n2 = Math.PI;
		// Ctrl + shift + o (여러개의 클래스를 한번에 가져올수 있음 / Ctrl + space보다 빠름)
		System.out.println(d1.toLocaleString());
		System.out.println("날짜 출력 끝");
		System.out.printf("%d번버스타고 집에간다.",n1);
		System.out.println();
		System.out.println(n1+"번버스타고 집에간다.");
		System.out.printf("파이값은 %.2f이다\n",n2);		//	%.2f = float값을 소수점 2번째까지 출력
		System.out.println("파이값은 "+ n2 +"이다.");	//	double값의 범위까지 출력
	}
}
// Ctrl + Shift + L : 단축키 리스트
// Ctrl + shift + O (여러개의 클래스를 한번에 가져올수 있음 / Ctrl + space보다 빠름)