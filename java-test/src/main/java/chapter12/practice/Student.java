package chapter12.practice;

public class Student {

	public void speak(int x) throws MyException {
		if (x > 1000) {
			throw new MyException("参数不能大于1000");
		}
	}

	public static void main(String[] args) {
		Student s = new Student();
		try {
			s.speak(1001);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

}
