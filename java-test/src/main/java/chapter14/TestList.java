package chapter14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * List集合是有序的，允许元素重复，允许 null值
 */
public class TestList {

	// ArrayList，随机查询快，增、删、改慢
	@org.junit.Test
	public void testArrayList() {
		List<Test> list = new ArrayList<>();
		Test t01 = new Test("a");
		Test t02 = new Test("b");
		Test t03 = new Test("c");
		Test t04 = new Test("d");
		System.out.println(list.add(t01));
		System.out.println(list.add(t01));
		System.out.println(list.add(t02));
		System.out.println(list.add(t03));
		System.out.println(list.add(t04));
		System.out.println(list.add(null));
		int index = (int) (list.size() * Math.random());
		// .get(int index)，获取指定索引位置的元素
		Test t = list.get(index);
		System.out.println(t);
		System.out.println(list.remove(2));
		System.out.println(list.size());
		Test t05 = new Test("e");
		// .set(int index, Test element)，替换指定索引位置的元素为指定元素
		list.set(0, t05);
		// 集合的索引也是从0开始
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	// LinkedList，随机查询慢，增、删、改快
	@org.junit.Test
	public void testLinkedList() {
		List<Test> list = new LinkedList<>();
		Test t01 = new Test("a");
		Test t02 = new Test("b");
		Test t03 = new Test("c");
		Test t04 = new Test("d");
		list.add(t01);
		list.add(t02);
		list.add(t02);
		list.add(t04);
		list.add(null);
		Iterator<Test> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
