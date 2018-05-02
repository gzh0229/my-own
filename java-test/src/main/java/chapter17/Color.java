package chapter17;

/*
 * 枚举类是一种特殊的 class类，所有枚举类都继承了 java.lang.Enum 类，枚举类也有构造方法、方法和变量
 * public abstract class Enum<E extends Enum<E>>
 * 理解枚举类、枚举类型，可以参考 String类
 * 优势：枚举类定义了某种数据类型所有可能出现的值，提供了一种用户友好的变量定义方法，可以理解为自定义了一种数据类型
 */
public enum Color {

	// 所有枚举值都默认是 public static final 的常量
	RED(255, 0, 0), BLUE(0, 0, 255), YELLOW(255, 255, 0), GREEN(0, 255, 0);

	// 变量可以定义成 public或 private，定义成 private为了封装
	private int redValue;
	private int greenValue;
	private int buleValue;

	// 构造方法只能是 private，只在构造枚举值时被调用
	private Color(int redValue, int greenValue, int buleValue) {
		this.redValue = redValue;
		this.greenValue = greenValue;
		this.buleValue = buleValue;
	}

	// 方法可以定义为 public
	@Override
	public String toString() {
		return super.toString() + "(" + redValue + ", " + greenValue + ", " + buleValue + ")";
	}

}
