package Interface;
/*
 * 다중상속 안됨 !  => diamond problem 이 생겨서 안됨 
 * 다중상속 하는 방법    
 * interface : 역할(추상화)
 * 
 * class : 완벽한 설계도
 * interface : 대충 그린 설계정도   (제품의 원형정도의 역할) 
 * 1) 다중상속해결   (implements,구현하다) -상속의역할을함 
 * 2) 함수의 원형   
 * 3) 협업 (메소드는 선언만 ,상부구조?:모든소스의 맨위에 있어야함 /class는하부구조)  
 * 
 * Spring-mybatis 개발시 mybatis 3.x 이후에 mapper interface 로 중요한 역할
 */
/*
 * class class - extends
 * class interface - implements
 * interface interface - extends
 */
interface Uncle { // class가 아닌 interface를 명시
	public void rent_boat(); // implements를 선언
}

interface aunt extends Uncle {
	public void iscoffee();
}

class RichMan {
	public void EarnMoney() {
		System.out.println("돈많이벌었다.");
	}
}

class na extends RichMan implements /*Uncle,*/ aunt { // implements를 선언
	public void Use() {
		System.out.println("많이사자!");
	}

	@Override
	public void iscoffee() {
		System.out.println("커피먹자");
	}

	@Override
	public void rent_boat() {
		System.out.println("보트를빌리자");
	}
}

public class Multiple_Inheritance {
	public static void main(String[] args) {
		na hts = new na();
		hts.EarnMoney();
		hts.Use();
		hts.rent_boat();
		hts.iscoffee();
	}
}