package test;

public class Test01 {

	public static void main(String[] args) {
		char a = 'a';
		char z = 'z';
		char A = 'A';
		char Z = 'Z';
		char char01 = '一';
		char char02 = '十';
		char x = (char) (a + Math.random() * (z - a + 1));
		char y = (char) (A + Math.random() * (Z - A + 1));
		char char03 = (char) (char01 + Math.random() * (char02 - char01 + 1));
		System.out.println(x);
		System.out.println(y);
		System.out.println(char03);
	}

}
