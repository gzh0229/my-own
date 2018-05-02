package chapter14;

import java.util.Iterator;
import java.util.TreeSet;

//使用 TreeSet必须实现 Comparable接口，TreeSet不允许 null值
public class TestTreeSet implements Comparable<Object> {

	// TreeSet集合在遍历集合时默认按照自然顺序递增排序，也可以按照 compareTo比较器中定义的顺序排序
	@Override
	public int compareTo(Object o) {
		TestTreeSet ts = (TestTreeSet) o;
		int result = this.id > ts.id ? 1 : (this.id == ts.id ? 0 : -1);
		return result;
	}

	public TestTreeSet(String name, long id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "TestTreeSet [name=" + name + ", id=" + id + "]";
	}

	String name;
	long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public static void main(String[] args) {
		TestTreeSet tts01 = new TestTreeSet("lili01", 1001);
		TestTreeSet tts02 = new TestTreeSet("lili02", 1002);
		TestTreeSet tts03 = new TestTreeSet("lili03", 1003);
		TestTreeSet tts04 = new TestTreeSet("lili04", 1004);
		TreeSet<TestTreeSet> set = new TreeSet<>();
		set.add(tts03);
		set.add(tts02);
		set.add(tts01);
		set.add(tts04);
		Iterator<TestTreeSet> it = set.iterator();
		while (it.hasNext()) {
			TestTreeSet tts = (TestTreeSet) it.next();
			System.out.println(tts.getName() + "\t" + tts.getId());
		}

		// 返回第一个元素
		TestTreeSet tts05 = set.first();
		System.out.println(tts05);
		// 返回最后一个元素
		TestTreeSet tts06 = set.last();
		System.out.println(tts06);

		// 返回由指定元素（不包含）之前的所有元素组成的一个新 SortedSet集合
		TreeSet<TestTreeSet> set03 = (TreeSet<TestTreeSet>) set.headSet(tts04);
		Iterator<TestTreeSet> it02 = set03.iterator();
		while (it02.hasNext()) {
			TestTreeSet tts = (TestTreeSet) it02.next();
			System.out.println(tts.getName() + "\t" + tts.getId());
		}

		// 返回两个指定元素（含第一个，不含第二个）之间的所有元素组成的一个新 SortedSet集合
		TreeSet<TestTreeSet> set04 = (TreeSet<TestTreeSet>) set.subSet(tts02, tts04);
		Iterator<TestTreeSet> it03 = set04.iterator();
		while (it03.hasNext()) {
			TestTreeSet tts = (TestTreeSet) it03.next();
			System.out.println(tts.getName() + "\t" + tts.getId());
		}

		System.out.println("------------------------------");

		// 返回由指定元素（包含）之后的所有元素组成的一个新 SortedSet集合
		TreeSet<TestTreeSet> set05 = (TreeSet<TestTreeSet>) set.tailSet(tts03);
		Iterator<TestTreeSet> it04 = set05.iterator();
		while (it04.hasNext()) {
			TestTreeSet tts = (TestTreeSet) it04.next();
			System.out.println(tts.getName() + "\t" + tts.getId());
		}

		TreeSet<Integer> set02 = new TreeSet<>();
		set02.add(3);
		set02.add(2);
		set02.add(1);
		set02.add(4);
		System.out.println(set02);
	}

}
