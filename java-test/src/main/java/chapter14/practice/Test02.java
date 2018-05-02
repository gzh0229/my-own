package chapter14.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Test02 {

	@Test
	public void test01() {
		List<String> list = new ArrayList<>();
		System.out.println(list.add("A"));
		System.out.println(list.add("a"));
		System.out.println(list.add("c"));
		System.out.println(list.add("C"));
		System.out.println(list.add("a"));
		System.out.println(list);

		Set<String> set = new HashSet<>();
		System.out.println(set.add("A"));
		System.out.println(set.add("a"));
		System.out.println(set.add("c"));
		System.out.println(set.add("C"));
		System.out.println(set.add("a"));
		System.out.println(set);
	}

}
