package chapter14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//TestHashMap，key不允许重复，value允许 null值
public class TestHashMap {

	@org.junit.Test
	public void test01() {
		HashMap<Integer, String> map01 = new HashMap<>();
		map01.put(1, "lili01");
		map01.put(2, "lili01");
		map01.put(3, null);
		map01.put(4, "lili04");
		map01.put(5, "lili05");
		map01.put(6, "lili06");

		// 如果存在指定 key的键-值对，返回 true
		boolean flag01 = map01.containsKey(3);
		System.out.println(flag01);
		// 如果存在指定 value的键-值对，返回 true
		boolean flag02 = map01.containsValue("lili02");
		System.out.println(flag02);

		// 如果存在指定的 key，则返回对应的值，否则返回 null
		String str = map01.get(5);
		System.out.println(str);

		// 返回所有 key组成的 Set集合
		Set<Integer> set = map01.keySet();
		Iterator<Integer> it01 = set.iterator();
		while (it01.hasNext()) {
			System.out.println(it01.next());
		}

		// 返回所有 value组成的 Collection集合
		Collection<String> co = map01.values();
		Iterator<String> it02 = co.iterator();
		while (it02.hasNext()) {
			System.out.println(it02.next());
		}
	}

}
