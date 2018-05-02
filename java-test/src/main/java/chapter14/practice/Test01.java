package chapter14.practice;

import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Test;

public class Test01 {

	@Test
	public void test01() {
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 1; i <= 100; i++) {
			list.add(new Integer(i));
		}
		list.remove(list.get(10));
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
