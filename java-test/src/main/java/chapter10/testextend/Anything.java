package chapter10.testextend;

public class Anything {
	public Anything() {
		System.out.println("Anything...");
	}

	public static void main(String[] args) {
		Quadrangle q = new Quadrangle();
		Parallelogram p = new Parallelogram();
		Square s = new Square();
		boolean qp = q instanceof Parallelogram;
		boolean qs = q instanceof Square;
		boolean qq = q instanceof Quadrangle;
		boolean pq = p instanceof Quadrangle;
		boolean sq = s instanceof Quadrangle;
		System.out.println(qp);
		System.out.println(qs);
		System.out.println(qq);
		System.out.println(pq);
		System.out.println(sq);
		// 父类对象不是子类的实例，就会抛出
		// ClassCastException异常，所以，向下转型之情需要养成一个好习惯，判断父类对象是否是子类的一个实例
		if (qs) {
			Square s01 = (Square) new Quadrangle();
		}
		if (true) {
			Square s01 = (Square) new Quadrangle();
		}
		// q 不是Anything类的对象，所以这条语句不成立
		// boolean ba = q instanceof Anything;

	}
}
