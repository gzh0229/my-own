package chapter14;

public class Test {

	public Test() {

	}

	public Test(String str) {
		this.y = str;
	}

	@Override
	public String toString() {
		return y;
	}

	private int x;
	private String y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

}
