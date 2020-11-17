package Extends;

class parents {
	int diamond;

	public void money() {
		System.out.println("나돈많다.");
	}
	public void car() {
		System.out.println("에쿠스");
	}
}

class child extends parents {
	public void car() {
		diamond = 3;
		System.out.println("아우디");
	}
}