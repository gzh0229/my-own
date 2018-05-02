package chapter10;

public class Quadrangle01 {

	public void draw(Quadrangle01 q) {

	}

	public static void main(String[] args) {
		Quadrangle01 q = new Quadrangle01();
		q.draw(new Square());
		q.draw(new Parallelogramgle());
	}

}

// 内部类
class Square extends Quadrangle01 {
	public Square() {
		System.out.println("正方形");
	}
}

// 内部类
class Parallelogramgle extends Quadrangle01 {
	public Parallelogramgle() {
		System.out.println("平行四边形");
	}
}
