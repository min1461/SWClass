package Data;

import java.awt.event.MouseAdapter;

public class TestMouse extends MouseAdapter{
	protected int x;
	protected int y;
	public TestMouse(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
