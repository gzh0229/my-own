package chapter17.generictype;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * 泛型，参数化类型，指定元素类型
 */
public class Test01 {

	/*
	 * 声明集合时不指定元素类型
	 */
	@Test
	public void test01() {
		List list = new ArrayList();
		Student s01 = new Student();
		Student s02 = new Student();
		Student s03 = new Student();
		list.add(s01);
		list.add(s02);
		list.add(s03);
		// 可以随意添加不同类型的元素，编译器不会报错，在强制转换时容易发生
		// ClassCastException类型转换异常
		list.add(123);
		for (int i = 0; i < list.size(); i++) {
			// 放入对象后，集合就会“忘记”这个对象的数据类型，取出该对象时该对象就变成了 Object类型，需对其进行强制转换
			Student str = (Student) list.get(i);
		}
	}

	/*
	 * 声明集合时指定元素类型
	 */
	@Test
	public void test02() {
		List<Student> list = new ArrayList<Student>();
		Student s01 = new Student();
		Student s02 = new Student();
		Student s03 = new Student();
		list.add(s01);
		list.add(s02);
		list.add(s03);
		// 只可添加指定类型的元素，否则编译器会报错
		// list.add(123);
		for (int i = 0; i < list.size(); i++) {
			// 取出元素时无需进行类型转换
			Student str = list.get(i);
		}

	}
}
