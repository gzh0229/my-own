package chapter07;

public class Practice03 {

	private double length;
	private double width;

	public Practice03() {
		length = 10;
		width = 3;
	}

	public double getArea() {
		double area = length * width;
		return area;
	}

	public static void main(String[] args) {
		Practice03 p = new Practice03();
		System.out.println(p.getArea());
	}

}
