package chapter14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

public class TestCollection {

	@Test
	public void test01() {
		Collection<String> list = new ArrayList<>();
		// 向集合中添加元素
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		// .isEmpty()返回 boolean类型，判断集合是否为空
		System.out.println(list.isEmpty());
		// 从集合中移除元素
		list.remove("c");
		// .size()返回 int类型，获取集合中元素的个数
		System.out.println(list.size());
		// .iterator()返回 list集合的迭代器
		Iterator<String> it = list.iterator();
		// .hasNext()，如果有下一个元素，返回 true，否则返回 false
		while (it.hasNext()) {
			// .next()返回下一个元素
			System.out.println(it.next());
		}
	}

}
