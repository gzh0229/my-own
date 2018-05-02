package chapter14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet集合是无序的，不允许重复元素，允许 null
public class TestHashSet {

	@org.junit.Test
	public void test01() {
		Set<Test> set = new HashSet<>();
		Test t01 = new Test("a");
		Test t02 = new Test("b");
		Test t03 = new Test("c");
		Test t04 = new Test("d");
		set.add(t01);
		set.add(t02);
		set.add(t03);
		set.add(t04);
		set.add(null);
		Iterator<Test> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
