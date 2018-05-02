package chapter14.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test03 {

	@org.junit.Test
	public void test01() {
		Map<Integer, Test> map = new HashMap<>();
		Test t01 = new Test(11, "lili01");
		Test t02 = new Test(22, "lili02");
		Test t03 = new Test(33, "lili03");
		Test t04 = new Test(44, "lili04");
		Test t05 = new Test(55, "lili05");
		map.put(t01.getId(), t01);
		map.put(t02.getId(), t02);
		map.put(t03.getId(), t03);
		map.put(t04.getId(), t04);
		map.put(t05.getId(), t05);
		map.remove(33);
		Collection<Test> co = map.values();
		Iterator<Test> it = co.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		for (Test t : co) {
			System.out.println(t);
		}
	}

}
