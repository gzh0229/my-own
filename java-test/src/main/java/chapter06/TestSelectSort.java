package chapter06;

public class TestSelectSort {

	public static void main(String[] args) {
		int[] x = { 63, 4, 24, 1, 3, 15 };
		TestSelectSort ts = new TestSelectSort();
		ts.showArray(ts.sort(x));
	}

	public int[] sort(int[] x) {
		int index;
		for (int i = 0; i < x.length - 1; i++) {
			index = 0;
			for (int j = 0; j < x.length - 1 - i; j++) {
				if (x[index] < x[j + 1]) {
					index = j + 1;
				}
			}
			int temp = x[index];
			x[index] = x[x.length - 1 - i];
			x[x.length - 1 - i] = temp;
		}
		return x;
	}

	public void showArray(int[] x) {
		for (int i : x) {
			System.out.print(i + "\t");
		}
	}

}
