package chapter07.testmodifier;

/*
 * 同包
 */
public class TestModifier01 {

	public static void main(String[] args) {
		Modifier m = new Modifier();
		m.testPublic();
		m.testProtected();
		m.testDefault();
		// m.testPrivate();
	}

}
