package chapter07.testmodifier;

/*
 * 同包子类
 */
public class TestModifier02 extends Modifier {

	public static void main(String[] args) {
		Modifier m = new Modifier();
		m.testPublic();
		m.testProtected();
		m.testDefault();
		// m.testPrivate();
	}

}
