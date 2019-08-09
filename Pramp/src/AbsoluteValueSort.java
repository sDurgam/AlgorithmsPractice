package src;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class AbsoluteValueSort {
	// Time: O(NlogN), Space:(N)
	static int[] absSort(int[] arr) {
		if (arr == null)
			return arr;
		int len = arr.length;
		List<Integer> copyList = new ArrayList<Integer>();
		for (int i = 0; i < len; i++) {
			copyList.add(arr[i]);
		}
		Comparator<Integer> absComparaor = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int i1 = Math.abs(o1);
				int i2 = Math.abs(o2);
				if (i1 < i2)
					return -1;
				if (i1 == i2)
					return o1 - o2;
				return 0;
			}
		};
		Collections.sort(copyList, absComparaor);
		int[] result = new int[len];
		for (int i = 0; i < len; i++) {
			result[i] = copyList.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 0, -2, -2, 2, -7 };
		absSort(arr);
	}
}
