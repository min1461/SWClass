package Extends;

class parents {
	protected int diamond;

	public void money() {
		System.out.println("나돈많다.");
	}
}

class child extends parents {
	public void car() {
		diamond = 3;
		System.out.println("중형차있음");
	}

}