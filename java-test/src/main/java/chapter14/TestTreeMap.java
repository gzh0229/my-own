package chapter14;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {

	@org.junit.Test
	public void test01() {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "lili01");
		tm.put(2, "lili01");
		tm.put(3, null);
		tm.put(4, "lili04");
		tm.put(5, "lili05");
		tm.put(6, "lili06");

		// 如果存在指定 key的键-值对，返回 true
		boolean flag01 = tm.containsKey(3);
		System.out.println(flag01);
		// 如果存在指定 value的键-值对，返回 true
		boolean flag02 = tm.containsValue("lili02");
		System.out.println(flag02);

		// 如果存在指定的 key，则返回对应的值，否则返回 null
		String str = tm.get(5);
		System.out.println(str);

		// 返回所有 key组成的 Set集合
		Set<Integer> set = tm.keySet();
		Iterator<Integer> it01 = set.iterator();
		while (it01.hasNext()) {
			System.out.println(it01.next());
		}

		// 返回所有 value组成的 Collection集合
		Collection<String> co = tm.values();
		Iterator<String> it02 = co.iterator();
		while (it02.hasNext()) {
			System.out.println(it02.next());
		}
	}

}
