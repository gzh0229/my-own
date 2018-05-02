package chapter07.testmodifier;

/*
 * 本类
 */
public class Modifier {

	// 缺省的
	void testDefault() {
		System.out.println("testDefault()...");
	}

	// 公有的
	public void testPublic() {
		System.out.println("testPublic()...");
	}

	// 受保护的
	protected void testProtected() {
		System.out.println("testProtected()...");
	}

	// 私有的
	private void testPrivate() {
		System.out.println("testPrivate()...");
	}

	public static void main(String[] args) {

		Modifier m = new Modifier();
		m.testPublic();
		m.testProtected();
		m.testDefault();
		m.testPrivate();
	}

}
